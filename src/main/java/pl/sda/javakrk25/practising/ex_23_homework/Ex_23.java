package pl.sda.javakrk25.practising.ex_23_homework;

public class Ex_23 {

    /**
     * Zdefiniować funkcję int strToInt(String str) , która zamienia liczbę całkowitą zapisaną w postaci
     * łańcucha na liczbę całkowitą typu int. Funkcja powinna przerywać konwersję w momencie napotkania
     * pierwszego znaku nie należącego do zapisu liczby, zatem np. dla strToInt("-13krowa") wynikiem powinno być -13
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(anyStringtoInt("145900lovekrove"));
        System.out.println(strToIntBinary("101010110"));
    }

    public static int anyStringtoInt(String str) {
        char[] chars = str.toCharArray();
        String digits = "";
        for (char a : chars) {
            if (Character.isDigit(a)) {
                digits += a;
            }
        }
        int liczba = strToInt(digits);
        if (str.startsWith("-")) {
            return liczba * -1;
        } else {
            return liczba;
        }

    }

    public static int strToIntBinary(String str) {
        char[] digits = str.toCharArray();
        int exp = digits.length - 1;
        int liczba = 0;
        for (char c : digits) {
            int i = Integer.valueOf(String.valueOf(c));
            liczba += Math.pow(2, exp) * i;
            exp--;
        }
        return liczba;
    }

    public static int strToInt(String str) {
        char[] digits = str.toCharArray();
        int exp = digits.length - 1;
        int liczba = 0;
        for (char c : digits) {
            int i = Integer.valueOf(String.valueOf(c));
            liczba += Math.pow(10, exp) * i;
            exp--;
        }
        return liczba;

    }
}
