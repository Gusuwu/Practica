// Errobidarte Augusto

/*
    A un trabajador le pagan sus horas laboradas, si la cantidad de horas trabajadas es mayor a 40
    horas, la tarifa se incrementa en un 50% para las horas extras. Escriba un programa que
    permita calcular el salario del trabajador dadas las horas trabajadas y la tarifa por hora.
 */
package Decisiones;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String [] args){

        int horas;
        double tarifa;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de horas que trabajo: ");

        horas = leer.nextInt();

        System.out.println("Ingrese la tarifa por hora");
        tarifa = leer.nextInt();

        tarifaHoras(horas, tarifa);


    }

    static void tarifaHoras (int h, double t){


        double salario;
        double tarifaExt, horasExt;

        if (h > 40){
            tarifaExt = t + 0.50 * t;
            horasExt = h - 40;
            salario = horasExt * tarifaExt + 40 * t;
        }else{
            salario = t * h;
         }

        System.out.println("El salario es: " + salario);
    }

}
