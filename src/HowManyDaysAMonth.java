import java.util.Scanner;

public class HowManyDaysAMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the month number: ");
        int i = in.nextInt();
        NumberOfDaysInAMonth(i);
    }

    private static void NumberOfDaysInAMonth(int i) {
        switch (i) {
            case 1:
                System.out.println("The number of days in month number " + i + " is 31");
                break;
            case 2:
                System.out.println("The number of days in month number " + i + " is 28");
                break;
            case 3:
                System.out.println("The number of days in month number " + i + " is 31");
                break;
            case 4:
                System.out.println("The number of days in month number " + i + " is 30");
                break;
            case 5:
                System.out.println("The number of days in month number " + i + " is 31");
                break;
            case 6:
                System.out.println("The number of days in month number " + i + " is 30");
                break;
            case 7:
                System.out.println("The number of days in month number " + i + " is 31");
                break;
            case 8:
                System.out.println("The number of days in month number " + i + " is 31");
                break;
            case 9:
                System.out.println("The number of days in month number " + i + " is 30");
                break;
            case 10:
                System.out.println("The number of days in month number " + i + " is 31");
                break;
            case 11:
                System.out.println("The number of days in month number " + i + " is 30");
                break;
            case 12:
                System.out.println("The number of days in month number " + i + " is 31");
                break;
            default:
                System.out.println("No such number of the month!");
        }
    }
}
