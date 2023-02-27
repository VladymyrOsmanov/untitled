package lesson2;
public class Lesson2HwQ3 {
    public static void main(String[] args) {
        Lesson2HwQ3 loops = new Lesson2HwQ3();
        loops.downPyramid(6);
    }
    /*public void downPyramid(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    } */
    public void downPyramid(int rows) {
        for (int i = rows; i >= 1; i--)
        {
            for (int s=1; s<=rows-i;s++) {
            System.out.print(" ");
            }
            for (int j = 1; j <= i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
