
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class FTPUpload {

    /*Making files and directories*/
    String workingDirectory = System.getProperty("user.dir");
    File dir = new File(workingDirectory + File.separator + "EncDiary Plus" + File.separator + "Config");
    File file = new File(dir + File.separator + "FTP_Config.sys");
    boolean okFlag = false;
    private String fhost, fuser, fpass, ftpdir;

    /**
     * **************************
     */
    public FTPUpload() {
        if (dir.isDirectory() && file.isFile()) {
            try {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                String temp = br.readLine();
                br.close();
                EncryptionDecryption ED = new EncryptionDecryption();
                temp = ED.decryptFile(temp);
                if (temp == null) {
                    okFlag = false;
                } else {
                    fhost = temp.substring(temp.indexOf("<H>") + 3, temp.indexOf("</H>"));
                    fuser = temp.substring(temp.indexOf("<U>") + 3, temp.indexOf("</U>"));
                    fpass = temp.substring(temp.indexOf("<P>") + 3, temp.indexOf("</P>"));
                    ftpdir = temp.substring(temp.indexOf("<F>") + 3, temp.indexOf("</F>"));
                    okFlag = true;
                }
            } catch (Exception ex) {
                javax.swing.JOptionPane.showMessageDialog(null, ex.toString());
            }
        }
    }

    private static final int BUFFER_SIZE = 4096;
    private final String dhost = "";
    private final String duser = "";
    private final String dpass = "";

    public int Execute(File temp) {
        String ftpUrl = "ftp://%s:%s@%s/%s;type=i";
        String filePath = temp.toString();
        String uploadPath;
        if (okFlag == true) {
            uploadPath = ftpdir + temp.getName();
            ftpUrl = String.format(ftpUrl, fuser.trim(), fpass.trim(), fhost.trim(), uploadPath);
        } else {
            uploadPath = "/encdiary.shubhamkumarsa.com/htdocs/user_files/" + temp.getName();
            ftpUrl = String.format(ftpUrl, duser, dpass, dhost, uploadPath);
        }
        try {
            URL url = new URL(ftpUrl);
            URLConnection conn = url.openConnection();
            OutputStream outputStream = conn.getOutputStream();
            FileInputStream inputStream = new FileInputStream(filePath);
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead = -1;
            while ((bytesRead = inputStream.read(buffer)) != -1) {

                outputStream.write(buffer, 0, bytesRead);

            }
            inputStream.close();
            outputStream.close();

        } catch (IOException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Oops! Backup failed!\nPlease check your internet connection and try again.\nOther Reasons:\n1. Hostname cannot be retrieved.\n2. Incorrect username and/or password.\n3. Host server refused to connect.\n4. FTP folder is invalid or doesn't exist.\netc.");
            return 0;
        }
        return 1;
    }
}
