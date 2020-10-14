package com.company;
import java.util.ArrayList;

public class University {
    String name;
    Integer foundationYear;
    ArrayList<Student> studentsList = new ArrayList<Student>();
    Double averageMark;

    public University(String univerName, Integer univerFoundationYear) {
        name = univerName;
        foundationYear = univerFoundationYear;
    }

    private double getAverage() {
        Integer numberOfStudents = 0;
        Double sum = 0.0d;
        for (int i = 0; i < studentsList.size(); i++) {
            sum += studentsList.get(i).averageMark;
            numberOfStudents++;
        }

        averageMark = (double) sum / numberOfStudents;
        return averageMark;
    }

    public void getUniversityInfo() {
        System.out.println(name + "'s foundation year is: " + foundationYear);
        for (int i = 0; i < studentsList.size(); i++) {
            studentsList.get(i).getInfo();
        }
        System.out.println(name + "'s average mark: " + getAverage());
        System.out.println("\n");
    }
}
