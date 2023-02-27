package lesson4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
public class HW4 {
    public static void main(String[] args) {
        HW4 hw4 = new HW4();
        hw4.arrayListSortingExample();
    }
    public void arrayListSortingExample() {

        ArrayList<String> arrayList = new ArrayList<String>();
        ArrayList<String> newarrayList = new ArrayList<String>();
        arrayList.add("Steve");
        arrayList.add("Tim");
        arrayList.add("Lucy");
        arrayList.add("Steve");
        arrayList.add("Pat");
        arrayList.add("Angela");
        arrayList.add("Tom");
        arrayList.add("Tim");
        arrayList.add("Anna");
        arrayList.add("Lucy");
        Collections.sort(arrayList);
        for (String element :arrayList){
            if (!newarrayList.contains(element)) {
                newarrayList.add(element);
            }
        }
        System.out.println(newarrayList);
    }


    public void getToyById() {
        HashMap<Integer, String> getToyById = new HashMap<Integer, String>();
        getToyById.put(12, "Batmobile");
        getToyById.put(45, "Light Saber");
        getToyById.put(6, "Wonder Woman");
        getToyById.put(201, "Hello Kitty Bag");
        getToyById.put(56, "Junior QA Analyst Doll");

        Scanner getToy = new Scanner(System.in);
        System.out.println("Enter the Toy ID: ");
        int id = Integer.parseInt(getToy.next());
        System.out.println("The toy that you have been looking for is: ");
        System.out.print(getToyById.get(id));


    }
    public void days() {
        ArrayList<String> days = new ArrayList<String>();
        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");

        Scanner getDay = new Scanner(System.in);
        System.out.println("Write a number from 1 to 7: ");
        String num = getDay.next();

        System.out.println(days.get(Integer.parseInt(num)-1));
    }
}
