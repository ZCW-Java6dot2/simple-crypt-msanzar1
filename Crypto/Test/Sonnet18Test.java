import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Sonnet18Test {

    @Test
    public void sonnet18Test() throws IOException {
        ROT13 testSonnet = new ROT13();
        String inputFile = "sonnet18.txt";
        String fileEncrypt = "sonnet18.enc";
        String fileDecrypt = "sonnet18.dec";//created instance of class


        testSonnet.encryptFile(new File(inputFile), new File(fileEncrypt));
        testSonnet.encryptFile(new File(fileEncrypt), new File(fileDecrypt));

        BufferedReader original = new BufferedReader(new FileReader(inputFile));
        BufferedReader decrypted = new BufferedReader(new FileReader(fileDecrypt));

        String originalLine;
        String decryptedLine;

        while ((originalLine = original.readLine()) != null){
            decryptedLine = decrypted.readLine();
            Assert.assertEquals(originalLine,decryptedLine);
        }





    }
}
