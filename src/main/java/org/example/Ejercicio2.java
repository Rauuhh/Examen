package org.example;

import java.util.Scanner;

public class Ejercicio2 {
    public void ejercicio2() {
        System.out.print("Ingrese tu nombre: ");
        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.nextLine();
        System.out.println("La obra de " + nombre);
        System.out.println("Introduce el ancho de la pared");
        float ancho1 = entrada.nextInt();
        System.out.println("Introduce el altura de la pared");
        float altura1 = entrada.nextInt();
        System.out.println("Introduce el ancho del azulejo");
        float ancho2 = entrada.nextInt();
        System.out.println("Introduce el altura del azulejo");
        float altura2 = entrada.nextInt();
        float azulejo = 0;

        if (ancho1 < 1 || ancho2 < 1 || altura1 <1 || altura2 <1 )
        {System.out.println("El azulejo o la pared no puede medir 0 o menos en todas sus direcciones");
        System.exit(0);}

        if (ancho2 == altura2) {
            System.out.println("El azulejo no puede ser cuadrado");
            System.exit(0);
        }
        if ( ancho1 * altura1 < ancho2 * altura2 )
        {
            System.out.println("El azulejo no puede ser mas grande que la pared");
            System.exit(0);
        }
        if ( ancho1 * altura1 > ancho2 * altura2 )
        {
            azulejo = ((ancho1 * altura1) / (ancho2 * altura2));
                    System.out.println("Se necesitan " + azulejo + " azulejos");
        }

        //Lo que hace el programa es calcular los azulejos que necesitamos para una pared, dandole nosotros el ancho y el alto de cada atributo, si algun atributo es 0, el azulejo es cuadrado o el azulejo es mas grande que la pared, nos saldra del programa, sino nos dira cuantos azulejos necesitamos para la pared
    }
}