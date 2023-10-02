import java.util.Scanner;
public class CharPercentage {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String:");
        String input = sc.nextLine();
        int upperCount = 0, lowerCount = 0, digitCount = 0, specialCount = 0;

        for (char c : input.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                upperCount++;
            } else if (c >= 'a' && c <= 'z') {
                lowerCount++;
            } else if (c >= '0' && c <= '9') {
                digitCount++;
            } else {
                specialCount++;
            }
        }

        int totalChars = upperCount + lowerCount + digitCount + specialCount;
        double upperPercentage = (upperCount * 100.0) / totalChars;
        double lowerPercentage = (lowerCount * 100.0) / totalChars;
        double digitPercentage = (digitCount * 100.0) / totalChars;
        double specialPercentage = (specialCount * 100.0) / totalChars;

        System.out.println("Uppercase percentage: " + upperPercentage);
        System.out.println("Lowercase percentage: " + lowerPercentage);
        System.out.println("Digit percentage: " + digitPercentage);
        System.out.println("Special character percentage: " + specialPercentage);
    }
}
