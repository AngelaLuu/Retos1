package retos1;
import java.util.Scanner;
public class reto2 {
    public static void main(String[] args) {
        Scanner reto2 = new Scanner(System.in);
    
        String nombreBebe;
        String nombreMa;
        double pesoBebe;
        double mesesBebe;


        System.out.println ("ingrese el nombre del bebe");
        nombreBebe = reto2.nextLine();
        System.out.println ("ingrese el nombre de la mama");
        nombreMa = reto2.nextLine();
        System.out.print ("ingrese el peso del bebe");
        pesoBebe = reto2.nextDouble();
        System.out.print ("ingrese los meses del bebe");
        mesesBebe = reto2.nextDouble();




        System.out.print ("su dosis es: "+ ((pesoBebe+10)/(mesesBebe*10)*8));
        System.out.print ("Nombre del bebe:"+nombreBebe +"y de la mama"+nombreMa);





    
}
}
