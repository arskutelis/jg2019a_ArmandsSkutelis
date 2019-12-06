package lv.jg.lesson8;

import java.util.Objects;

public class Car {
    protected String type;
    protected String model;
    protected int year;

    public Car(String type, String model, int year) {
        this.type = type;
        this.model = model;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Car that = (Car) o;
        return Objects.equals(type, that.type) && Objects.equals(model, that.model) && Objects.equals(year, that.year);

    }

    @Override
    public String toString() {
        return "Car type='" + type + '\'' +
                ", model=" + model +
                ", year=" + year;
    }

}
