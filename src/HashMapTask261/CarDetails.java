package HashMapTask261;

import java.time.LocalDate;

public class CarDetails {
    private int madeIn;
    private String modelCar;
    private int price;
    private String color;

    public CarDetails(int madeIn, String modelCar, int price, String color) {
        this.madeIn = madeIn;
        this.modelCar = modelCar;
        this.price = price;
        this.color = color;
    }

    public int getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(int madeIn) {
        this.madeIn = madeIn;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "CarDetails{" +
                "madeIn=" + madeIn +
                ", modelCar='" + modelCar + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
