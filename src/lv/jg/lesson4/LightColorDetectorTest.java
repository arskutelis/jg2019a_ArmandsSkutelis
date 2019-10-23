package lv.jg.lesson4;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest test = new LightColorDetectorTest();
        test.shouldDetectRed();
        test.shouldDetectOrange();
        test.shouldDetectYellow();
        test.shouldDetectGreen();
        test.shouldDetectBlue();
        test.shouldDetectViolet();
        test.shouldDetectNotDefined();
        test.shouldDetectColor();
    }

    public void shouldDetectRed() {
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(420);
        compareResult(result.equals("red"), "Detects red color - ");
    }

    public void shouldDetectOrange() {
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(420);
        compareResult(result.equals("orange"), "Detects orange color - ");
    }

    public void shouldDetectYellow() {
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(420);
        compareResult(result.equals("yellow"), "Detects yellow color - ");
    }

    public void shouldDetectGreen() {
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(420);
        compareResult(result.equals("green"), "Detects green color - ");
    }

    public void shouldDetectBlue() {
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(420);
        compareResult(result.equals("blue"), "Detects blue color - ");
    }

    public void shouldDetectViolet() {
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(420);
        compareResult(result.equals("violet"), "Detects violet color - ");
    }

    public void shouldDetectNotDefined() {
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(420);
        compareResult(result.equals("not defined"), "Detects not defined color - ");
    }

    public void shouldDetectColor() {
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(420);
        System.out.println("...........................................");
        System.out.println("The wavelength belongs to color: " + result);
    }

    void compareResult(boolean result, String testName) {
        if (result) {
            System.out.println(testName + " Yes.");
        } else {
            System.out.println(testName + " No.");
        }
    }
}
