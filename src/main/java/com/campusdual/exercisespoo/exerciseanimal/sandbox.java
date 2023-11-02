package com.campusdual.exercisespoo.exerciseanimal;

public class sandbox {
    public static void main(String[] args) {
        Perro perro1 = new Perro(40,15.5,5,"Tierra","4 patas",
                "Canis Lupus","Balto","Casa","Guau Guau!");
        Caballo caballo1 = new Caballo( 180,400,10, "Pradera","4 patas",
                "Equus Caballus", "Spirit","Granja","Hiii, hiii!");
        Halcon halcon1 = new Halcon(34,15,3,"Colina Abierta","dos alas",
                "Falco peregrinus","Falco","Aire","Auu, Auu!");
        Pollo pollo1 = new Pollo(10,8.65,1,"Tierra","Alado",
                "Gallus Domesticus","Calimero","Aire","Pio Pio!");
        Orca orca1 = new Orca(110 ,300, 10, "Agua", "Carnivoro",
                "Orcinus Orca","Willy","Océano","Chiir, Chiir!");
        Delfin delfin1 = new Delfin(200,250,4,"marino","aletas y carnivoros",
                "Delphinidae","Flipper","Océano","Biii, biii!");



        perro1.presentarse();
        caballo1.presentarse();
        halcon1.presentarse();
        pollo1.presentarse();
        orca1.presentarse();
        delfin1.presentarse();
    }
}
