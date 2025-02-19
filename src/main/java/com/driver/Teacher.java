package com.driver;

public class Teacher {
    private String name;
    private int age;
    private int yearsOfExperience;
    private int numberOfStudents;


    // No-argument constructor
    public Teacher() {
    }

    // Parameterized constructor
    public Teacher(String name, int age, int yearsOfExperience) {
        this.name = name;
        this.age = age;
        this.yearsOfExperience = yearsOfExperience;
        this.numberOfStudents =0;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

        public int getNumberOfStudents() {
            return numberOfStudents;
        }

        // Method to update the number of students (if required)
        public void setNumberOfStudents(int numberOfStudents) {
            this.numberOfStudents = numberOfStudents;
    }
}
