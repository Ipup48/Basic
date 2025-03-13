import java.util.Scanner;

public class Mater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("CM : ");
        double CM = sc.nextDouble();
        double inches = CM/2.54;
        System.out.print("inches = "+inches);
    }
}
