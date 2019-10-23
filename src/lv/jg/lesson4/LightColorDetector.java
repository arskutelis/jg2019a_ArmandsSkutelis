package lv.jg.lesson4;

public class LightColorDetector {
    public String detect(int wavelength) {
        if (wavelength >= 620 && wavelength <= 750) {
            return "red";
        }
        if (wavelength >= 590 && wavelength <= 619) {
            return "orange";
        }
        if (wavelength >= 570 && wavelength <= 589) {
            return "yellow";
        }
        if (wavelength >= 495 && wavelength <= 569) {
            return "green";
        }
        if (wavelength >= 450 && wavelength <= 494) {
            return "blue";
        }
        if (wavelength >= 380 && wavelength <= 449) {
            return "violet";
        }

        return "not defined";
    }
}
