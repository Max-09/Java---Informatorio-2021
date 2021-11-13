package ejercicioscomplementarioslevel2;
import java.util.*;

public class Ejercicio1 {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("-----TUS CIUDADES FAVORITAS-----");

        ArrayList<Ciudad> misCiudades = new ArrayList<>();

        System.out.print("Primer ciudad: ");
        Ciudad c1 = new Ciudad(entrada.nextLine());
        misCiudades.add(c1);

        System.out.print("Segunda ciudad: ");
        Ciudad c2 = new Ciudad(entrada.nextLine());
        misCiudades.add(c2);

        System.out.print("Tercer ciudad: ");
        Ciudad c3 = new Ciudad(entrada.nextLine());
        misCiudades.add(c3);
        
        for(int i=0; i<misCiudades.size(); i++){
            System.out.println("#" + (i+1) + " " + misCiudades.get(i));
        }
        entrada.close();
    }
}
