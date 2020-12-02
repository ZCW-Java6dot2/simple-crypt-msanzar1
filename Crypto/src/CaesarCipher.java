import javax.swing.*;

public class CaesarCipher extends ROT13{
    private int shift;



    public String encrypt(String text, int shift) throws UnsupportedOperationException{
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length() ; i++) {
            if (Character.isUpperCase(text.charAt(i))){
                char ch = (char) (((int)text.charAt(i) +
                        shift - 65) % 26 + 65);
                result.append(ch);
            } else if (Character.isLowerCase(text.charAt(i))) {
                char ch = (char) (((int)text.charAt(i) +
                        shift - 97) % 26 + 97);
                result.append(ch);
            } else {
                result.append(text.charAt(i));
            }

        }
        return result.toString();
    }
}
