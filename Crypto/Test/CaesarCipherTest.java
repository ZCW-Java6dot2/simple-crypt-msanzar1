import org.junit.Assert;
import org.junit.Test;

public class CaesarCipherTest {

    @Test
    public void caesarCipherTest(){
        CaesarCipher cipherTest = new CaesarCipher();
        String text = "hello world advaojdvav dpsdgoj";
        String expected = "spwwz hzcwo loglzuoglg oadorzu";

        String actual = cipherTest.encrypt(text, 11);

        Assert.assertEquals(expected,actual);


    }
}
