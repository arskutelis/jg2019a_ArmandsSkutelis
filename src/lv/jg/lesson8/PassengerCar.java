package lv.jg.lesson8;

import java.util.Objects;

//ok
public class PassengerCar extends Car {
    protected int passengers;

    public PassengerCar(String type, String model, int year, int passengers) {
        super(type, model, year);
        this.passengers = passengers;
    }

    public void passengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        PassengerCar that = (PassengerCar) o;
        return Objects.equals(passengers, that.passengers);

    }

    @Override
    public String toString() {
        return "Passenger car type='" + type + '\'' +
                ", model=" + model +
                ", year=" + year +
                ", number of passengers=" + passengers;
    }
}
