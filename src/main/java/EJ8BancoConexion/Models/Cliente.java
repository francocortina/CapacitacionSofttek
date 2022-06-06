package EJ8BancoConexion.Models;

public class Cliente extends Persona{
Sucursal sucursalDeCliente;

    //Constructor vacío
    public Cliente(){}

    //Constructor Completo
    public Cliente(String dni,String nombre, String apellido, String telefono, String email,Sucursal sucursalDeCliente){
        super(dni,nombre,apellido,telefono,email);
        this.sucursalDeCliente=sucursalDeCliente;

    }
    //Constructor sin Sucursal
    public Cliente(String dni,String nombre, String apellido, String telefono, String email){
        super(dni,nombre,apellido,telefono,email);


    }

    //Constructor sin Sucursal
    public Cliente(String dni){
        super(dni);


    }

    //Metodos


    public Sucursal getSucursalDeCliente() {
        return sucursalDeCliente;
    }

    public void setSucursalDeCliente(Sucursal sucursalDeCliente) {
        this.sucursalDeCliente = sucursalDeCliente;
    }
}
