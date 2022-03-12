package HashMapTask261;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MainAuto {
    public static void main(String[] args) {
        Map<Car, CarDetails> hashMapCar = new HashMap();
        Map<Car, CarDetails> mapCarAndDetails = new HashMap<>(Map.of(new Car(11, 123), new CarDetails(2020, "Camry", 11000, "Silver"),
                new Car(33, 777), new CarDetails(2012, "Audi", 8000, "Red")));

        mapCarAndDetails.put(new Car(59, 1000), new CarDetails(2000, "Tesla", 30000, "White"));
        //get all data by Foreach
        mapCarAndDetails.forEach((cars, carDetail) -> System.out.println(cars + "" + carDetail));
        //Second method to get all map
        for (Map.Entry<Car, CarDetails> carCarDetailsEntry : mapCarAndDetails.entrySet()) {
//            if (carCarDetailsEntry.getKey().id == 59) {
            System.out.println("Second Method: " + carCarDetailsEntry);
        }
        //Get Car by Key
        System.out.println("Get car: " + mapCarAndDetails.get(new Car(59, 1000)));

        //search Car by key
        int carNumber = 1000;
        for (Map.Entry<Car, CarDetails> car : mapCarAndDetails.entrySet()) {
            if (car.getKey().getNumberAuto() == carNumber) {
                System.out.println("Search: " + car);
            }
        }
        //search car by value
        for (Map.Entry<Car, CarDetails> carCarDetailsEntry : mapCarAndDetails.entrySet()) {
            if (carCarDetailsEntry.getValue().getColor().equals("Red")) {
                System.out.println("Get Color:" + carCarDetailsEntry);
            }

        }

    }


}



