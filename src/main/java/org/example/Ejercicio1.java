package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    public void ejercicio1 () {
        Scanner entrada = new Scanner(System.in);
        boolean hola = true;
        int numero = 0 ;
        while (hola == true) {
            try {
                System.out.println("Introduce un numero... ");
                numero = entrada.nextInt();
                hola = false;

            } catch (InputMismatchException error) {
                System.out.println("Introduce un numero valido");
                entrada.nextLine();
            }
            if (numero > 0) {
                System.out.println("El numero absoluto es " + numero);
            }
            else {
                numero = numero * -1 ;
                System.out.println("El numero absoluto es " + numero);
            }
            //Funcion de programa: preguntamos al ususario que ponga un numero, si popnemos un numero valido, miramos si es menos que 0, si es menor que 0, multiplicamos ese numero por -1 ( -3 * -1 ) para que nos de el numero que hemos escrito pero de manera absoluta, es decir positivamente, si lo escribes mayor que 0 no hara falta la operacion ya que tenemos el numero de forma absoluta.
            // El try catch lo que nos hace aqui es por si el usuario mete un valor que no queremos, en este caso solo debe meter numeros, si mete letras o simbolos... le dira el programa que introduzca un numero valido hasta que ponga un numero, si lo pone bien a la primera no lo volvera a preguntar gracias al booleano que hemos definido fuera y dentro del try

        }
    }
}

