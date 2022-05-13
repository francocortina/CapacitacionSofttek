package Ej7Banco.Modelo;

import java.util.Date;

public class Empleado extends Persona {
    //Atriutos
  private  Integer legajo;
  private Date fechaIngreso;
   //Constructor
public Empleado(String nombre,String apellido, Integer telefono, String email,String dni,Integer legajo ,Date fechaIngreso){
    super(dni,nombre,apellido,telefono,email);
    this.legajo=legajo;
    this.fechaIngreso=fechaIngreso;
}

//Metodos

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
}
