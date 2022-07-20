package cipher;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {
    Integer shift;
    private final String alphabet = "abcdefghijklmnopqrstuvwxyz";

    ROT13(Character cs, Character cf) {
        shift = alphabet.indexOf(cf) - alphabet.indexOf(cs);
    }

    ROT13() {
        shift = 13;
    }


    public String crypt(String text) throws UnsupportedOperationException {
        StringBuilder crypt = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                if (Character.isLowerCase(text.charAt(i))) {
                    crypt.append(alphabet.charAt((alphabet.indexOf(text.charAt(i)) + shift) % 26));
                } else { // char is uppercase
                    crypt.append(alphabet.toUpperCase().charAt((alphabet.toUpperCase().indexOf(text.charAt(i)) + shift) % 26));
                }
            } else {
                crypt.append(text.charAt(i));
            }
        }
        return crypt.toString();
    }

    public String encrypt(String text) {
        return text;
    }

    public String decrypt(String text) {
        return text;
    }

    public static String rotate(String s, Character c) {
        int rotation = s.indexOf(c);
        return s.substring(rotation) + s.substring(0, rotation);
    }

}