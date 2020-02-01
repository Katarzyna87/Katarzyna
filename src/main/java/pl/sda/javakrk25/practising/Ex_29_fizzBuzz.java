package pl.sda.javakrk25.practising;

public class Ex_29_fizzBuzz {

    /**
     * Symulacja gry w Fixx&Buzz
     *
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 1; i < 50; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("Fizz, Buzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }

    }

}
