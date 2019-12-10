package lv.jg.lesson10;

//šeit bija jabūt asevišķam objektam User, kurš bija javalidē izmantojot servisu
public class UserValidationService {
    private String name;
    private String lastName;
    private int age;


    public UserValidationService(String name, String lastName, int age) throws ValidationException {
        //validāciju labak sadalīt atsevišķās metodēs - lastNameValidation, ageValidation utt
        if (name.length() < 3 || name.length() > 15 || lastName.length() < 3 ||
                lastName.length() > 15 || age < 0 || age > 120) {
            throw new ValidationException("Values in name, last name and/or age do not correspond to required parameters");

        } else {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            System.out.println("SUCCESS: Validation successful");
        }
    }
}
