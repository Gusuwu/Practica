//Errobidarte Augusto

/*
Escribir una función que, dados cuatro números, devuelva el mayor producto de dos de ellos.
        Por ejemplo, si recibe los números 1, 5, -2, -4 debe devolver 8, que es el producto más grande
        que se puede obtener entre ellos (8 = -2 × -4).
*/

package Decisiones;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main (String [] args){

        int a, b, c, d;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un valor: ");
        a = leer.nextInt();

        System.out.println("Ingrese un valor: ");
        b = leer.nextInt();

        System.out.println("Ingrese un valor: ");
        c = leer.nextInt();

        System.out.println("Ingrese un valor: ");
        d = leer.nextInt();

        System.out.println("El producto mayor es: " + productoMayor(a,b,c,d));

    }

    static int productoMayor (int a, int b, int c, int d){

        int x1, x2, x3, z1, z2, c1;

        int result=0;

        x1 = a*b;

        x2 = a*c;

        x3 = a*d;

        z1 = b*c;

        z2 = b*d;

        c1 = c*d;


        if (x1 > x2){
            if (x1 > x3){
                if(x1 > z1){
                    if(x1 > z2){
                        if(x1 > c1){
                            result = x1;
                        }else{
                            result = c1;
                        }
                    }else if(z2 > c1){
                        result = z2;
                    }else {
                        result = c1;
                    }
                }else if(z1 > z2){
                    if (z1 > c1){
                        result = z1;
                    }else {
                        result = c1;
                    }
                }
            } else if(x3 > z1){
                if (x3 > z2){
                    if(x3 > c1){
                        result = x3;
                    }else{
                        result = c1;
                    }
                }
            }

        }else if (x2 > x3){
            if(x2 > z1){
                if (x2 > z2){
                    if(x2 > c1){
                        result = x2;
                    }else{
                        result = c1;
                    }
                }
            }else if(z1 > z2){
                if (z1 > c1) {
                    result = z1;
                }else {
                    result = c1;
                }
            }else if(z2 > c1){
                result = z2;
            }else {
                result = c1;
            }
        }else if(x3 > z1){
            if (x3 > z2){
                if (x3 > c1){
                    result = x3;
                }else{
                    result = c1;
                }

            }else if(z2 > c1){
                result = z2;
            }else{
                result = c1;
            }
        }else if(z1 > z2){
            if (z1 > c1){
                result = z1;
            }else{
                result = c1;
            }
        }else if (z2 > c1){
            result = z2;
        }else {
            result = c1;
        }

        return result;
    }


}
