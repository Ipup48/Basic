import java.util.Scanner;

public class AVG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Num1 : ");
        int num1 = sc.nextInt();
        System.out.print("Num2 : ");
        int num2 = sc.nextInt();
        System.out.print("Num3 : ");
        int num3 = sc.nextInt();
        double AVG = (num1+num2+num3) / 3.0;
        System.out.println(AVG);
    }
}
