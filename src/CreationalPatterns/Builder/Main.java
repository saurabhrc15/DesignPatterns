package CreationalPatterns.Builder;

import CreationalPatterns.Builder.exceptions.InvalidArgumentException;

public class Main {
    public static void main(String[] args) {
        try {
            Student student = Student.createBuilder()
                    .setName("Saurabh")
                    .setAge(30)
                    .setGender(Gender.MALE)
                    .setPsp(91.23)
                    .setUniversityName("SGBAU")
                    .setMobileNumber("7878787878")
                    .build();
            System.out.println(student);
        } catch (InvalidArgumentException e) {
            System.out.println("Invalid Argument Exception");
        }
    }
}
