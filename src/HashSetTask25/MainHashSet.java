package HashSetTask25;

import javax.print.attribute.AttributeSetUtilities;
import java.util.*;

public class MainHashSet {

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3};
        Integer[] arraySecond = {0, 1, 2};
        Set<Integer> firstSet = new HashSet<Integer>(Arrays.asList(array));
        Set<Integer> secondSet = new HashSet<Integer>();
        Collections.addAll(secondSet, arraySecond); //conver array to Set
        System.out.println(firstSet);
        System.out.println(secondSet);
        System.out.println(secondSet.contains(1)); //test contains
        System.out.println("___");
        System.out.println("Method" + symmetricDifference(firstSet, secondSet));
    }
    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> newSet = new HashSet<>();
        for (Integer integer : set1) {
            if (!set2.contains(integer)) {
                newSet.add(integer);
            }
        }
        for (Integer integer : set2) {
            if (!set1.contains(integer)) {
                newSet.add(integer);
            }
        }
        return newSet;
        }

    }

