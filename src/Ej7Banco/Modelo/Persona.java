package Ej7Banco.Modelo;

public abstract class Persona {
    //Atributos
    protected String dni;
    protected String nombre;
    protected String apellido;
    protected Integer telefono;
    protected String email;
//Constructor
    public Persona(String dni,String nombre,String apellido, Integer telefono, String email){
        this.dni=dni;
        this.nombre= nombre;
        this.apellido= apellido;
        this.telefono=telefono;
        this.email=email;

    }

//Metodos


    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
