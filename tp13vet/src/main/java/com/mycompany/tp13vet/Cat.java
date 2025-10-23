
package com.mycompany.tp13vet;

class Cat extends Animal {

    public Cat(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El gato maulla: Miau miau!");
    }

    public void arañar() {
        System.out.println("Arana el sillon.");
    }
    
}
