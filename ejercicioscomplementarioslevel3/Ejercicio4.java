package ejercicioscomplementarioslevel3;

import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> palabras = List.of(1, 2, 4, 4, 4);
        List<Integer> resultado = palabras
            .stream()
            .distinct()
            .map(x -> funcionFactorial(x))
            .collect(Collectors.toList());
        System.out.println(resultado);
    }
    
    public static Integer funcionFactorial(int x){
        if (x >= 1)
            return x * funcionFactorial(x - 1);
        else
            return 1;
    }
}
