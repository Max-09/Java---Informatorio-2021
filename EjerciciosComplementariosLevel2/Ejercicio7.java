package ejercicioscomplementarioslevel2;
import java.util.*;

public class Ejercicio7 {
    public static void fizzBuzzFuncion(int x, int y){
        List<String> resultado = new ArrayList<>();

        for(int i = x; i < y; i++){
            if(i % 2 == 0){
                if(i % 3 == 0){
                    resultado.add("FizzBuzz");
                }else{
                    resultado.add("Fizz");
                }
            }else if(i % 3 == 0){
                resultado.add("Buzz");
            }else{
                resultado.add(String.valueOf(i));
            }
        }
        System.out.print(resultado);
    }
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresar numero de inicio: ");
        int x = entrada.nextInt();
        System.out.print("Ingresar numero final: ");
        int y = entrada.nextInt();

        fizzBuzzFuncion(x, y);
        entrada.close();
    }

}
