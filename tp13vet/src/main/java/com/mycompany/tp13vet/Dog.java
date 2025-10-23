
package com.mycompany.tp13vet;

class Dog extends Animal {

    public Dog(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra: Guau guau!");
    }

    public void correr() {
        System.out.println("Corre felizmente.");
    } 
    
}
