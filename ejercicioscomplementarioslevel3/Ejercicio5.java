package ejercicioscomplementarioslevel3;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Familia> miembros = List.of(
                new Familia("Homero", "Simpson", LocalDate.parse("1960-10-15")),
                new Familia("Marge", "Simpson", LocalDate.parse("1964-01-10")),
                new Familia("Lisa", "Simpson", LocalDate.parse("2005-11-09")),
                new Familia("Magie", "Simpson", LocalDate.parse("2021-08-17")),
                new Familia("Bart", "Simpson", LocalDate.parse("2000-05-22")));
        
        Map<String, Integer> miembrosMap = miembros
                .stream()
                .collect(Collectors.toMap(miembro -> generarClave(miembro), miembro -> generarEdad(miembro)));
        System.out.println(miembrosMap);
    }

    private static String generarClave(Familia miembro){
        return miembro.getApellido().concat(" ").concat(miembro.getNombre());
    }

    private static Integer generarEdad(Familia miembro){
        return Period.between(miembro.getFechaNacimiento(), LocalDate.now()).getYears();
    }
}
