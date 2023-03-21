package retos1;
import java.util.Scanner;

public class reto4 {
    public static void main (String[]args) {
        Scanner captura= new Scanner (System.in);
        int dinero, respuesta=1, apuesta; 
        String ganador="";

        System.out.println("digite el dinero con el que va a apostar");
        dinero= captura.nextInt();

        while (respuesta==1) {
            

            System.out.println("Digite el valor que va a apostar");
            apuesta=captura.nextInt();
            if (dinero>apuesta) {
                System.out.println("Digite quien es el ganador");
                ganador=captura.next();
            } else {
                System.out.println("No le alcanza para apostar");
                return;

            } if (ganador.equals("Jugador")) {
                dinero=apuesta+dinero;
            } else if (ganador.equals("Maquina")) {
                dinero=dinero-apuesta;
            } 
            System.out.println("Quieres seguir jugando? 1 si, 2 no");
            respuesta=captura.nextInt();
            

           
        }
        System.out.println("El dinero acumulado es "+dinero);


        
    }

    
}
