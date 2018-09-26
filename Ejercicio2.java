//Errobidarte Augusto
/*
Escribir dos funciones que resuelvan los siguientes problemas:
        a) Dado un número entero n, indicar si es par o no.
        b) Dado un número entero n, indicar si es primo o no.
*/
package Decisiones;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main (String [] args){

        int num;

        Scanner leer = new Scanner(System.in);

        num = leer.nextInt();

        par(num);

        primo(num);

    }

    static void par(int a){
        if(a%2==0){
            System.out.println("Es par");
        }else{
            System.out.println("No es par");
        }
    }

    static void primo (int a){
        int b = a-1;
        while((a%b) != 0 ){
            b--;
        }

        if(b==1){
            System.out.println("Es primo");
        }else{
            System.out.println("No es primo");
        }

    }

}
