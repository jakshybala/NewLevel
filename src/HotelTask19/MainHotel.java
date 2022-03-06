package HotelTask19;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static HotelTask19.TypePayWithPrice.*;

public class MainHotel {
    public static void main(String[] args){

        Dormitory[] dormitoryObj = {new Dormitory(12, "Chuy street 123", RENT)};
        Flat[] flatObj = {new Flat(2, "Manas street 221", SERVICE)};
        Hotel[] hotelObj = {new Hotel(5, "Ahunbaeva 455", RENT)};
        try {
            if (hotelObj.equals(null));
        }catch (NullPointerException e) {
            System.out.println("Arrays elemet Empty");
        }

        Family familyObj = new Family();
        familyObj.setDormitories(dormitoryObj);
        familyObj.setFlats(flatObj);
        familyObj.setHotels(hotelObj);
        familyObj.getInfoOfFamily();


        List newList = new ArrayList(Arrays.asList(dormitoryObj));
//        System.out.println(newList);




    }
}
