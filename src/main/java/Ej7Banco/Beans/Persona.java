package Ej7Banco.Beans;

public abstract class Persona {
    //Atributos
    protected String dni;
    protected String nombre;
    protected String apellido;
    protected String telefono;
    protected String email;

    //Constructor vacío

    public Persona() {
    }

    //Constructor
    public Persona(String dni,String nombre,String apellido, String telefono, String email){
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
