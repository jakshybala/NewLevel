package HotelTask19;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Family {
    private int members;
    private String address;
    TypePayWithPrice typePayWithPrice;
    Dormitory[] dormitories;
    Flat[] flats;
    Hotel[] hotels;


    public Family(int members, String address, TypePayWithPrice typePayWithPrice) {
        this.members = members;
        this.address = address;
        this.typePayWithPrice = typePayWithPrice;
    }

    public Family() {

    }


    @Override
    public String toString() {
        return "Family{" +
                "members=" + members +
                ", address='" + address + '\'' +
                ", typePayWithPrice=" + typePayWithPrice +
                '}';
    }

    public Dormitory[] getDormitories() {
        return dormitories;
    }

    public void setDormitories(Dormitory[] dormitories) {
        this.dormitories = dormitories;
    }

    public Flat[] getFlats() {
        return flats;
    }

    public void setFlats(Flat[] flats) {
        this.flats = flats;
    }

    public Hotel[] getHotels() {
        return hotels;
    }

    public void setHotels(Hotel[] hotels) {
        this.hotels = hotels;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public TypePayWithPrice getTypePayWithPrice() {
        return typePayWithPrice;
    }

    public void setTypePayWithPrice(TypePayWithPrice typePayWithPrice) {
        this.typePayWithPrice = typePayWithPrice;
    }

    //GetInfo Method
    public void getInfoOfFamily() throws NullPointerException {
        for (Dormitory c : getDormitories())
            c.getInfoOfDormitory();
        for (Flat c: getFlats() ) {
            c.getInfoOfFlat();
        }
        for (Hotel c: hotels) {
          c.getInfoOfHotel();

        }


    }
}

