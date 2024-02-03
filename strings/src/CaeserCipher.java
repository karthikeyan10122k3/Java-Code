package com.kar.practice.exercise.strings.src;

//Julius Caesar protected his confidential information by encrypting it using a cipher.
// Caesar's cipher shifts each letter by a number of letters.
// If the shift takes you past the end of the alphabet, just rotate back to the front of the alphabet.
//          Original alphabet:    abcdefghijklmnopqrstuvwxyz
//        Alphabet rotated +3:    defghijklmnopqrstuvwxyzabc

public class CaeserCipher {
    public static void main(String[] args) {

        System.out.println(toCaesarCipher("mi-RTYIndk",5));
        System.out.println(toCaesarCipher("js'jldf",7));
        System.out.println(toCaesarCipher("k-YZbealk",3));

    }
    public static StringBuilder toCaesarCipher(String str, int k) {
        StringBuilder toCaesarCipherText = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ((ch >= 'A' && ch <= 'Z')) {
                int a = 'A' + (ch - 'A' + k) % 26;
                toCaesarCipherText.append((char) a);
            } else if (ch >= 'a' && ch <= 'z') {
                int a = 'a' + (ch - 'a' + k) % 26;
                toCaesarCipherText.append((char) a);
            } else {
                toCaesarCipherText.append(ch);
            }
        }
        return toCaesarCipherText;
    }

}
