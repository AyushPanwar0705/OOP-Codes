import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Enter even number:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        StringBuilder result = new StringBuilder();
        for (int num : arr) {
            String numStr = String.valueOf(num);
            int firstDigit = Character.getNumericValue(numStr.charAt(0));
            result.append(firstDigit);
        }
        
        int generatedNumber = Integer.parseInt(result.toString());
        int reversedNumber = 0;
        while (generatedNumber > 0) {
            reversedNumber = reversedNumber * 10 + generatedNumber % 10;
            generatedNumber /= 10;
        }
        
        if (reversedNumber % 5 == 0) {
            System.out.println("Generated number divisible by 5: " + reversedNumber);
        } else {
            System.out.println("Generated number not divisible by 5");
        }
    }
}
