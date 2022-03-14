package TreeSetCitiTask262;

import java.util.*;

public class MainCity {
    public static void main(String[] args) {
        City[] cities = {new City(3, "Karakol"), new City(1, "Bishkek"),
                        new City(2, "Osh city"), new City(4, "JalaAbad"),
                        new City(5, "CholponAta")};
        Set<City> hashSetList = new HashSet<>(Arrays.asList(cities));
        TreeSet<City> treeSetList = new TreeSet<>();
        System.out.println("HashList Before sort: " + hashSetList);
        TreeSet<City> oddTreeSetList = new TreeSet<>(hashSetList);
        System.out.println("TreeSet Odd Code: " + sortMethod(hashSetList, treeSetList));
    }

    private static TreeSet<?> sortMethod(Set<City> hashSet, TreeSet<City> treeSetList) {
        TreeSet<?> newTreesetList = new TreeSet<>();
        for (City city : hashSet) {
            if (city.getCode() % 2 != 0) {
                treeSetList.add(city);

            }

        }
        return treeSetList;
    }
}
