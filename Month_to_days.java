import java.util.Scanner;
public class MonthToDays {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Month:");
        String monthName = sc.next();
        int days = 0;

        switch (monthName.toLowerCase()) {
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                days = 31;
                break;
            case "april":
            case "june":
            case "september":
            case "november":
                days = 30;
                break;
            case "february":
                days = 28; // Ignoring leap year 
                break;
            default:
                System.out.println("Invalid month name");
                return;
        }

        System.out.println(monthName + " has " + days + " days.");
    }
}
