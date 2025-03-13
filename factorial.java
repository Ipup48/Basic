import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("num:"); // แสดงข้อความให้ผู้ใช้ป้อนตัวเลข
        int num = scanner.nextInt(); // รับค่าตัวเลขที่ผู้ใช้ป้อนและเก็บในตัวแปร num
        long factorial = 1; // กำหนดตัวแปร factorial เริ่มต้นที่ 1 (เพราะการคูณกับ 1 ไม่ทำให้ค่าผลลัพธ์เปลี่ยนแปลง)

        // ใช้ for loop เพื่อคำนวณค่า factorial
        for (int i = 1; i <= num; i++) { 
            factorial *= i; // คูณค่าปัจจุบันของ i กับตัวแปร factorial แล้วเก็บค่าผลลัพธ์กลับไปที่ factorial
        }

        // แสดงผลลัพธ์ค่า 
        System.out.println("Factorial  " + num + " is " + factorial);

        scanner.close(); // ปิด Scanner                                         
    }
}