package EjerciciosComplementariosLevel2;
import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args){

        String[] baraja = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        List<String> francesa = new ArrayList<>();
        
        System.out.println("---ORDEN CORRECTO---");
        for(int i=0; i<baraja.length; i++){
            francesa.add(baraja[i]);
            System.out.print(" " + baraja[i]);
        }
        System.out.println("\n");

        System.out.println("---ORDEN INVERSO---");
        for(int i=0; i<francesa.size(); i++){
            System.out.print(" " + francesa.get(francesa.size() - (i + 1)));
        }
        System.out.println("\n");
        

        System.out.println("---DESORDENADO---");
        Collections.sort(francesa);
        for(int i=0; i<francesa.size(); i++){
            System.out.print(" " + francesa.get(francesa.size() - (i + 1)));
        }
        System.out.println("\n");


    }
}
