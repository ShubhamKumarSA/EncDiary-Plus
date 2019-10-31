
import java.util.Base64;
//import java.util.Random;

public class EncryptionDecryption {
    
    //Random rnd=new Random();
    public String encryptFile(String plain) {
        String b64encoded = Base64.getEncoder().encodeToString(plain.getBytes());

        String reverse = new StringBuffer(b64encoded).reverse().toString();
        StringBuilder tmp = new StringBuilder();
        ////Random Offset
        final int OFFSET=4;//rnd.nextInt((30 - 10) + 1) + 10;
        /////////////////
        
        for (int i = 0; i < reverse.length(); i++) {
            tmp.append((char) (reverse.charAt(i) + OFFSET));
        }
        return tmp.toString();
    }

    public String decryptFile(String secret) {
        StringBuilder tmp = new StringBuilder();
        ////Random Offset
        final int OFFSET=4;//rnd.nextInt((10 - 1) + 1) + 1;
        /////////////////
        for (int i = 0; i < secret.length(); i++) {
            tmp.append((char) (secret.charAt(i) - OFFSET));
        }

        String reversed = new StringBuffer(tmp.toString()).reverse().toString();
        return new String(Base64.getDecoder().decode(reversed));
    }
}
