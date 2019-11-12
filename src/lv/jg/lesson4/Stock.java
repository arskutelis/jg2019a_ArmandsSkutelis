package lv.jg.lesson4;

public class Stock {
    public double updPrice; //public!! objekta stāvoklis nedrīkst būt tieši pieejams.
    private String company;
    private double currentValue, max, min;

    public Stock(String company, double currentValue) {
        this.company = company;
        this.currentValue = currentValue;
        max = currentValue;
        min = currentValue;
    }

    //daudz neizmantotu geteru - dzēšam
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

    //updPrice - varēja šeit nodot kāparametru metodei  "updatePrice(double newPrice)"
    //tas atrisinātu public problēmu un viss algoritms paliktu vienkāršāks
    public void updatePrice() {
        //pēc iespējas izvairamies no situācijas kur ir vairāki "if" iekļauti viens otrā
        //no tā var izvairīties, ja piemēram darbības sadala mazākās metodēs
        if (currentValue >= updPrice) {
            currentValue = updPrice;
            //šo salīdzināšanu var iznest atsevišķā metodē
            //ja salīdzina un ir nepieciešams tikai viena if daļa
            //tad tas jārāksta "no otras puses", tas ir:
//            if (updPrice <= min) {
//                min = updPrice;
//            }
            if (min <= updPrice) {
            } else {
                min = updPrice;
            }
            System.out.println("The company name is " + company + ", the current value of the stock is " + currentValue
                    + ", min value = " + min + ", max value = " + max);

        } else if (currentValue < updPrice) {
            currentValue = updPrice;
            //skatī iepriekšējo komentāru
            if (max > updPrice) {
            } else {
                max = updPrice;
            }
            System.out.println("The company name is " + company + ", the current value of the stock is " + currentValue
                    + ", min value = " + min + ", max value = " + max);
        }
    }
}