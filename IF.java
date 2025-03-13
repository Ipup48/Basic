import java.util.Scanner;

public class IF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Num1 : ");
        int num = sc.nextInt();
        if (num % 2 ==0 ) {
            System.out.println(num + " : Even");
        }
        else {
            System.out.println(num + " : Odd");
        }
        sc.close();
    }

}
