package retos1;

import java.util.Scanner;
 
public class reto5
{
    public static void main(String args[]) {
      Scanner captura = new Scanner(System.in); 
        int OpcionUsu;
        

        System.out.println("Juego piedra, papel o tijera");
        
        int OpcionCompu = (int)(Math.random() * 3) + 1;

 
        System.out.println("Indique su jugada \n1.Piedra \n2.Papel \n3.Tijera");
        OpcionUsu = captura.nextInt();
 
        System.out.print("La computadora habia escogido: ");
        switch ( OpcionCompu )
        {
            case 1:
                System.out.println("Piedra");
                switch ( OpcionUsu )
                {
                   case 1: System.out.println("Empatan"); 
                   break;
                   case 2: System.out.println("Ganadoor"); 
                   break;
                   case 3: System.out.println("La compu es ganador");
                    break;
                }
                break;
 
            case 2:
                System.out.println("Papel");
                switch ( OpcionUsu )
                {
                   case 1: System.out.println("La compu es ganador"); 
                   break;
                   case 2: System.out.println("Empatan"); 
                   break;
                   case 3: System.out.println("Ganadoor"); 
                   break;
                }
                break;
 
            case 3:
                System.out.println("Tijera");
                switch ( OpcionUsu )
                {
                   case 1: System.out.println("Ganadoor"); 
                   break;
                   case 2: System.out.println("La compu es ganador"); 
                   break;
                   case 3: System.out.println("Empatan"); 
                   break;
                }
                break;
        }
    }
}