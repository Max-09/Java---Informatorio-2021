package EjerciciosComplementariosLevel2;

public class Empleado {
    String nombre;
    int dni;
    int horas; 
    int valor;

    public String toString(){
        return nombre;
    }

    public Empleado(String nombre, int dni, int horas, int valor){
        this.nombre = nombre;
        this.dni = dni;
        this.horas = horas;
        this.valor = valor;
    }
   
}
