package Ej7Banco.Modelo;

import java.util.ArrayList;
import java.util.Date;

public class Cliente extends Persona {
    //ATRIBUTOS
    private String domicilio;
    private Sucursal sucursal;
    private Date altaCliente;
    private ArrayList<Cuenta>cuentas;
    //Al parecer tengo que guardar todas en uno y luego usar un instance of para dividirlas.


    //CONSTRUCTOR
   public Cliente (String domicilio,Sucursal sucursal, Date altaCliente,String dni,String nombre, String apellido,Integer telefono,String email){
super(dni,nombre,apellido,telefono,email);
this.domicilio=domicilio;
this.sucursal=sucursal;
this.altaCliente=altaCliente;
this.cuentas=new ArrayList<Cuenta>();
   }

    //METODOS


    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Date getAltaCliente() {
        return altaCliente;
    }

    public void setAltaCliente(Date altaCliente) {
        this.altaCliente = altaCliente;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
}
