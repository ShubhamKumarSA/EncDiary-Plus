
import java.net.URL;
import java.net.URLConnection;

public class MainClass {

    public static int netConnection() {
        try {
            URL url = new URL("https://www.google.com");
            URLConnection connection = url.openConnection();
            connection.connect();
            return 1;
        } catch (Exception ex) {
            return 0;
        }
    }

    public static void main(String[] args) {
        int res = netConnection();
        SplashScreen SS = new SplashScreen();
        if (res == 1) {
            SS.lblNet.setVisible(false);
        }
        SS.setVisible(true);
    }

}
