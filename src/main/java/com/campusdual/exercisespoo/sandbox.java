package com.campusdual.exercisespoo;

import com.campusdual.exercisespoo.exercise14.Doctor;
import com.campusdual.exercisespoo.exercise14.Person;
import com.campusdual.exercisespoo.exercise14.PoliceOfficer;
import com.campusdual.exercisespoo.exercise14.Teacher;

public class sandbox {

    public static void main(String[] args) {
        perro perro1 = new perro(90, false, "Husky", "Balto", "Negro");

        perro1.ladrar();
        perro1.presentarse();

        Person p1 = new Person("John", "Dee");
        Teacher t1 = new Teacher("Maria","Montessor","Eduación");
        PoliceOfficer pO1 = new PoliceOfficer ("Luis", "Barrio", "Nefrología");
        Doctor d1 = new Doctor ("Jesus", "Pereira","Pediatría");
        p1.getDetails();
        t1.getDetails();
        pO1.getDetails();
        d1.getDetails();
    }
}
