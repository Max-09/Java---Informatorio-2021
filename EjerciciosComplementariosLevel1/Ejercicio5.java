package EjerciciosComplementariosLevel1;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int x = entrada.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int y = entrada.nextInt();
        int resultado = 0;
        for(int i=1; i<=y; i++){
            resultado += x;
        }
        System.out.print("La suma sucesiva es: " + resultado);
        entrada.close();
    }
}
