//Errobidarte Augusto

/*
    Escriba una función que reciba 3 números decimales y los imprima de mayor a menor y de
    menor a mayor.
 */

package Decisiones;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main (String [] args){

        int num, num2, num3;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        num = leer.nextInt();
        System.out.println("Ingrese un numero: ");
        num2 = leer.nextInt();
        System.out.println("Ingrese un numero: ");
        num3 = leer.nextInt();

        menMay(num, num2, num3);

    }


    static void menMay (int a, int b, int c){

        int may;
        int med;
        int men;

        if(a > b){
            if(a > c){
                may=a;
            }else {
                may=c;
            }
        }else if(b > c){
            may=b;
        }else {
            may=c;
        }

        if(a > b){
            if (b > c){
                men=c;
            }else {
                men=b;
            }
        }else if(a > c){
            men=c;
        }else {
            men=a;
        }


        if(a > b && a > c){
            if (b > c){
                med=b;
            }else {
                med=c;
            }
        }else if(b > a && b > c){
            if (a > c){
                med=a;
            }else {
                med=c;
            }
        }else {
            if (a > b){
                med=a;
            }else{
                med=b;
            }
        }


        System.out.println(men + " " + med + " " + may);
        System.out.println(may + " " + med + " " + men);
    }



}
