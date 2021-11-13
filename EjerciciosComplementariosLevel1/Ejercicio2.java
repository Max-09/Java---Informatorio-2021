package ejercicioscomplementarioslevel1;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.print("Ingrese primer numero: ");
        int x = a.nextInt();
        System.out.print("Ingrese segundo numero: ");
        int y = a.nextInt();
        System.out.print("SUMA: " + (x+y) + "\nRESTA: " + (x-y) + "\nMULTIPLICACION: " + (x*y) + "\nDIVISION: " + (x/y) + "\nMODULO: " + (x%y));
        a.close();
    }
}
