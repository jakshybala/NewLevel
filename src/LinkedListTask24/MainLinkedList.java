package LinkedListTask24;

import java.util.*;

public class MainLinkedList {
    public static void main(String[] args) {
        int[] arrays = new int[10];
        List<Integer> myList = new ArrayList<>(10);
        LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
        Random randomObj = new Random();
        for (int i = 0; i < 10; i++) {
            arrays[i] = randomObj.nextInt(2);
            myList.add(randomObj.nextInt(2));
            myLinkedList.add(randomObj.nextInt(2));
        }
        System.out.println(Arrays.toString(arrays));
        System.out.println(myList);
        System.out.println(myLinkedList);
        System.out.println("After sort");
        Arrays.sort(arrays); //here just usin Integer default method
        Collections.sort(myList);
//        Collections.sort(myLinkedList);
        Collections.sort(myLinkedList); //sorted by overLoad Comparator methods
        System.out.println(Arrays.toString(arrays));
        System.out.println(myList);
        System.out.println(myLinkedList);

    }

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

