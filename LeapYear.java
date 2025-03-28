import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = input.nextInt();
        System.out.println(isLeapYear(year));  
        input.close();
    }

    /**
     * Determines if a given year is a leap year.
     * A leap year is divisible by 4, but not by 100 unless it is also divisible by 400.
     *
     * @param year the year to check
     * @return true if the year is a leap year, false otherwise
     */
    static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }
}
