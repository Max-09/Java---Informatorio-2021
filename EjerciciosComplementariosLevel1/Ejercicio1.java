package ejercicioscomplementarioslevel1;
import java.util.Scanner;
public class Ejercicio1{
    public static void main(String[] args){
        Scanner nom = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = nom.nextLine();
        System.out.println("HOLA " + nombre);
        nom.close();
    }
}