package problem_solving;
import java.security.PublicKey;
import  java.util.Scanner;
public class Factorial {
    public  static void  main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number to to test: ");
        int num = scanner.nextInt();
        if(num == 1) // ليه 1؟ عشان مضروب ال 1 بس هو اللي بيطلع عدد فردي غير كده هيبقي زوجي.
        {
            System.out.println("No");
        }else {
            System.out.println("Yes");
        }






    }
}
