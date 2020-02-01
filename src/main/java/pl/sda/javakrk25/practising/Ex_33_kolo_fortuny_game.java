package pl.sda.javakrk25.practising;

import java.util.HashSet;
import java.util.Set;

public class Ex_33_kolo_fortuny_game {

    /**
     * Napisać program, który odkrywa przed użytkownikiem litery słowa przez niego wpisane.
     * Program kończy się, gdy użytkownik wpisze poprawnie hasło
     *
     * @param args
     */
    public static void main(String[] args) {
        Set<Character> userGuess = new HashSet<>();
        String userInput = "";
        String text = "stokrotka";

        do {
            show(userGuess, text);
            userInput = ScannerUtil.readUserInput();
            if (userInput.length() == 1) {
                userGuess.add(userInput.charAt(0));
            }
        } while (!userInput.equals(text));
        System.out.println("Congrats you win nothing");
    }

    public static void show(Set<Character> userGuess, String text) {
        for (char c : text.toCharArray()) {
            if (userGuess.contains(c)) {
                System.out.print(c);
            } else {
                System.out.print("_");
            }
            System.out.print(" ");
        }
        System.out.println();
    }
}
