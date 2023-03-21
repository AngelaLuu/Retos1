package retos1;
import java.util.Scanner;

public class reto3 {
    public static void main(String[] args) {
    String nomEmpl, nombCli;
    int precios, dinero, p, total=0, respuesta;

       
    Scanner captura=new Scanner(System.in);

    System.out.println("digite nombre del empleado");
    nomEmpl=captura.nextLine();
    
    

    System.out.println("Esta registado? 1 si es correcto, 2 si no");
        respuesta=captura.nextInt();
        if (respuesta==2) {
            System.out.println("digite nombre del Cliente");
            nombCli=captura.next();
        } else {
            System.out.println("Si esta registrado");
        }
        System.out.println("Digite el numero de productos que va a comprar");
        p=captura.nextInt();

        for(int i=0;i<p;i++){
        System.out.println("Digite precio del producto ");
        precios=captura.nextInt();
        total=total+precios;
        total++;
        
        
        }
        System.out.println("con cuanto va a pagar?");
        dinero=captura.nextInt();
        if (dinero<total) {
        System.out.println("No le alcanza para comprar ");
       }  else {
    int vueltas=dinero-total;
    System.out.println("Sus vueltas son:"+vueltas);
    System.out.println("El nombre del empleado es "+nomEmpl);

}

}
}

