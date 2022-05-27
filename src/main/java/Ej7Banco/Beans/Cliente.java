package Ej7Banco.Beans;

import java.util.ArrayList;
import java.util.Date;

public class Cliente extends Persona {
    //ATRIBUTOS
    //private String domicilio;
    //private Sucursal sucursal;
    private String altaCliente;
    //private ArrayList<Cuenta>cuentas;
    //Al parecer tengo que guardar todas en uno y luego usar un instance of para dividirlas.

    //Constructor vacío


    public Cliente(String dni, String nombre, String apellido, String telefono, String email, String altaCliente) {
        super(dni, nombre, apellido, telefono, email);

        this.altaCliente = altaCliente;

    }



    //METODOS



    public String getAltaCliente() {
        return altaCliente;
    }

    public void setAltaCliente(String altaCliente) {
        this.altaCliente = altaCliente;
    }


}
