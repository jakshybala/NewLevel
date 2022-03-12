package HashMapTask261;

import java.time.LocalDate;
import java.util.Objects;

public class Car {
    int id;
    int numberAuto;

    public Car(int id, int numberAuto) {
        this.id = id;
        this.numberAuto = numberAuto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberAuto() {
        return numberAuto;
    }

    public void setNumberAuto(int numberAuto) {
        this.numberAuto = numberAuto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && numberAuto == car.numberAuto;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numberAuto);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", numberAuto=" + numberAuto +
                '}';
    }
}
