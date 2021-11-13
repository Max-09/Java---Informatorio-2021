package ejercicioscomplementarioslevel2;
import java.util.*;

public class Ejercicio6 {
    public static void main(String[] args){

        Empleado e1 = new Empleado("Nicolas Perez", 39111576, 24, 150);
        Empleado e2 = new Empleado("Maxi Rodriguez", 39181417, 20, 200);
        Empleado e3 = new Empleado("Emanuel Palacios", 38939012, 30, 180);

        Set<Empleado> trabajadores = new HashSet<>();
        trabajadores.add(e1);
        trabajadores.add(e2);
        trabajadores.add(e3);

        Map<Integer, Integer> sueldos = new HashMap<>();
        sueldos.put(e1.dni, (e1.horas * e1.valor));
        sueldos.put(e2.dni, (e2.horas * e2.valor));
        sueldos.put(e3.dni, (e3.horas * e3.valor));

        System.out.print(sueldos);


    }
}
