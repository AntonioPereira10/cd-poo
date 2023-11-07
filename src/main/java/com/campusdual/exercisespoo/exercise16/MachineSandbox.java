package com.campusdual.exercisespoo.exercise16;

public class MachineSandbox {
    public static void main(String[] args) {
       IMachine p1= new Plane("Pegasus");
        p1.start();
        p1.stop();
        p1.mantenaince();
//        p1.takeOff();
//        p1.fly();
//        p1.landOff();

        IMachine t1=new Tractor(1200);
//        t1.start();
//        t1.stop();
//        t1.mantenaince();
//        t1.forward();
//        t1.backward();

//        System.out.println(p1.getDetails());
//        System.out.println(t1.getDetails());

        ((Plane)p1).fly();

    }
}
