package com.example.introToOops;

public class Student {
    public String name;
    protected int age;
    String batchName; //default access modifier
    private String email;
    private double psp;

    void attendClass(){
        System.out.println("Student is attending the class");
    }

    void bookMockInterview(){
        System.out.println("Student is booking an Interview");
    }
}
