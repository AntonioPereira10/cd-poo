package com.campusdual.exercisespoo.exercise20;

import com.campusdual.exercisespoo.exercise14.Doctor;
import com.campusdual.exercisespoo.exercise14.Person;
import com.campusdual.exercisespoo.exercise14.PoliceOfficer;
import com.campusdual.exercisespoo.exercise14.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Collections01 {
    public static void main(String[] args) {
        List<Person> stringList = new ArrayList<>();

        stringList.add(new Person("John", "Smith"));
        stringList.add(new Teacher("Maria", "Montesorri", "Educacion"));
        stringList.add(new PoliceOfficer("Jake", "Peralta", "B-99"));
        stringList.add(new Doctor("Gregory", "House", "Nefrologia e infectologia"));

//        for (Person p: stringList) {
//            p.getDetails();
//        }

        for (int i=0; i<stringList.size();i++){
            stringList.get(i).getDetails();
        }


    }

}
