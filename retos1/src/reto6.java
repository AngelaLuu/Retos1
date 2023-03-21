package retos1;

import java.util.Scanner;
public class reto6 {
    public static void main (String[]args){
      Scanner captura = new Scanner(System.in); 

        int gana;
        int eleccion;
      
        
        System.out.println("Cara o sello");
        gana = (int)(Math.random() * 2) + 1;
    
 
        System.out.println("Indique su jugada \n1.cara \n2.sello ");
        eleccion = captura.nextInt();
 
        System.out.print("Gana:");
        switch ( gana ) {
            case 1:
              System.out.print("cara");
              switch (eleccion) {
                case 1:
                System.out.print("ganas");
                break;
                case 2:
                System.out.print("pierdes");
            }
            break;
            case 2:
            System.out.print("sello");
            switch (eleccion) {
                case 1:
                System.out.print("pierdes");
                break;
                case 2:
                System.out.print("ganas");
            }
            break;



        }   

captura.close();

    }
}