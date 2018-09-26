//Errobidarte Augusto

/*
Escribir una implementación propia de la función abs, que devuelva el valor absoluto de
        cualquier valor que reciba.
*/

package Decisiones;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main (String [] args){

        int num;

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        num = leer.nextInt();


        System.out.println("El valor absoluto es " + valorAbsoluto(num));
    }


    static int valorAbsoluto (int a){

        int x;

        x = Math.abs(a);

        return x;
    }

}
