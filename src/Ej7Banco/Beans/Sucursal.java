package Ej7Banco.Beans;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    //Atributos
    private String nombreSucursal;
    private Integer numSucursal;
    private List<Cliente>Clientes;
    private List<Empleado>Empleados;
//CONSTRUCTOR

    public Sucursal() {
    }

    public Sucursal(String nombreSucursal, int numSucursal){
        this.nombreSucursal=nombreSucursal;
        this.numSucursal=numSucursal;
        this.Clientes= new ArrayList<Cliente>();
        this.Empleados= new ArrayList<Empleado>();

    }

    //METODOS


    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    public Integer getNumSucursal() {
        return numSucursal;
    }

    public void setNumSucursal(Integer numSucursal) {
        this.numSucursal = numSucursal;
    }

    public List<Cliente> getClientes() {
        return Clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        Clientes = clientes;
    }

    public List<Empleado> getEmpleados() {
        return Empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        Empleados = empleados;
    }
}


//Clientes recorrido
//    public String getListaClientes(){
//        for (Cliente c:listaClientes
//             ) {
//            return "Nombre cliente: "+c.getNombre()+ " Email del cliente: "+c.getEmail() ;
//        }
//        return "Lista de Clientes";
//            }
////ADD DE clientes
//        public void setListaClientes(Cliente c) {
//        listaClientes.add(c);
//        }
//
////Empleados recorrido
//    public String getListaEmpleados(){
//        for (Empleado e:listaEmpleados
//        ) {
//            return "Nombre Empleado: "+ e.getNombre()+ " Num empleado:"+ e.getLegajo();
//        }
//        return "Lista de Empleaados";
//    }
//    //ADD de empleados
//    public void setListaEmpleados(Empleado e) {
//        listaEmpleados.add(e);
//    }
