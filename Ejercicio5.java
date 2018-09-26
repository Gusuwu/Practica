//Errobidarte Augusto

/*
    Suponiendo que el primer día del año fue lunes, escribir una función que reciba un número con
    el día del año (de 1 a 366) y retorne el día de la semana que le toca.
    Por ejemplo: si recibe '3' debe devolver 'miércoles', si recibe '9' debe devolver 'martes'.
 */


package Decisiones;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main (String []args){

        int num;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero ");

        num = leer.nextInt();

        diaSemana(num);

    }

    static void diaSemana (int a) {

        switch (a){
            case 1:case 8:case 15:case 22:case 29:case 36:case 43:case 50:case 57:case 64:case 71:case 78: System.out.println("Es Lunes"); break;
            case 2:case 9:case 16:case 23:case 30:case 37:case 44:case 51:case 58:case 65:case 72:case 79: System.out.println("Es Martes"); break;
            case 3:case 10:case 17:case 24:case 31:case 38:case 45:case 52:case 59:case 66:case 73:case 80: System.out.println("Es Miercoles"); break;
            case 4:case 11:case 18:case 25:case 32:case 39:case 46:case 53:case 60:case 67:case 74:case 81: System.out.println("Es Jueves"); break;
            case 5:case 12:case 19:case 26:case 33:case 40:case 47:case 54:case 61:case 68:case 75:case 82: System.out.println("Es Viernes"); break;
            case 6:case 13:case 20:case 27:case 34:case 41:case 48:case 55:case 62:case 69:case 76:case 83: System.out.println("Es Sabado"); break;
            case 7:case 14:case 21:case 28:case 35:case 42:case 49:case 56:case 63:case 70:case 77:case 84: System.out.println("Es Domingo"); break;
        }

    }

}
