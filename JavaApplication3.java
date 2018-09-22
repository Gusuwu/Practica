package javaapplication3;

import java.util.Scanner;

public class JavaApplication3 {

    public static void main(String [] args){

        int eleccion;

        NewClient clienteNuevo = new NewClient();
        NewDisc discoNuevo = new NewDisc();
        AlquilerDisc alquiler = new AlquilerDisc();
        
        do{
        System.out.println("Elija una categoria: ");
        System.out.println("1- Nuevo Cliente ");
        System.out.println("2- Agregar Disco ");
        System.out.println("3- Alquiler de Disco");
        System.out.println("4- Busqueda");
        System.out.println("0- Salir");
       
        
        Scanner leer = new Scanner(System.in);
        eleccion = leer.nextInt();
        
        
        switch (eleccion){

            case 1: 
    
            for(int i=0 ; i < clienteNuevo.Nombre.length ; i++){
                 
                System.out.println("Ingrese nombre del nuevo cliente: ");
                String nombre = leer.next();
                clienteNuevo.Nombre[i] = nombre;
            }

            for(int i=0 ; i < clienteNuevo.cantDisc.length ; i++){
                
                System.out.println("Ingrese cantidad de discos: ");
                int cantdisc = leer.nextInt();
               
                if(cantdisc > 3){
                
                    do{
                        System.out.println("No se puede prestar mas de tres discos, intente de nuevo");
                        System.out.println("Ingrese cantidad de discos: ");
                        cantdisc = leer.nextInt();
                        
                    }while( cantdisc > 3 );
                    
                    
                }else{
                    
                    clienteNuevo.cantDisc[i] = cantdisc;
                }
                
             
            }
           
            clienteNuevo.largo++;
            
            break;
            
            case 2: 
                for(int i=0 ; i < discoNuevo.Titulo.length ; i++ ){
                    
                    System.out.println("Ingrese el titulo del disco: ");
                    
                    String titulo = leer.next();
                    
                    discoNuevo.Titulo[i] = titulo;                    
                 
                }
                
                for(int i = 0 ; i < discoNuevo.Tipo.length ; i++){
                 System.out.println("Elija una opcion para el tipo de disco: ");
                 System.out.println("1- Compacto ");
                 System.out.println("2- Video ");
                    
                 eleccion = leer.nextInt();
                   do{
                    switch(eleccion){
                        case 1: discoNuevo.Tipo[i] = "Compacto"; break;
                        case 2: discoNuevo.Tipo[i] = "Video"; break;
                        default: System.out.println("La opcion elegida es incorrecta, pruebe otra vez"); break;
                    }
                   }while(eleccion > 2 || eleccion == 0);
                }
                
                for(int i = 0 ; i < discoNuevo.Categoria.length ; i++){
                System.out.println("Elija una categoria: ");
                 System.out.println("1- Terror ");
                 System.out.println("2- Comedia ");
                 System.out.println("3- Drama");
                eleccion = leer.nextInt();
                   do{
                    switch(eleccion){
                        case 1: discoNuevo.Categoria[i] = "Terror"; break;
                        case 2: discoNuevo.Categoria[i] = "Comedia"; break;
                        case 3: discoNuevo.Categoria[i] = "Drama"; break;
                        default: System.out.println("La opcion elegida es incorrecta, pruebe otra vez"); break;
                    }
                   }while(eleccion > 3 || eleccion == 0);
                }
                
                discoNuevo.largo++;
                break;
                
            case 3:  
                
                for(int i=0 ; i < alquiler.Nombre.length; i++){
                    
                    System.out.println("Ingrese nombre: ");
                    String nombrealq = leer.next();
                    
                    alquiler.Nombre[i] = nombrealq;
                    
                }
                
                for(int i = 0 ; i < alquiler.Tipo.length ; i++){
                 System.out.println("Elija una opcion para el tipo de disco: ");
                 System.out.println("1- Compacto ");
                 System.out.println("2- Video ");
                 
                 eleccion = leer.nextInt();
                    
                   do{
                    switch(eleccion){
                        case 1: alquiler.Tipo[i] = "Compacto"; break;
                        case 2: alquiler.Tipo[i] = "Video"; break;
                        default: System.out.println("La opcion elegida es incorrecta, pruebe otra vez"); break;
                    }
                   }while(eleccion > 2 || eleccion == 0);
                }
         
                for(int i = 0 ; i < alquiler.Categoria.length ; i++){
                System.out.println("Elija una categoria: ");
                 System.out.println("1- Terror ");
                 System.out.println("2- Comedia ");
                 System.out.println("3- Drama");
                eleccion = leer.nextInt();
                   do{
                    switch(eleccion){
                        case 1: alquiler.Categoria[i] = "Terror"; break;
                        case 2: alquiler.Categoria[i] = "Comedia"; break;
                        case 3: alquiler.Categoria[i] = "Drama"; break;
                        default: System.out.println("La opcion elegida es incorrecta, pruebe otra vez"); break;
                    }
                   }while(eleccion > 3 || eleccion == 0);
                }
                
                for(int i=0 ; i < alquiler.Cant.length ; i++){
                        
                     System.out.println("Ingrese cantidad de discos: ");
                     int alqcantdisc = leer.nextInt();
                
                
               
                    if(alqcantdisc > 3){
                
                        do{
                            System.out.println("No se puede prestar mas de tres discos, intente de nuevo");
                            System.out.println("Ingrese cantidad de discos: ");
                            alqcantdisc = leer.nextInt();
                        
                        }while( alqcantdisc > 3 );
                    
                    
                    }else{
                    
                        alquiler.Cant[i] = alqcantdisc;
                    }
                
                
                
                 }
                
               
                for(int i=0; i < alquiler.Fecha.length; i++ ){
                    
                    String dia, mes, año;
                    
                    System.out.println("Ingrese el dia: ");
                    dia = leer.next();
                    
                    System.out.println("Ingrese el mes: ");
                    mes = leer.next();
                    
                    System.out.println("Ingrese el año");
                    año = leer.next();
                    
                    String fecha = dia+"/"+mes+"/"+año;
                    
                    alquiler.Fecha[i] = fecha;
                    
                    
                }

                alquiler.largo++;
                
                break;
        
            case 4: 
                
                String nombre;
                String nombreen;
                int cant;
                int canten;
                String dia, mes, año;
                String fecha;
                String fechaen;
                String tipo = "";
                String tipoen;
                
                System.out.println("Ingrese nombre: ");
                nombre = leer.next();
                
                System.out.println("Ingrese cantidad de discos retirados: ");
                cant = leer.nextInt();
                
                System.out.println("Ingrese dia: ");
                dia = leer.next();
                System.out.println("Ingrese dia: ");
                mes = leer.next();
                System.out.println("Ingrese dia: ");
                año = leer.next();
                
                fecha = dia+"/"+mes+"/"+año;
                
                System.out.println("Elija una opcion para el tipo de disco: ");
                System.out.println("1- Compacto ");
                System.out.println("2- Video ");
                eleccion = leer.nextInt();
                
                do{                    
                    switch(eleccion){
                        case 1: tipo = "Compacto"; break;
                        case 2: tipo = "Video"; break;
                        default: System.out.println("La opcion elegida es incorrecta, pruebe otra vez"); break;
                    }
                   }while(eleccion > 2 || eleccion == 0);
                
                
                for(int i = 0; i < alquiler.Nombre.length ;i++ ){
                
                    if(alquiler.Nombre[i].equalsIgnoreCase(nombre)){
                    
                        nombreen = alquiler.Nombre[i];
                        System.out.println(nombreen);
                    }
                    
                }

                for(int i=0; i < alquiler.Cant.length ; i++){
                    
                    if(alquiler.Cant[i] == cant){
                        
                        canten = alquiler.Cant[i];
                        System.out.println(canten);
                    }
                    
                }                
                
                for(int i = 0 ; i < alquiler.Fecha.length; i++){
                
                    if(alquiler.Fecha[i].equalsIgnoreCase(fecha)){
                    
                        fechaen = alquiler.Fecha[i];
                        System.out.println(fechaen);
                        
                    }
                    
                }
                
                for(int i = 0 ; i < alquiler.Tipo.length; i++){
                
                    if(alquiler.Tipo[i].equalsIgnoreCase(tipo)){
                    
                        tipoen = alquiler.Tipo[i];
                       
                        System.out.println(tipoen);
                                
                    }
                }
                break;
                
            default: System.out.println("La opcion no existe");break;
            }
        
        }while(eleccion > 0 || eleccion <= 5);
    }
}