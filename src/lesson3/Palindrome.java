package lesson3;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Palindrome reverseString = new Palindrome();
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter the first word: ");
        String b = sc.next();

            System.out.println(String.format("The input string is %s", b));
            String result = "";
            int lastLetter = b.length() - 1;
            for (int i = lastLetter; i >= 0; i--)
            {
                result = result + b.charAt(i);
            }
                if (result.equals(b)) {
                    System.out.println(String.format("The input string %s is palindrome", b));
                } else {
                    System.out.println(String.format("The input string %s is not palindrome", b));
                }
        }
    }


