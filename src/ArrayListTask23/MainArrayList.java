package ArrayListTask23;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainArrayList {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList();
        Random randomObj = new Random();
        for (int i = 0; i < 50; i++) {
            myList.add(randomObj.nextInt(100));
        }
        System.out.printf(myList + "\nList size: %d\n", myList.size());

        List<Integer> oddNumbersList = new ArrayList();
        List<Integer> evenNumbersList = new ArrayList();
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) % 2 != 0) {
                oddNumbersList.add(myList.get(i));
            } else if (myList.get(i) % 2 == 0) {
                evenNumbersList.add(myList.get(i));
            }
        }
        System.out.println("Odd numbers: " + oddNumbersList + "\nTotal odd numbers: " + oddNumbersList.size());
        System.out.println("Even numbers: " + evenNumbersList + "\nTotal even numbers: " + evenNumbersList.size());


    }
}
