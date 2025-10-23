
package com.mycompany.tp13vet;

class Bird extends Animal {

    public Bird(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El pajaro canta: Pio pio!");
    }

    public void volar() {
        System.out.println("Vuela sobre la jaula.");
    }
    
}
