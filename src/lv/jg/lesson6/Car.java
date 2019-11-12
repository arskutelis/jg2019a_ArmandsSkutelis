package lv.jg.lesson6;

public class Car {
    private String model;
    private String color;
    private int maxSpeed;
    private int currentSpeed;
    private boolean driving;

    public Car(String model, String color, int maxSpeed, int currentSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = currentSpeed;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getMaxspeed() {
        return maxSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public boolean getDriving() {
        return driving;
    }

    public void isDriving() {
        if (currentSpeed >= 1) {
            driving = true;
        } else {
            driving = false;
        }
        System.out.println("Is car " + model + " driving = " + driving + ".");
    }

    public void speedUp() {
        if (driving == true) {
            for (currentSpeed = getCurrentSpeed(); currentSpeed < maxSpeed; currentSpeed++) {
            }
        } else {
            driving = false;
            currentSpeed = 0;
        }
        System.out.println("After speed up current speed of car " + model + " is " + currentSpeed + ", cannot accelerate any more");
    }

    public void accelerate() {
        if (driving == true && currentSpeed < maxSpeed) {
            currentSpeed++;
        } else {
            driving = false;
        }
        System.out.println("Car " + model + " accelerated to " + currentSpeed + ".");
    }

    public void slowDown() {
        if (driving == true && currentSpeed > 0) {
            currentSpeed--;
        } else {
            driving = false;
        }
        System.out.println("Car " + model + " slowed down to " + currentSpeed + ".");
    }
    public boolean canAccelerate() {
        if (driving == true && currentSpeed < maxSpeed && currentSpeed > 0) {
            System.out.println("Can car " + model + " accelerate: " + true + ".");
            return true;
        } else {
            System.out.println("Can car " + model + " accelerate: " + false + ".");
            return false;
        }
    }
}
