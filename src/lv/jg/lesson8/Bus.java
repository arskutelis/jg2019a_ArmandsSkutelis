package lv.jg.lesson8;

import java.util.Objects;

//Ok
public class Bus extends Car {
    protected String busType;

    public Bus(String type, String model, int year, String busType) {
        super(type, model, year);
        this.busType = busType;
    }

    public void busType(String busType) {
        this.busType = busType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Bus that = (Bus) o;
        return Objects.equals(busType, that.busType);

    }

    @Override
    public String toString() {
        return "Bus type='" + type + '\'' +
                ", model=" + model +
                ", year=" + year +
                ", bus type=" + busType;
    }
}
