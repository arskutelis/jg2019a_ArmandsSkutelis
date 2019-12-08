package lv.jg.lesson10;

public class UserValidationServiceTest {
    public static void main(String[] args) {
        catchFailedValidation();
        SuccessfulValidation();
    }

    private static void catchFailedValidation() {
        UserValidationService firstUser = null;
        try {
            firstUser = new UserValidationService("Heja", "Bomoforgluegjdjsjjsjsjajjaj", 16);
        }
        catch (ValidationException e) {
            System.out.println("FAILED: " + e.getMessage());
        }
    }

    private static void SuccessfulValidation() {
        UserValidationService secondUser = null;
        try {
            secondUser = new UserValidationService("Armands", "Skutelis", 31);
        }
        catch (ValidationException e) {
            System.out.println("FAILED: " + e.getMessage());
        }
    }
}
