package Ej7Banco.Beans;

import java.util.ArrayList;

public class Banco {
    //Atributos
    String nombreBanco;
    ArrayList<Sucursal> listaSucursales;
    ArrayList<CuentaCorriente>listaCuentasCorrientes;
    ArrayList<CajaDeAhorro>listaCajaDeAhorro;

    public Banco() {
    }

    //Constructor  donde inicializo las listas
    public Banco(String nombreBanco){
        this.nombreBanco=nombreBanco;
        this.listaSucursales=new ArrayList<Sucursal>();
        this.listaCuentasCorrientes= new ArrayList<CuentaCorriente>();
        this.listaCajaDeAhorro=new ArrayList<CajaDeAhorro>();
    }

    public ArrayList<Sucursal> getListaSucursales() {
        return listaSucursales;
    }

    public void setListaSucursales(ArrayList<Sucursal> listaSucursales) {
        this.listaSucursales = listaSucursales;
    }

    public ArrayList<CuentaCorriente> getListaCuentasCorrientes() {
        return listaCuentasCorrientes;
    }

    public void setListaCuentasCorrientes(ArrayList<CuentaCorriente> listaCuentasCorrientes) {
        this.listaCuentasCorrientes = listaCuentasCorrientes;
    }

    public ArrayList<CajaDeAhorro> getListaCajaDeAhorro() {
        return listaCajaDeAhorro;
    }

    public void setListaCajaDeAhorro(ArrayList<CajaDeAhorro> listaCajaDeAhorro) {
        this.listaCajaDeAhorro = listaCajaDeAhorro;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }
}


//Tendría que hacerlo con un while por el return, lo dejo así porque funciona igual
//Recorrido de las listas y add de las cuentas
//    public String getListaSucursales(){
//        for (Sucursal s:listaSucursales
//        ) {
//            return "Nombre Sucursal: "+s.getNombreSucursal();
//        }
//        return "Imprimo nombre de sucursales";
//    }

//    public void setListaSucursales(Sucursal s) {
//        listaSucursales.add(s);
//    }
//
//    public String getListaCuentasCorrientes(){
//        for (CuentaCorriente c:listaCuentasCorrientes
//        ) {
//            return "Nombre cliente: "+c.numCuenta;
//        }
//        return "Imprimo num de cuenta";
//    }
//    public void setListaCuentasCorrientes(CuentaCorriente c) {
//        listaCuentasCorrientes.add(c);
//    }
//
//
//    public String getListaCajaDeAhorro(){
//        for (CajaDeAhorro c:listaCajaDeAhorro
//        ) {
//            return "Nombre cliente: "+c.numCuenta;
//        }
//        return "Imprimo num de cuenta";
//    }
//    public void setListaCajaDeAhorro(CajaDeAhorro c) {
//        listaCajaDeAhorro.add(c);
//    }
//