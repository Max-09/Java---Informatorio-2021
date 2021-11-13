package ejercicioscomplementarioslevel1;
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese texto: ");
        String texto = entrada.nextLine();
        System.out.print("Ingrese letra: ");
        char letra = entrada.next().charAt(0);
        int cantidad = 0;

        for(int i=0; i<texto.length(); i++){
            if(texto.charAt(i) == letra)
                cantidad += 1;
        }
        System.out.print("La cantidad de veces que aparece la letra es: " + cantidad);
        entrada.close();
    }
}
