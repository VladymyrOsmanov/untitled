package hw1;
import java.util.Scanner;
public class HW2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sum =0;
        System.out.print("Enter first number- ");
        int a= sc.nextInt();
        System.out.print("Enter second number (higher number)- ");
        int b= sc.nextInt();
        for (;a<=b;a++){
            sum = sum + a;
        }
        System.out.println(sum);
    }
}
