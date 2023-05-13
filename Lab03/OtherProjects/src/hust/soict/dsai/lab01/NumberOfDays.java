package hust.soict.dsai.lab01;
import java.util.Scanner;
public class NumberOfDays {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String strMonth;
        int month = -1, year;
    
        //Input month
        do {
	        System.out.print("Input month: ");
	        strMonth = keyboard.nextLine().toLowerCase();
	        switch (strMonth) {
	            case "january":
	            case "jan":
	            case "1":
	                month = 0;
	                break;
	            case "february":
	            case "feb":
	            case "2":
	                month = 1;
	                break;
	            case "march":
	            case "mar":
	            case "3":
	                month = 2;
	                break;
	            case "april":
	            case "apr":
	            case "4":
	                month = 3;
	                break;
	            case "may":
	            case "5":
	                month = 4;
	                break;
	            case "june":
	            case "jun":
	            case "6":
	                month = 5;
	                break;
	            case "july":
	            case "jul":
	            case "7":
	                month = 6;
	                break;
	            case "august":
	            case "aug":
	            case "8":
	                month = 7;
	                break;
	            case "september":
	            case "sep":
	            case "9":
	                month = 8;
	                break;
	            case "october":
	            case "oct":
	            case "10":
	                month = 9;
	                break;
	            case "november":
	            case "nov":
	            case "11":
	                month = 10;
	                break;
	            case "december":
	            case "dec":
	            case "12":
	                month = 11;
	                break;
	            default:
	                System.out.println("Invalid month input. Please try again.");
	                break;
	        } 
        } while (month == -1);

        //Input year
        do {
            System.out.print("Input year: ");
            year = keyboard.nextInt();
            if (year <= 0) {
                System.out.println("Invalid year input. Please try again.");
            }
        } while (year <= 0);

        //Print out the number of days
        int[] daysNormalYear = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] daysLeapYear = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println ("There are " + daysLeapYear[month] + " days in this month.");
        }
        else {
            System.out.println ("There are " + daysNormalYear[month] + " days in this month.");
        }
    }
}
