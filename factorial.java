import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("num:"); 
        int num = scanner.nextInt(); 
        long factorial = 1; 

        // ใช้ for loop เพื่อคำนวณค่า factorial
        for (int i = 1; i <= num; i++) { 
            factorial *= i; 
        }

        
        System.out.println("Factorial  " + num + " is " + factorial);

        scanner.close(); // ปิด Scanner                                         
    }
}
