import java.util.Scanner;

public class fahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("temperature : ");
        double Celsius = sc.nextDouble();
        double fahrenheit = (Celsius * 9/5)+32;
        System.out.println("fahrenheit = "+fahrenheit);
    }
}
