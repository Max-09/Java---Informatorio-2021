package ejercicioscomplementarioslevel1;
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese palabra: ");
        String palabra = entrada.nextLine();
        String resultado = "";

        for (int i = 0; i < palabra.length(); i++) {
            int v = palabra.charAt(i);
            if (v > 96 && v < 123) {
                v -= 32;
            }
            resultado+=(char)v;

        }
        System.out.print(resultado);
        entrada.close();
    }
}
