package pl.sda.javakrk25.practising.ex_24_homework;

import java.util.Scanner;

public class Ex_24 {

    /**
     * Napisać program, który wczytuje liczby podawane przez użytkownika dotąd,
     * dopóki nie podana zostanie liczba 0. Następnie wyświetlić sumę wszystkich podanych liczb.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(sumOfGivenNumber());
    }

    public static double sumOfGivenNumber() {
        double sumOfGivenNumber = 0.0;
        double givenNumber;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("enter number: ");
            givenNumber = scanner.nextDouble();
            sumOfGivenNumber += givenNumber;
        } while (givenNumber != 0);

        return sumOfGivenNumber;
    }
}
