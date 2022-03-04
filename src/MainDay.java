import java.util.*;

public class MainDay {
    public static void main(String[] args) {
        DAY[] daysArray = DAY.values();
        List<DAY> dayList = List.of(daysArray);
        System.out.println(dayList);
        for (DAY day : dayList) {
            if (day.getIindex() < 2) {
                System.out.print(day + ",");
            }
            }



        }

//        Set set = new TreeSet();
//        set.addAll(list);
//        for (final DAY day : set) {
//            System.out.println(day.getName());
//        }
//        System.out.println("new order:");
//        set = new TreeSet(new DAYComparator());
//        set.addAll(list);
//        for (final DAY day : set) {
//            System.out.println(day.getName());
//        }
    }

enum DAY {
    MON("MONDAY", 1),
    TUE("TUESDAY", 2),
    WED("WEDNESDAY", 3),
    THU("THURSDAY", 4),
    FRI("FRIDAY", 5),
    SAT("SATURDAY", 6),
    SUN("SUNDAY", 0);

    private String name;
    private int index;

    DAY(String name, int index) {
        this.name = name;
        this.index = index;
    }
    public String getName() {
        return name;
    }
    public int getIindex() {
        return index;
    }

}
//class DAYComparator implements Comparator {

//    @Override
//    public int compare(final DAY o1, final DAY o2) {
//        int returnValue = 0;
//        if (o1.getIndex() > o2.getIndex()) {
//            returnValue = 1;
//        } else if (o1.getIndex() < o2.getIndex()) {
//            returnValue = -1;
//        }
//        return returnValue;
//    }

//    @Override
//    public int compare(DAY o1, DAY o2) {
//        return 0;
//    }


