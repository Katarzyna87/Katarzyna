package pl.sda.javakrk25.practising;

public class Ex_26_silnia {

    /**
     * Napisz funkcję, która liczy silnię z podabego parametru
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(factorial(6));
    }

    public static long factorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
