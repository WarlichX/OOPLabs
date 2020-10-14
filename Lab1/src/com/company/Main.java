package com.company;
public class Main {

    public static void main(String[] args) {


        Student student1 = new Student("Thor Odin'son", 1500,  "male");
        student1.marks.add(7);
        student1.marks.add(8);
        student1.marks.add(7);


        Student student2 = new Student("Natasha Romanov", 150, "female");
        student2.marks.add(9);
        student2.marks.add(10);
        student2.marks.add(7);

        Student student3 = new Student("Vision", 1, "wasea");
        student3.marks.add(9);
        student3.marks.add(10);
        student3.marks.add(10);

        Student student4 = new Student("Vasile", 35,  "male");
        student4.marks.add(4);
        student4.marks.add(5);
        student4.marks.add(5);

        Student student5 = new Student("Gheorghe", 41,  "male");
        student5.marks.add(3);
        student5.marks.add(2);
        student5.marks.add(5);

        Student student6 = new Student("Andrei", 33,  "male");
        student6.marks.add(4);
        student6.marks.add(5);
        student6.marks.add(6);

        Student student7 = new Student("Snejana", 37,  "female");
        student7.marks.add(7);
        student7.marks.add(6);
        student7.marks.add(7);

        Student student8 = new Student("Vera", 52,  "female");
        student8.marks.add(6);
        student8.marks.add(7);
        student8.marks.add(7);

        Student student9 = new Student("Alina", 17,  "female");
        student9.marks.add(6);
        student9.marks.add(5);
        student9.marks.add(7);

        University uTm = new University("UTM", 1964);
        uTm.studentsList.add(student1);
        uTm.studentsList.add(student2);
        uTm.studentsList.add(student3);
        uTm.getUniversityInfo();

        University usm = new University("USM", 1946);
        usm.studentsList.add(student5);
        usm.studentsList.add(student6);
        usm.studentsList.add(student9);
        usm.getUniversityInfo();

        University asem = new University("ASEM", 1991);
        asem.studentsList.add(student4);
        asem.studentsList.add(student8);
        asem.studentsList.add(student7);
        asem.getUniversityInfo();

    }
}
