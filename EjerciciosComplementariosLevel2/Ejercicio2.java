package ejercicioscomplementarioslevel2;
import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args){
        List<Integer> numeros = new ArrayList<>();

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese numero: ");
        numeros.add(entrada.nextInt());
        System.out.print("Ingrese numero: ");
        numeros.add(entrada.nextInt());
        System.out.print("Ingrese numero: ");
        numeros.add(entrada.nextInt());
        System.out.print("Ingrese numero: ");
        numeros.add(entrada.nextInt());
        System.out.print("Ingrese numero: ");
        numeros.add(entrada.nextInt());
        System.out.println("");

        System.out.println("-----ITERACION ANTES DE AGREGAR NUMEROS-----");
        for(int i=0; i<numeros.size(); i++){
            System.out.print(" " + numeros.get(i));
        }
        System.out.println("");
        System.out.println("");
        
        System.out.print("Ingrese numero para insertar al inicio: ");
        numeros.add(0, entrada.nextInt());
        System.out.print("Ingrese numero para insertar al final: ");
        numeros.add(6, entrada.nextInt());
        System.out.println("");

        System.out.println("-----ITERACION DESPUES DE AGREGAR NUMEROS-----");
        for(int i=0; i<numeros.size(); i++){
            System.out.print(" " + numeros.get(i));
        }
        System.out.println("");
        entrada.close();
    }
}
