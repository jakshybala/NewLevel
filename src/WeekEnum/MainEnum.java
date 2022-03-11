package WeekEnum;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainEnum {
        public static void main(String[] args) {
            Week[] weeksArray = Week.values();
            Scanner enterData = new Scanner(System.in);
            System.out.println("Enter week days name: ");
            String nameEnter = enterData.nextLine();
            for (Week week : weeksArray) {
                if (week.name().equals(nameEnter)) {
                    System.out.println(week.getWeekTranslate());
                }

            }

        }
    }



