package HotelTask19;

public class Dormitory extends Family implements PaySystem{


    public Dormitory(int members, String address, TypePayWithPrice typePayWithPrice) {
        super(members, address, typePayWithPrice);
    }

    @Override
    public void paySystemType() {
        System.out.println("We know how to use PaySystem");
    }
    public void getInfoOfDormitory() {
        System.out.println("Dormitory info");
        System.out.printf("The address is: "+getAddress()+". The members quantity is: "+getMembers() + ", They are pays: %d soms per months. (Each person pays: %d)\n", getMembers()*typePayWithPrice.getPrice(), getTypePayWithPrice().getPrice());
    }

}
