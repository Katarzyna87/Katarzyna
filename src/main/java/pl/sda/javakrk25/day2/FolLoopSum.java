package pl.sda.javakrk25.day2;

import java.util.Scanner;

public class FolLoopSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 3; ++i) {
            System.out.println(String.format("Podaj %d. liczbę:", (i + 1)));
            sum += scanner.nextInt();
        }//*TEST - CHanges//*test changes
        System.out.println("Suma liczb podanych przez użytkownika:" + sum);
    }
}//commit commit
