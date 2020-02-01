package pl.sda.javakrk25.practising.ex_21_homework;

import java.util.Scanner;

public class Ex_21 {

    /**
     * Pobieramy liczbę od użytkownika
     * obliczamy sumę cyfr
     * obliczamy osobno sumę cyfr parzystych i nieparzystych
     * obliczamy stosunek średniej arytmetycznej liczb parzystych od nieparzystych
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int liczba = scanner.nextInt();
        String slowo = liczba + "";
        char[] tablica = slowo.toCharArray();
        int suma = 0;
        int sumapaz = 0;
        int sumaniepz = 0;
        int iloscnp = 0;
        int iloscp = 0;
        for (char c : tablica) {
            int i = Integer.valueOf(String.valueOf(c));
            suma = suma + i;
            if (i % 2 == 0) {
                sumapaz += i;
                iloscp++;
            } else {
                sumaniepz += i;
                iloscnp++;
            }
        }
        int sredniap = sumapaz / iloscp;
        int srednianp = sumaniepz / iloscnp;
        System.out.println(String.format("Suma cyfr:%d", suma));
        System.out.println(String.format("Suma cyfr parzystych :%d srednia:%d  ", sumapaz, sredniap));
        System.out.println(String.format("Suma cyfr neiparzystych :%d srednia:%d ", sumaniepz, srednianp));
    }
}
