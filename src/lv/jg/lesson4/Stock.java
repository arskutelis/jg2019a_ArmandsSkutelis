package lv.jg.lesson4;

public class Stock {
    public double updPrice;
    private String company;
    private double currentValue, max, min;

    public Stock(String company, double currentValue) {
        this.company = company;
        this.currentValue = currentValue;
        max = currentValue;
        min = currentValue;
    }

    public String getCompany() {
        return this.company;
    }

    public double getcurrentValue() {
        return this.currentValue;
    }

    public double getMax() {
        return this.max;
    }

    public double getMin() {
        return this.min;
    }

    public double getUpdPrice() {
        return this.updPrice;
    }

    public String printInformation() {
        return "The company name is " + company + ", the current value of the stock is " + currentValue
                + ", min value = " + min + ", max value = " + max;
    }

    public void updatePrice() {
        if (currentValue >= updPrice) {
            currentValue = updPrice;
            if (min <= updPrice) {
            } else {
                min = updPrice;
            }
            System.out.println("The company name is " + company + ", the current value of the stock is " + currentValue
                    + ", min value = " + min + ", max value = " + max);

        } else if (currentValue < updPrice) {
            currentValue = updPrice;
            if (max > updPrice) {
            } else {
                max = updPrice;
            }
            System.out.println("The company name is " + company + ", the current value of the stock is " + currentValue
                    + ", min value = " + min + ", max value = " + max);
        }
    }
}