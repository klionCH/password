package sl.bbw.ch;
import java.util.Scanner;

public class InputScanner {

    public static int lengthInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie lang soll das Passwort sein?");
        int length = 0;

        try {
            length = scanner.nextInt();
            if (length <= 0) {
                System.out.println("Die Länge muss größer als 0 sein.");
                length = lengthInput();
            }
        } catch (Exception e) {
            System.out.println("Ungültige Eingabe. Bitte geben Sie eine Zahl ein.");
            scanner.next();
            length = lengthInput();
        }
        return length;
    }

    public static int optionInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welche Option soll verwendet werden?");
        System.out.println("1: Nur Buchstaben");
        System.out.println("2: Buchstaben und Zahlen");
        System.out.println("3: Buchstaben, Zahlen und Sonderzeichen");
        int option = 0;

        try {
            option = scanner.nextInt();
            if (option < 1 || option > 3) {
                System.out.println("Ungültige Option. Bitte wählen Sie eine gültige Option.");
                option = optionInput();
            }
        } catch (Exception e) {
            System.out.println("Ungültige Eingabe. Bitte geben Sie eine Zahl ein.");
            scanner.next();
            option = optionInput();
        }
        return option;
    }
}
