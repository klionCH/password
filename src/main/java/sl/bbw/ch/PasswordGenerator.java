package sl.bbw.ch;

import java.util.Random;

public class PasswordGenerator {

    public PasswordGenerator() {
        InputScanner inputScanner = new InputScanner();
        int length = inputScanner.lengthInput();
        int option = inputScanner.optionInput();
        System.out.println("Das Passwort ist: " + generatePassword(length, option));
    }

    public static String generatePassword(int length, int option) {
        Random random = new Random();
        String alphabet = "";

        switch (option) {
            case 1:
                alphabet = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
                break;
            case 2:
                alphabet = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz0123456789";
                break;
            case 3:
                alphabet = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz0123456789!§$%&/()=?*+#-_.:,;";
                break;
            default:
                System.out.println("Ungültige Option. Es werden alle Zeichen verwendet.");
                alphabet = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz0123456789!§$%&/()=?*+#-_.:,;";
                break;
        }

        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            password.append(alphabet.charAt(random.nextInt(alphabet.length())));
        }
        return password.toString();
    }
}
