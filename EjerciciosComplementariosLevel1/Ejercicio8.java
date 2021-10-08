package EjerciciosComplementariosLevel1;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese nombre y apellido: ");
        String ayp = entrada.nextLine();
        System.out.print("Edad: ");
        String edad = entrada.nextLine();
        System.out.print("Dirección: ");
        String dir = entrada.nextLine();
        System.out.print("Ciudad: ");
        String ciudad = entrada.nextLine();

        System.out.print(ciudad  + " - " + dir  + " - " + edad  + " - " + ayp);
        entrada.close();
    }    
}
