
package com.mycompany.tp13vet;

import java.util.ArrayList;

class Veterinaria {
    private ArrayList<Animal> animales;

    public Veterinaria() {
        animales = new ArrayList<>();
    }

    public void agregarAnimal(Animal a) {
        animales.add(a);
    }

    public void mostrarAnimales() {
        for (Animal a : animales) {
            a.mostrarInfo();
            a.hacerSonido();

            // Polimorfismo + downcasting para acceder a métodos propios
            if (a instanceof Dog) {
                ((Dog) a).correr();
            } else if (a instanceof Cat) {
                ((Cat) a).arañar();
            } else if (a instanceof Bird) {
                ((Bird) a).volar();
            } else if (a instanceof Fish) {
                ((Fish) a).nadar();
            }

            System.out.println(); // Salto de línea
        }
    }

    
}
    
