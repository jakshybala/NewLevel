package StudentsPrak;

import java.util.*;

public class MainStudents {
    public static void main(String[] args) {

        Students[] stuArray = { new Students("Jax","jax@gmail.com", Group.JAVA, 35), new Students("Max", "Max@mail.ru", Group.JS, 31), new Students("Adam,", "adam@yandex.ru", Group.JS,18) };
        Set<Students> stuList = new HashSet<>(Arrays.asList(stuArray));
        TreeSet<Students> sorted = new TreeSet<>(stuList);
        TreeSet<Students> jsGroup = new TreeSet<>();
        TreeSet<Students> javaGroup = new TreeSet<>();
        System.out.println("Sorted:" + sorted);
        System.out.println("_______________");
        for (Students students : sorted) {
            if (students.getGroup().equals(Group.JS)) {
                jsGroup.add(students);
            }else {
                javaGroup.add(students);
            }
        }

        System.out.println("JS group" + jsGroup);
        System.out.println("JAVA group" + javaGroup);






        }


        }

