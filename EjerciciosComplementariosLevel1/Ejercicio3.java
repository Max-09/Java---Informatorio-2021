package EjerciciosComplementariosLevel1;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = entrada.nextInt();
        for(int i=1; i<=numero; i++){
            if(i == 1){
                System.out.println(i);
            }else{
                for(int j=1; j<=i; j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        }
        entrada.close();
    }
}
