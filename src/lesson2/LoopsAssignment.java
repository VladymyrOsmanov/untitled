package lesson2;

public class LoopsAssignment {
    public static void main(String[] args)
    {

        int i = 0;
        while (i < 100) {
            i++;
            if ((i % 2 == 0) && (i % 3 ==0))
            {System.out.println(i + " is divisible by two and three");}
            else if (i % 2 == 0)
            {System.out.println(i + " is even");}
            else if (i % 3 ==0)
            {System.out.println(i + " is divisible by three");}
            else if (i % 2 != 0)
            {System.out.println(i + " is odd");}

        }
        
    }
}
