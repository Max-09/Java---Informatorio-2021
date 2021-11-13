package ejercicioscomplementarioslevel1;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese primer numero: ");
        int x = entrada.nextInt();
        System.out.print("Ingrese segundo numero: ");
        int y = entrada.nextInt();
        int resultado = 1;

        for(int i=1; i<=y; i++){
            resultado *= x;
        }
        
        System.out.print("El resultado de la potencia es: " + resultado);
        entrada.close();
    }
}
