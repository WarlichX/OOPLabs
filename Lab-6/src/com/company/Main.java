package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person( "patient1", "person1Name", "Ion1", "Frunza1",
                new Date(2001, 01, 01), "male", "Moldova, Chisinau", "+373737373773");

        Person p2 = new Person( "patient2", "person2Name", "Ion2", "Frunza2",
                new Date(2002, 01, 01), "male", "Moldova, Chisinau", "+373737373773");

        Person p3 = new Person( "patient3", "person3Name", "Ion3", "Frunza3",
                new Date(2003, 01, 01), "male", "Moldova, Chisinau", "+373737373773");

        Person p4 = new Person( "staff", "person4Name", "Ion4", "Frunza4",
                new Date(2003, 01, 01), "male", "Moldova, Chisinau", "+373737373773");

        Person p5 = new Person( "staff", "person5Name", "Ion5", "Frunza5",
                new Date(2003, 01, 01), "male", "Moldova, Chisinau", "+373737373773");

        Person p6 = new Person( "staff", "person6Name", "Ion6", "Frunza6",
                new Date(2003, 01, 01), "male", "Moldova, Chisinau", "+373737373773");

        Person doctor1 = new Person( "docs", "Doctor1 name", "Doctor1 middle name", "Doctor1 lastname",
                new Date(2003, 01, 01), "male", "Moldova, Chisinau", "+373737373773");

        Person doctor2 = new Person( "docs", "Doctor2 name", "Doctor2 middle name", "Doctor2 lastname",
                new Date(2003, 01, 01), "male", "Moldova, Chisinau", "+373737373773");

        Patient patient1 = new Patient(p1, "001", 20, new Date(2021, 01, 01),
                new String[]{"sick1", "sick2"}, new String[]{"pres1", "pres2"}, new String[]{"alerg1", "alerg2"},
                new String[]{"spec1", "spec2"});

        Patient patient2 = new Patient(p2, "002", 20, new Date(2022, 01, 01),
                new String[]{"sick1", "sick2"}, new String[]{"pres1", "pres2"}, new String[]{"alerg1", "alerg2"},
                new String[]{"spec1", "spec2"});

        Patient patient3 = new Patient(p3, "003", 20, new Date(2023, 01, 01),
                new String[]{"sick1", "sick2"}, new String[]{"pres1", "pres2"}, new String[]{"alerg1", "alerg2"},
                new String[]{"spec1", "spec2"});

        ArrayList<Person> group1 = new ArrayList<Person>();
        group1.add(patient1);
        group1.add(patient2);
        group1.add(p4);
        group1.add(doctor1);

        ArrayList<Person> group2 = new ArrayList<Person>();
        group1.add(patient3);
        group2.add(p5);
        group2.add(p6);
        group2.add(doctor2);

        Hospital hospital1 = new Hospital("Hospital - 1", "MD Chisinau", "+3737373737", group1);

        patient1.setHospital(hospital1);

        Hospital hospital2 = new Hospital("Hospital - 2", "MD Chisinau", "+3737373737", group2);

        Department dep1_1 = new Department(hospital1);
        Department dep1_2 = new Department(hospital1);
        ArrayList<Department> hospital1Departments = new ArrayList<>();
        hospital1Departments.add(dep1_1);
        hospital1Departments.add(dep1_2);
        hospital1.setDepartments(hospital1Departments);

        Department dep2_1 = new Department(hospital2);
        Department dep2_2 = new Department(hospital2);

        Staff staff1Hospital2 = new Staff(p5, new Date(2018, 10, 10), new String[]{"education1", "education2"},
                new String[]{"certification1", "certification2"}, new String[]{"lang1", "lang2"}, dep2_1);

        Staff staff2Hospital2 = new Staff(p6, new Date(2017, 10, 10), new String[]{"education1", "education2"},
                new String[]{"certification1", "certification2"}, new String[]{"lang1", "lang2"}, dep2_1);
        ArrayList<Staff> staffGroup = new ArrayList<Staff>();
        staffGroup.add(staff1Hospital2);
        staffGroup.add(staff2Hospital2);
        dep2_1.setStaffs(staffGroup);

        Staff staff1Hospital1 = new Staff(p4, new Date(2015, 10, 10), new String[]{"education1", "education2"},
                new String[]{"certification1", "certification2"}, new String[]{"lang1", "lang2"}, dep2_2);

        Doctor doc1 = new Doctor(
                doctor1,
                staff1Hospital1,
                new String[]{"speciality doctor1"},
                new String[]{"locations doctor1"});

        ArrayList<Patient> patientsForOperation = new ArrayList<Patient>();
        patientsForOperation.add(patient1);


        Surgeon surgeon1 = new Surgeon(doc1, patientsForOperation);

        Person receptionistPerson = new Person( "receptionist", "Receptionists name", "Receptionists middle name", "Receptionists lastname",
                new Date(2013, 01, 01), "male", "Moldova, Chisinau", "+373737373773");

        Staff receptionistStaff = new Staff(receptionistPerson, new Date(2013, 10, 10), new String[]{"reception-education1", "education2"},
                new String[]{"certification1", "certification2"}, new String[]{"lang1", "lang2"}, dep2_1);

        Receptionist reception = new Receptionist(receptionistPerson, receptionistStaff);

        System.out.println("Relation Person-Hospital:");
        System.out.println("Hospital Name: " + hospital1.hospitalName);
        System.out.println("Persons First Name from this hospital:");;
        hospital1.showPersonsFirstName();
        System.out.println();

        System.out.println("Relation Hospital-Department-Staff:");
        System.out.println("Hospital Name: " + hospital1.hospitalName);
        System.out.println("Number of Departments in Hospital1: " + hospital1.departments.size());
        System.out.println("Relation Department can have multiple staffs: ");
        System.out.println("Number of Staffs from first department in second hospital: " + dep2_1.staffs.size());
        System.out.println();

        System.out.println("Relation Patient-Person");
        System.out.println("Person Name: " + patient1.getFullName());
        System.out.println("Patient Prescriptions: " + patient1.prescriptions[0]);
        System.out.println("Patient Hospital Name: " + patient1.hospital.hospitalName);
        System.out.println();

        System.out.println("As well we have the relation that each patient can have multiple OperationsStaffs members");
        System.out.println("As one OperationsStaff member can have multiple patients\n");

        System.out.println("Surgeon Relations:");
        System.out.println("Relation with Person class (surgeon-FullName) -> " + surgeon1.getFullName());
        System.out.println("Relation with Staff class (surgeon-certification) -> " + surgeon1.certification[0]);
        System.out.println("Relation with OperationsStaff (patient FullName to be operated by surgeon)-> " + surgeon1.patients.get(0).getFullName());
        System.out.println("Relation with Department & Hospital class (hospital name thru department class field)-> " + surgeon1.department.hospital.hospitalName + "\n");

        System.out.println("Receptionist Relations:");
        System.out.println("Relation with Person class (receptionist-FullName) -> " + reception.getFullName());
        System.out.println("Relation with Administrative & Staff class (receptionist-education) -> " + reception.education[0]);
        System.out.println("Relation with Department & Hospital class (hospital name thru department class field) -> " + reception.department.hospital.hospitalName);

    }
}
