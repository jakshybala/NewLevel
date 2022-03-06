package HotelTask19;

public enum TypePayWithPrice {
    RENT (800),
    SERVICE (60);

    private int price;

    public int getPrice() {
        return price;
    }
    TypePayWithPrice(int price) {
        this.price = price;
    }









}
