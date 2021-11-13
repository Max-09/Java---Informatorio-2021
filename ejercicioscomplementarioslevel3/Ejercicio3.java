package ejercicioscomplementarioslevel3;

import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
        System.out.println(palabras
            .stream()
            .filter(x -> x.toUpperCase().startsWith("B"))
            .count());
    }
}
