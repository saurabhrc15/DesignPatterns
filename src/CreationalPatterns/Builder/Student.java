package DesignPatterns.Builder;

import DesignPatterns.Builder.exceptions.InvalidArgumentException;

public class Student {
    private String name;
    private int age;
    private Gender gender;
    private double psp;
    private String universityName;
    private String mobileNumber;

    private Student(Builder builder) {
        this.name = builder.getName();
        this.age = builder.getAge();
        this.gender = builder.getGender();
        this.psp = builder.getPsp();
        this.universityName = builder.getUniversityName();
        this.mobileNumber = builder.getMobileNumber();
    }

    public static Builder createBuilder() {
        return new Builder();
    }

    static class Builder {
        private String name;
        private int age;
        private Gender gender;
        private double psp;
        private String universityName;

        private String mobileNumber;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Gender getGender() {
            return gender;
        }

        public Builder setGender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getUniversityName() {
            return universityName;
        }

        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public String getMobileNumber() {
            return mobileNumber;
        }

        public Builder setMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }

        private boolean validate() {
            return this.mobileNumber.length() == 10;
        }

        public Student build() throws InvalidArgumentException {
            if (!validate()) {
                throw new InvalidArgumentException();
            }

            return new Student(this);
        }
    }
}
