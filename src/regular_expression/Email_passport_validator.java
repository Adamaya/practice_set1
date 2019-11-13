package regular_expression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Email_passport_validator {
    public static void main(String[] args) {
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        final String regexOfEmail = "[a-zA-Z0-9]{4,12}\\.[a-zA-Z0-9]{4,12}_([cemd][asceo]|[ic][ocs][tvfe])[01]\\d@[a-z\\.]+\\.[com|in]+";
        final String regexOfPassword = "[a-zA-Z0-9]{4,12}";
        final Pattern patternForEmail = Pattern.compile(regexOfEmail, Pattern.MULTILINE);
        final Pattern patternForPassword = Pattern.compile(regexOfPassword, Pattern.MULTILINE);

        while (true) {
            final String email = scanner.nextLine();
            final String password = scanner.nextLine();

            final Matcher emailValidation = patternForEmail.matcher(email);
            final Matcher passwordValidation = patternForPassword.matcher(password);

            if (emailValidation.find() && passwordValidation.find()) {
                System.out.println("Welcome User");
                break;
            } else {
                System.out.println("username or password is wrong");
                counter++;
                System.out.println("remainig try:" + (3 - counter));
                if (counter == 3) {
                    System.out.println("System Locked");
                    break;

                }
            }
        }
    }
}
