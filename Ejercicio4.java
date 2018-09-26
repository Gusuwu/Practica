//Errobidarte Augusto

/*
Escribir funciones que resuelvan los siguientes problemas:
    a) Dado un año indicar si es bisiesto. Nota: un año es bisiesto si es un número divisible por
        4, pero no si es divisible por 100, excepto que también sea divisible por 400.
    b) Dado un mes, devolver la cantidad de días correspondientes.
    c) Dada una fecha (día, mes, año), indicar si es válida o no.
    d) Dada una fecha, indicar los días que faltan hasta fin de mes.
    e) Dada una fecha, indicar los días que faltan hasta fin de año.
    f) Dada una fecha, indicar la cantidad de días transcurridos en ese año hasta esa fecha.
    g) Dadas dos fechas (día1, mes1, año1 y día2, mes2, año2), indicar el tiempo transcurrido
        entre ambas, en años, meses y días. Nota: en todos los casos, invocar las funciones
        escritas previamente cuando sea posible.
 */

package Decisiones;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        int año, mes, dia;
        int año2, mes2, dia2;

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un día");
        dia = leer.nextInt();

        System.out.println("Ingrese un mes");
        mes = leer.nextInt();

        System.out.println("Ingrese un año");
        año = leer.nextInt();

        bisiesto(año);
        diasMes(mes, año);
        fechaValida(dia,mes,año);
        System.out.println("Restan " + finDeMes(dia, mes, año) + " del mes");
        System.out.println("Restan " + diasAño(dia,mes,año)+" del año");
        System.out.println("Transcurrieron "+transAño(dia,mes,año)+" del año");

        System.out.println("Ingrese otro día");
        dia2 = leer.nextInt();

        System.out.println("Ingrese otro mes");
        mes2 = leer.nextInt();

        System.out.println("Ingrese otro año");
        año2 = leer.nextInt();

        System.out.println("Transcurrieron: ");
        dosFechas(dia, mes, año, dia2, mes2, año2);

    }

    static void bisiesto(int a) {

        if (a % 100 == 0) {
            if (a % 4 == 0) {
                System.out.println("El año es bisiesto");
            }
        } else if (a % 400 == 0) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }

    }

    static void diasMes(int a, int c) {

        switch (a) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("El mes tiene 31 días");
                break;

            case 2:
                if (c % 100 == 0) {
                    if (c % 4 == 0) {
                        System.out.println("El mes tiene 29 días");
                    }
                } else if (c % 400 == 0) {
                    System.out.println("El mes tiene 29 días");
                } else {
                    System.out.println("El mes tiene 28 días");
                }

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("El mes tiene 30 días");
                break;

            default:
                System.out.println("El numero ingresado no es correspondiente a un mes");
                break;
        }

    }

    static void fechaValida(int a, int b, int c) {

        if (a == 31 && b == 2) {
            System.out.println("La fecha no es valida");
        } else if (b == 0 || b == 4 || b == 6 || b == 9 || b == 11) {
            System.out.println("La fecha no es valida");
        } else if (a > 31) {
            System.out.println("La fecha no es valida");
        } else if (a == 29) {
            if (c % 100 == 0) {
                if (c % 4 == 0) {
                    System.out.println("La fecha es valida");
                }
            } else if (c % 400 == 0) {
                System.out.println("La fecha es valida");
            } else {
                System.out.println("La fecha no es valida");
            }
        } else {
            System.out.println("La fecha es valida");
        }
    }

    static int finDeMes(int a, int b, int c) {

        int diasRest = 0, diasMes;

        if (b == 1 || b == 3 || b == 5 || b == 7 || b == 8 || b == 10 || b == 12) {
            diasMes = 31;
            diasRest = diasMes - a;
        } else if (b == 2) {
            diasMes = 28;
            diasRest = diasMes - a;
            if (c % 100 == 0) {
                if (c % 4 == 00) {
                    diasMes = 29;
                    diasRest = diasMes - a;
                }
            } else if (c % 400 == 0) {
                diasMes = 29;
                diasRest = diasMes - a;
            } else {
                diasMes = 28;
                diasRest = diasMes - a;
            }
        } else {
            diasMes = 30;
            diasRest = diasMes - a;
        }


        return diasRest;
    }

    static int diasAño(int a, int b, int c) {

        int cont = -1;
        int diasRest = 0;

        if (b < 12) {
            diasRest = 31;

            if (b < 11) {
               diasRest += 30;

                if (b < 10) {
                    diasRest += 31;

                    if (b < 9) {
                        diasRest += 30;

                        if (b < 8) {
                            diasRest += 31;

                            if (b < 7) {
                                diasRest += 31;

                                if (b < 6) {
                                    diasRest += 30;

                                    if (b < 5) {
                                        diasRest += 31;

                                        if (b < 4) {
                                            diasRest += 30;

                                            if (b < 3) {
                                                diasRest += 31;

                                                if (b < 2) {
                                                    if (c % 100 == 0) {
                                                        if (c % 4 == 0) {
                                                            diasRest += 29;
                                                        }
                                                    } else if (c % 400 == 0) {
                                                        diasRest += 29;
                                                    } else {
                                                        diasRest += 28;
                                                    }

                                                }


                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

        cont = finDeMes(a,b,c) + diasRest;

        return cont;



    }

    static int transAño(int a, int b, int c){

        int diasTrans = -1;
        int dias=0;

        if (c % 100 == 0) {
            if (c % 4 == 0) {
                dias = 366;
            }
        } else if (c % 400 == 0) {
            dias = 366;
        } else {
            dias = 365;
        }

        diasTrans = dias - diasAño(a,b,c);

        return diasTrans;


    }

    static void dosFechas(int d, int m, int a, int d2, int m2, int a2) {

        int cantDias = 0;
        int dias = 0;
        int mes = 0;
        int años = 0;
        int meses = 0;
        mes = m2 - 1;
        if(mes==2){
            if ((a % 4 == 0) && ((a % 100 != 0) || (a % 400 == 0))){
                cantDias = 29;
            }else{
                cantDias = 28;
            }
        }else if(mes <= 7){
            if(mes == 0){
                cantDias = 31;
            }else if(mes % 2==0){
                cantDias = 30;
            }else{
                cantDias = 31;
            }
        }else if(mes > 7){
            if(mes % 2 == 0){
                cantDias = 31;
            }else{
                cantDias = 30;
            }
        }
        if((a2 > a) || (a2 == a && m2 > m) || (a2 == a && m2 == m && d2 > d)){
            System.out.println("La segunda fecha debe ser anterior a la primera");
        }else{
            if(m2 <= m){
                años = a - a2;
                if (d2 <= d){
                    meses = m - m2;
                    dias = cantDias - (d2 - d);
                }else{
                    if(m == m2){
                        años = años - 1;
                    }
                    meses = ( m - m2 - 1 + 12) % 12;
                    dias = cantDias - (d2 - d);
                }
            }else{
                años = a - a2 - 1;
                System.out.println(años);
                if(d2 > d){
                    meses = m - m2 - 1 + 12;
                    dias = cantDias - (d2 - d);
                }else{
                    meses = m - m2 + 12;
                    dias = d -d2;
                }
            }
        }

        System.out.println("Años: "+años);
        System.out.println("Meses: "+meses);
        System.out.println("Días: "+dias);


}


}










