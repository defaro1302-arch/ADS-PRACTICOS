package com.mycompany.tp13vet;

class Animal {
    private String nombre;
    private int edad;

    // Constructor
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " - Edad: " + edad);
    }
    
}
