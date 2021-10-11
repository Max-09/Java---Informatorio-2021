package EjerciciosComplementariosLevel2;

import java.util.*;

public class Ejercicio5 {
    public static void main(String[] args){
        int[] array1 = {6, 7, 8, 4, 5};
        int[] array2 = {350, 345, 550, 600, 320};
        List<Integer> pago = new ArrayList<>();
        int total = 0;

       for(int i=0; i<array1.length; i++){
        pago.add(i, array1[i] * array2[i]);
        total += array1[i] * array2[i];
       }
       System.out.println(pago);
       System.out.println("Total: $" + total);
    }
}
