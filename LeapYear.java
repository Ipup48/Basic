import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Year : ");
        int year = sc.nextInt();
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        
        if (isLeapYear) {
            System.out.println(year + "(Leap Year)");
        } else {
            System.out.println(year + " (Not a Leap Year)");
        }
        sc.close();
    }
}
