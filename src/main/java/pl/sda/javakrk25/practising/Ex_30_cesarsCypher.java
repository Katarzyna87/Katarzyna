package pl.sda.javakrk25.practising;

public class Ex_30_cesarsCypher {

    static final int OFFSET = 3;

    /**
     * Korzystając z szyfru Cezara, napisz metody do szyforwania i deszyfrowania tekstu
     *
     * @param args
     */

    public static void main(String[] args) {
        String text = "we are the champions";
        String encoded = encode(text);
        System.out.println(encoded);
        System.out.println(decode(encoded));
    }


    public static String encode(String content) {
        return shiftText(content, OFFSET);
    }

    public static String decode(String secret) {
        return shiftText(secret, -OFFSET);
    }

    public static String shiftText(String text, int shift) {
        char[] textArray = text.toCharArray();
        String decodedText = "";

        for (char i : textArray) {
            i += shift;
            decodedText += i;
        }
        return decodedText;
    }

}
