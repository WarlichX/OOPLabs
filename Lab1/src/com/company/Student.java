package com.company;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student {
    String name;
    Integer age;
    String gender;
    ArrayList<Integer> marks = new ArrayList<Integer>();
    Double averageMark;


    public Student(String studentName, Integer studentAge, String studentGender) {
        name = studentName;
        age = studentAge;
        gender = studentGender;
    }
    public String getPronoun() {
        if (gender == "male") {
            return "he";
        } else if (gender == "female") {
            return "she";
        } else {
            return "(unknown identity)";
        }
    }

    public double getAverage() {
        Integer numberOfMarks = marks.size();
        Integer sum = 0;
        for (int i = 0; i < numberOfMarks; i++) {
            sum += marks.get(i);
        }
        averageMark = (double) sum / numberOfMarks;
        return averageMark;
    }

    public void getInfo() {
        System.out.println(name +"'s age is " + age + ", and " + getPronoun() + " has the following marks:" + marks +
                "\nAverage mark: " + getAverage());
    }
}
