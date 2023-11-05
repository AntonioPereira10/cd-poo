package com.campusdual.exercisespoo;

import java.sql.SQLOutput;

/*
Crea una clase llamada Cat
La clase debe tener las siguientes propiedades sin inicializar:
- nombre (name)
- raza (breed)
- sexo (sex)
- edad en meses (age) (estática)
- tamaño del pelo (hair)
- color del pelo (colour) (estática)
- un booleano que indique si está castrado/a o no (castrated)I

La clase debe tener las siguientes propiedades con los valores inicializados
- el color de los ojos (eyeColour): "green"

Crea un constructor que incluya todos los atributos no inicializados

Crea un método estático que cambie el color del pelo y otro no estático que cambie el color de los ojos

Crea un método estático que cambie la edad del gato y otro no estático que permita recuperar ese valor cuando se invoque

Crea un método no estático que castre a los gatos y otro no estático, llamado isCastrated, que devuelva su estado

Crea un método no estático llamado catDetails() que muestre todas las características de un gato (sé original en la presentación de los datos, dale un poco de arte)

Crea un main()

Crea un gato de la raza siamesa, otro de raza persa, y otro de raza esfinge

Castra a los dos primeros gatos cambiando su booleano a true. Deja el otro gato sin castrar (false)

Cámbiale el color del pelo a los dos primeros gatos

Cámbiale el color de los ojos al último gato

Cambia la edad del último gato. Intenta ponerle un valor negativo (su setter debe hacer la comprobación)

Muestra los detalles de cada gato (fijaros qué dato muestra en la edad y el color del pelo)

Vuelve a hacer el ejercicio en una nueva clase CatEncapsulated, aplicando la encapsulación (atributos private, ninguno estático, getters y setters)
  Verás cómo afecta a los métodos estáticos
*/
public class Cat {
    public String name;
    public String breed;
    public String sex;
    public static int age;
    public String hair;
    public static String colour;
    public boolean castrated;
    private String eyeColour = "Green";

    public Cat(String name, String breed, String sex, int age, String hair, String colour, boolean castrated) {
        this.name = name;
        this.breed = breed;
        this.sex = sex;
        Cat.age = age;
        this.hair = hair;
        Cat.colour = colour;
        this.castrated = castrated;
    }
//    Crea un método estático que cambie el color del pelo y otro no estático que cambie el color de los ojos
    public static void changeColour(String newColour){
        Cat.colour = newColour;
    }
    public void changeEyeColour(String newEyeColour){
        eyeColour = newEyeColour;
    }
//    Crea un método estático que cambie la edad del gato y otro no estático que permita recuperar ese valor cuando se invoque
    public static void chageAge(int newAge) {
        if (newAge > 0) {
            Cat.age = newAge;
        } else {
            System.out.println("La edad introducida no puede ser 0 o negativa");
        }
    }
    public int getAge(){
        return age;
    }
//    Crea un método no estático que castre a los gatos y otro no estático, llamado isCastrated, que devuelva su estado
    public void changeCastrated(){
        this.castrated = true;
    }
    public void isCastrated(){
        if(this.castrated == true){
            System.out.println("Este gato está castrado.");
        }else{
            System.out.println("Este gato no está castrado.");
        }
    }
//    Crea un método no estático llamado catDetails() que muestre todas las características de un gato (sé original en la presentación de los datos, dale un poco de arte)
    public void catDetails(){
        System.out.println("Su nombre es: "+this.name+".");
        System.out.println("Su raza es: "+this.breed+".");
        System.out.println("Su sexo es: "+this.sex+".");
        System.out.println("Su edad es: "+Cat.age+" meses.");
        System.out.println("Su pelo es: "+this.hair+".");
        System.out.println("Es de color: "+Cat.colour+".");
        isCastrated();
        System.out.println("Sus ojos son de color: "+eyeColour);
        System.out.println(" ");
    }
//    Crea un main()
//    Crea un gato de la raza siamesa, otro de raza persa, y otro de raza esfinge
    public static void main(String[] args) {
        Cat gatoJinx = new Cat("Jinx","Siamesa","Hembra",18,"Corto","Gris",false);
        gatoJinx.changeCastrated();
        Cat.changeColour("Marrón");
        gatoJinx.catDetails();

        Cat gatoNoqui = new Cat("Noqui","Persa","Macho",4,"Corto","Negro",false);
        gatoNoqui.changeCastrated();
        Cat.changeColour("Blanco");
        gatoNoqui.catDetails();


        Cat gatoClean = new Cat("Clean","Esfinge","Macho",13,"Largo","Blanco",false);
        gatoClean.changeEyeColour("Blue");
        chageAge(-5);
        gatoClean.catDetails();


//     Castra a los dos primeros gatos cambiando su booleano a true. Deja el otro gato sin castrar (false)
//     Cámbiale el color del pelo a los dos primeros gatos
//     Cámbiale el color de los ojos al último gato
//        Cambia la edad del último gato. Intenta ponerle un valor negativo (su setter debe hacer la comprobación)




    }
}

