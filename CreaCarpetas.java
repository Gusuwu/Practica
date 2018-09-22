package creacarpetas;

import java.util.Scanner;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CreaCarpetas {

    public static void main (String [] args) throws IOException, InterruptedException{
    
        String dirName;
        
        int eleccion;
        
        do{
        Scanner leer = new Scanner(System.in);
    
        System.out.println("******************************");
        System.out.println("1- Crear carpeta");
        System.out.println("2- Borrar carpeta");
        System.out.println("3- Ver carpetas");
        System.out.println("0- Salir");
        System.out.println("******************************");
      
        System.out.print("Ingrese su eleccion:");
        eleccion = leer.nextInt();
        
 
        switch (eleccion){
            case 0: System.out.println("Gracias por usar este programa"); break;
            
            case 1:                 
                    Scanner leerv = new Scanner(System.in);
                    System.out.print("Ingrese un nombre para su carpeta: ");
                    dirName = leerv.nextLine();                   
                    String comando = "cmd /c md C:\\Users\\%username%\\Desktop\\" + dirName;                         
                    Runtime.getRuntime().exec(comando);
                    break;
            case 2:
                Scanner leerb = new Scanner(System.in);
                System.out.print("Ingrese el nombre de la carpeta para borrar: ");
                dirName = leerb.nextLine();
                String rdDir= "cmd /c rd C:\\Users\\%username%\\Desktop\\" + dirName;               
                Runtime.getRuntime().exec(rdDir);             
                break;        
                
            case 3: 
                
                Runtime.getRuntime().exec("cmd /c start dir C:\\Users\\%username%\\Desktop\\");
                
                break;
                
            default: System.out.println("La opcion elegida es incorrecta, pruebe otra vez"); break;
            }

        
        }while(eleccion > 0);

    }
        
}
