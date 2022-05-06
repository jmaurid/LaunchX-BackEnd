package semana1.viernes;


class Animal {
    //Caso 1
    String color = "blanco";

    //Caso 2
    void eat(){
        System.out.println("Comiendo...");
    }

    //Caso 3
    Animal(){
        System.out.println("Se crea un animal.");
    }
}

class Gato extends Animal{
    //Caso 1
    String color = "Cafe";

    void printColor(){
        System.out.println("Color de la clase Gato: " + color);
        System.out.println("Color de la clase animal: " + super.color);
    }

    //Caso 2
    void eat(){
        System.out.println("Come atún.");
    }

    void dormir(){
        System.out.println("Ya se durmió el michi");
    }

    void call(){
        super.eat();
        dormir();
    }

    Gato(){
        super();
        System.out.println("Se ha creado un gato.");
    }
}

public class SuperTest {
    public static void main(String[] args) {

        //Caso 1
        new Gato().printColor();

        //Caso 2
        new Gato().call();

        //Caso 3
        new Gato();
    }
}
