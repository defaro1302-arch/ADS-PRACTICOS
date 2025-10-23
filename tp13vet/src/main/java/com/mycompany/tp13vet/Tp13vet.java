
package com.mycompany.tp13vet;

public class Tp13vet {

    public static void main(String[] args) {
   
        Veterinaria vet = new Veterinaria();

        Dog perro = new Dog("Max", 5);
        Cat gato = new Cat("Luna", 3);
        Bird pajaro = new Bird("Piolin", 1);
        Fish pez = new Fish("Nemo", 2);

        vet.agregarAnimal(perro);
        vet.agregarAnimal(gato);
        vet.agregarAnimal(pajaro);
        vet.agregarAnimal(pez);

        vet.mostrarAnimales();
    }
}
