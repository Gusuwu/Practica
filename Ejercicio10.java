//Errobidarte Augusto

/*
    El promedio de prácticas de un curso se calculan en base a cuatro prácticas calificadas de las
    cuales se elimina la nota menor y se promedian las tres notas más altas. Escriba un programa
    que determine la nota elimina y el promedio de prácticas de un estudiante. Imprima ambos
    resultados.

 */
package Decisiones;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main (String [] args){

        int nota1, nota2, nota3, nota4;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la nota del primer practico: ");
        nota1=leer.nextInt();
        System.out.println("Ingrese la nota del segundo practico: ");
        nota2=leer.nextInt();
        System.out.println("Ingrese la nota del tercer practico: ");
        nota3=leer.nextInt();
        System.out.println("Ingrese la nota del cuarto practico: ");
        nota4=leer.nextInt();

        notasFinales(nota1, nota2, nota3, nota4);

    }

    static void notasFinales(int a, int b, int c, int d){

        int men;

        if(a > b){
            if (b > c){
                if (c > d){
                    men=d;
                }else {
                    men=c;
                }
            }else if(b > d){
                men=d;
            }else {
                men=b;
            }
        }else if (a > c){
            if (c > d){
                men = d;
            }else {
                men = c;
            }
        }else if (a > d){
            men = d;
        }else {
            men = a;
        }

        System.out.println("La nota eliminada es: " + men);
        System.out.println("El promedio es: " + ((a+b+c+d)-men));

    }

}
