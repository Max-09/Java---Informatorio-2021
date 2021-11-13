package ejercicioscomplementarioslevel3;

import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {
    public static void main(String[] arg){
        List<Integer> palabras = List.of(1, 2, 3, 4, 5);
        List<Integer> resultado = palabras
            .stream()
            .map(x -> (int)Math.pow(x,2))
            .collect(Collectors.toList());
        System.out.println(resultado);
    }
}
