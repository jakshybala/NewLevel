package LinkedListTask24;

import java.util.*;

public class MainLinkedList {
    public static void main(String[] args) {
        int[] arrays = new int[10];
        List<Integer> myList = new ArrayList<>(10);
        LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
        sortNumbers(arrays, myList, myLinkedList);

    }
    //hand method Overriding
    private static void sortNumbers(int[] array, List<Integer> myList, LinkedList<Integer> myLinkedList) {
        Random randomObj = new Random();
        for (int i = 0; i < 10; i++) {
            array[i] = randomObj.nextInt(2);
            myList.add(randomObj.nextInt(2));
            myLinkedList.add(randomObj.nextInt(2));
        }
        System.out.println(Arrays.toString(array));
        System.out.println(myList);
        System.out.println(myLinkedList);
        System.out.println("After sort");
        Arrays.sort(array);
        Collections.sort(myList);
        Collections.sort(myLinkedList);
        System.out.println(Arrays.toString(array));
        System.out.println(myList);
        System.out.println(myLinkedList);
    }
    //Comparator method Overriding
    public static Comparator<LinkedList> myComparator = new Comparator<LinkedList>() {

        @Override
        public int compare(LinkedList o1, LinkedList o2) {
            return o1.size() - o2.size();
        }
    };
    public static Comparator<List> myComparatorList = new Comparator<List>() {

        @Override
        public int compare(List o1, List o2) {
            return o1.size() - o2.size();
        }
    };

}

