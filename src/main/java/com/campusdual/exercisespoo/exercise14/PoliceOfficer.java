package com.campusdual.exercisespoo.exercise14;

public class PoliceOfficer extends Person{
    private  String squad;
    public String getSquad() {
        return squad;
    }

    public void setSquad(String squad) {
        this.squad = squad;
    }
    public PoliceOfficer(String name, String surname, String squad){
        super(name, surname);
        this.squad = squad;
    }

}
