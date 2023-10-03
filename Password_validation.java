import java.util.Scanner;
public class PasswordValidation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Paswword:");
        String password = sc.nextLine();
        boolean isValid = true;

        if (password.length() < 6 || password.length() > 16) {
            isValid = false;
        } else if (!password.matches(".*[a-z].*") || !password.matches(".*[A-Z].*")) {
            isValid = false;
        } else if (!password.matches(".*[0-9].*")) {
            isValid = false;
        } else if (!password.matches(".*[$#@].*")) {
            isValid = false;
        }

        if (isValid) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Not a Valid Password");
        }
    }
}
