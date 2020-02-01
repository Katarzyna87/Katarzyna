package pl.sda.javakrk25.practising;

public class Ex_27_binaryDecimalConverter {


    /**
     * Napisać metody konwertujące pomiędzy systemem binarnym i dziesiętnym
     *
     * @param args
     */
    public static void main(String[] args) {
        int decimalValue = binaryStringToDecimalInt("1010111");
        String originalBinary = numberToBinaryString(decimalValue);
        System.out.println(originalBinary);

    }

    private static String numberToBinaryString(int decimalValue) {
        String output = "";
        while (decimalValue > 0) {
            output = (decimalValue % 2) + output;
            decimalValue /= 2;
        }
        return output;
    }


    public static int binaryStringToDecimalInt(String str) {
        char[] digits = str.toCharArray();
        int exp = digits.length - 1;
        int liczba = 0;
        for (char c : digits) {
            int i = Integer.parseInt(String.valueOf(c));
            liczba += Math.pow(2, exp) * i;
            exp--;
        }
        return liczba;
    }
}
