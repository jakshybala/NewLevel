package HotelTask19;

public class Hotel extends Family implements PaySystem{
    public Hotel(int members, String address, TypePayWithPrice typePayWithPrice) {
        super(members, address, typePayWithPrice);
    }

    @Override
    public void paySystemType() {
        System.out.println("We know how to use PaySystem");
    }
    public void getInfoOfHotel() {
        System.out.println("Hotel info");
        System.out.printf("The address is: "+getAddress()+". The members quantity is: "+getMembers() + ", They are pays: %d soms. (Each person pasy: %d)\n", getMembers()*typePayWithPrice.getPrice(), typePayWithPrice.getPrice());
    }
}
