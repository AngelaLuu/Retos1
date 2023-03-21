package retos1;

import java.util.Scanner;

public class reto7 {

    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);

        int empates = 0, ganadas = 0, perdidas = 0;
        String nombre;
        int valorapuesta;
        int apuesta=0;
        int OpcionUsu;

        System.out.println("Ingrese su nombre:");
        nombre=captura.nextLine();
         
        System.out.println("cuanto quieres apostar: ");
        valorapuesta=captura.nextInt();

        if (valorapuesta < 10000) {
            System.out.println("Su apuesta tiene que ser mayor a 10.000");
            return;
        }

        System.out.println("Cuántas rondas quieres jugar: ");
        int numRondas = captura.nextInt();

        
        for (int i = 0; i < numRondas; i++) {
            System.out.println("Ronda " + (i + 1));
            System.out.println("Indique su jugada \n1.Piedra \n2.Papel \n3.Tijera");
            OpcionUsu = captura.nextInt();
            int OpcionCompu = (int)(Math.random() * 3) + 1;
            System.out.println("La computadora ya escogio..");


            System.out.print("La computadora habia escogido: ");
        switch ( OpcionCompu )
        {
            case 1:
                System.out.println("Piedra");
                switch ( OpcionUsu )
                {
                   case 1: System.out.println("Empatan"); 
                   empates++;
                   break;
                   case 2: System.out.println("Ganadoor"); 
                   ganadas++;
                   apuesta=valorapuesta+apuesta;
                   break;
                   case 3: System.out.println("La compu es ganador");
                   perdidas++;
                    break;
                }
                break;
 
            case 2:
                System.out.println("Papel");
                switch ( OpcionUsu )
                {
                   case 1: System.out.println("La compu es ganador");
                   perdidas++;
                   break;
                   case 2: System.out.println("Empatan"); 
                   empates++;
                   break;
                   case 3: System.out.println("Ganadoor"); 
                   ganadas++;
                   apuesta=valorapuesta+apuesta;

                   break;
                }
                break;
 
            case 3:
                System.out.println("Tijera");
                switch ( OpcionUsu )
                {
                   case 1: System.out.println("Ganadoor"); 
                   ganadas++;
                   apuesta=valorapuesta+valorapuesta;
                   break;
                   case 2: System.out.println("La compu es ganador"); 
                   perdidas++;
                   apuesta=valorapuesta-valorapuesta;
                   break;
                   case 3: System.out.println("Empatan"); 
                   empates++;
                   break;
                }
                break;
        }

        
 }
        System.out.println("Jugador:"+nombre);
        System.out.println("Ganadas: " + ganadas);
        System.out.println("Perdidas: " + perdidas);
        System.out.println("Empates: " + empates);
        System.out.println("Valor apuesta: " + apuesta);


        captura.close();
}
}
