package lesson3;
import java.util.Scanner;
public class Lesson3Main {
    public static void main(String[] args) {
        Lesson3Main compareStrings = new Lesson3Main();
        Lesson3Main reverseString = new Lesson3Main();
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first word: ");
        String a = sc.next();
        System.out.print("Enter the second word: ");
        String b = sc.next();
        compareStrings.compareStrings(a,b);


    } public void compareStrings(String a, String b){
        if (a == null || a.isEmpty() || a.isBlank()) {
            System.out.println("Cannot compare Strings");
        } else if (b == null || b.isEmpty() || b.isBlank()) {
            System.out.println("Cannot compare Strings");
        } else if (b.equals(a)) {
            System.out.println("The Strings are the same");
        } else if (b.contains(a)) {
            System.out.println(String.format("%s is the part of %s", a,b));
        }else {
            System.out.println(String.format("%s is not a part of %s", a,b));
        }
    }
}
