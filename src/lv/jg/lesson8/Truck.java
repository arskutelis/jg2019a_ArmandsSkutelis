package lv.jg.lesson8;

import java.util.Objects;

public class Truck extends Car {
    protected String truckType;

    public Truck(String type, String model, int year, String truckType) {
        super(type, model, year);
        this.truckType = truckType;
    }

    public void truckType(String truckType) {
        this.truckType = truckType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Truck that = (Truck) o;
        return Objects.equals(truckType, that.truckType);

    }

    @Override
    public String toString() {
        return "Truck type='" + type + '\'' +
                ", model=" + model +
                ", year=" + year +
                ", truck type=" + truckType;
    }
}