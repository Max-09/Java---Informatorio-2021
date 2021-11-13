package ejercicioscomplementarioslevel3;

import java.time.LocalDate;

public class Familia {
    String nombre;
    String apellido;
    LocalDate fechaNacimiento;

    public Familia(String nombre,String apellido, LocalDate fechaNacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
