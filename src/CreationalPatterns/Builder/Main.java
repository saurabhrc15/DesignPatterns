package DesignPatterns.Builder;

import DesignPatterns.Builder.exceptions.InvalidArgumentException;

public class Main {
    public static void main(String[] args) {
        try {
            Student student = Student.createBuilder()
                    .setName("Saurabh")
                    .setAge(30)
                    .setGender(Gender.MALE)
                    .setPsp(91.23)
                    .setUniversityName("SGBAU")
                    .setMobileNumber("9579027397")
                    .build();
            System.out.println(student);
        } catch (InvalidArgumentException e) {
            System.out.println("Invalid Argument Exception");
        }
    }
}
