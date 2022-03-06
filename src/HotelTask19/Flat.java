package HotelTask19;

public class Flat extends Family implements PaySystem{

    public Flat(int members, String address, TypePayWithPrice typePayWithPrice) {
        super(members, address, typePayWithPrice);
    }

    @Override
    public void paySystemType() {
        System.out.println("We know how to use PaySystem");
    }
    public void getInfoOfFlat() {
        System.out.println("Flat info");
        System.out.printf("The address is: "+getAddress()+". The members quantity is: "+getMembers() + ", They are pays: %d soms per month (price for each person: %d soms p/m) \n", getMembers() * typePayWithPrice.getPrice() , typePayWithPrice.getPrice());
    }





    }

