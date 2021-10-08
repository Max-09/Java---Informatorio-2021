package EjerciciosComplementariosLevel1;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese numero: ");
        int numero = entrada.nextInt();
        System.out.print("El factorial de " + numero + " es: " + factorial(numero));
        entrada.close();
    }
    public static int factorial(int numero){
        if(numero == 1)
            return 1;
        else
            return (numero * factorial(numero - 1));
    }
}
