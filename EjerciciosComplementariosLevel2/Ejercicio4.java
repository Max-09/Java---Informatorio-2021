package EjerciciosComplementariosLevel2;
import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args){
        String[] nombres = {"Carlos", "Laura", "Nico", "Paola", "Maxi", "Matias", "Julieta", "Marcos", "Maria", "Pedro", "Lucia", "Micaela"};
        ArrayList<String> alumnos = new ArrayList<>();
        
        for(int i=0; i<nombres.length; i++){
            alumnos.add(nombres[i]);
        }
        List<String> curso1 = alumnos.subList(0, 4);
        List<String> curso2 = alumnos.subList(4, 8);
        List<String> curso3 = alumnos.subList(8, 12);

        System.out.println("Curso 1: " + curso1);
        System.out.println("Curso 2: " + curso2);
        System.out.println("Curso 3: " + curso3);
    
    }
}
