//Errobidarte Augusto

/*
    Escriba un programa de astrología, en donde el usuario debe ingresar el día y mes de su
    cumpleaños y el programa le debe decir a qué signo corresponde.
 */

package Decisiones;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main (String [] args){

        Scanner leer = new Scanner(System.in);

        int dia, mes;

        System.out.println("Ingrese el dia de su cumpleaños: ");

        dia = leer.nextInt();

        System.out.println("Ingrese el mes de su cumpleaños: ");

        mes = leer.nextInt();

        signosZodiac(dia, mes);

    }


    static void signosZodiac(int a, int b){

        switch (b){

            case 1: if(a > 20){
                System.out.println("Es Acuario");
            }else{
                System.out.println("Es Capricornio");
            } break;

            case 2: if(a > 19){
                System.out.println("Es Piscis");
            }else {
                System.out.println("Es Acuario");
            } break;

            case 3: if(a > 20){
                System.out.println("Es Aries");
            }else{
                System.out.println("Es Piscis");
            } break;

            case 4: if (a > 20){
                System.out.println("Es Tauro");
            }else {
                System.out.println("Es Aries");
            } break;

            case 5: if (a > 20){
                System.out.println("Es Geminis");
            }else {
                System.out.println("Es Tauro");
            } break;

            case 6: if (a > 21){
                System.out.println("Es Cancer");
            }else {
                System.out.println("Es Geminis");
            } break;

            case 7: if (a > 23){
                System.out.println("Es Leo");
            }else {
                System.out.println("Es Cancer");
            } break;

            case 8: if (a > 23){
                System.out.println("Es Virgo");
            }else {
                System.out.println("Es Leo");
            } break;

            case 9: if (a > 23){
                System.out.println("Es Libra");
            }else {
                System.out.println("Es Virgo");
            } break;

            case 10: if (a > 22){
                System.out.println("Es Escorpio");
            }else {
                System.out.println("Es Libra");
            } break;

            case 11: if (a > 22){
                System.out.println("Es Sagitario");
            }else {
                System.out.println("Es Escorpio");
            } break;

            case 12: if (a > 21){
                System.out.println("Es Capricornio");
            }else {
                System.out.println("Es Sagitario");
            } break;

        }


    }


}
