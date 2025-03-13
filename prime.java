import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner var1 = new Scanner(System.in);
      System.out.print("Number : ");
      int var2 = var1.nextInt();
      if (var2 <= 1) {
         System.out.println("" + var2 + " not a prime number");
      } else {
         boolean var3 = true;

         for(int var4 = 2; var4 < var2; ++var4) {
            if (var2 % var4 == 0) {
               var3 = false;
               break;
            }
         }

         if (var3) {
            System.out.println("" + var2 + " prime number");
         } else {
            System.out.println("" + var2 + " not a prime number");
         }
      }

      var1.close();
   }
}
    

