package retos1;

import java.util.Random;
import java.util.Scanner;

public class reto8 {
 
        public static void main(String[] args) {
            Scanner captura = new Scanner(System.in);

            int trys=0;
            int numU;
            boolean adivino = false;
    
            Random random = new Random();
            int numA = random.nextInt(100) + 1;
            
            System.out.println("Tienes 10 intentos para adivinar un número entre 1 y 100.");
            
           
            while (!adivino && trys < 10) {
                System.out.print("Introduce tu número: ");
                numU = captura.nextInt();
                trys++;
    
                if (numU==numA) {
                    adivino = true;
                    System.out.println("Adivinasteee" + trys + " intentos.");
                } else if (numU<numA) {
                    System.out.println("Casi, el numero es mayor a" + numU);
                } else {
                    System.out.println("por poco, es menor a" + numU);
                }
            }
    
            if (!adivino) {
                System.out.println("Casi adivinas, pero el numero era " + numA);

                captura.close();
            }
     }
      }