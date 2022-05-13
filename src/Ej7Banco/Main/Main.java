package Ej7Banco.Main;

import Ej7Banco.Modelo.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//            //Creo banco
//            Banco BancoFrances= new Banco("BancoFrances");
//            //Creo Sucursal
//            Sucursal SucursalLaPlata= new Sucursal("LaPlataSucursal",01);
//            //Creo cliente
//            Cliente cli1=new Cliente("LaPlata",SucursalLaPlata,"Franco",221673,"franco.cuug@gmail.com");
//            SucursalLaPlata.setListaClientes(cli1);
//            //Creo Empleado
//            Empleado emp1= new Empleado("Benja",42565,"dsadsa@sad.com",2280);
//            SucursalLaPlata.setListaEmpleados(emp1);
//            //Imprimo clientes
//        System.out.println(SucursalLaPlata.getListaClientes());
//            //Imprimo empleados
//        System.out.println(SucursalLaPlata.getListaEmpleados());
//            //Imprimo lista de sucursales del banco
//        BancoFrances.setListaSucursales(SucursalLaPlata);
//        System.out.println(BancoFrances.getListaSucursales());
//
//        //Creo cuenta CajaDeAhorro
//
//        CajaDeAhorro ahorro1= new CajaDeAhorro(1,2500,44);
//
//        //Creo cuenta Corriente
//        CuentaCorriente corriente1= new CuentaCorriente(2,2500,65);
//
//        //Ingreso saldo CajaDeAhorro
//        ahorro1.Depositar(2500);
//        //Saco saldo
//        ahorro1.Extraer(300);
//        //Ingreso saldo CuentaCorriente
//        corriente1.Depositar(2500);
//        //Saco saldo
//        corriente1.Extraer(30000);
//
//        //Imprimo Lista cuenta caja de ahorro
//        BancoFrances.setListaCajaDeAhorro(ahorro1);
//        System.out.println(BancoFrances.getListaCajaDeAhorro());
//        //Imprimo lista cuenta Corriente
//        BancoFrances.setListaCuentasCorrientes(corriente1);
//        System.out.println(BancoFrances.getListaCuentasCorrientes());
//
        /*Me falta hacer solo la impresion de la lista de cuuentas de cada empleado*/
        Scanner scanner= new Scanner(System.in);
        int option;
do {
    System.out.println("Elija la operación deseada");
    System.out.println("1- Agregar Cliente");
    System.out.println("2- Agregar cuenta a cliente");
    System.out.println("3- Listar clientes por sucursal");
    System.out.println("4- Listar Clientes de una sucursal");
    System.out.println("5- Extraer Dinero");
    System.out.println("6- Consultar saldo");
    System.out.println("7- Realizar deposito");
    System.out.println("8- Realizar Transferencia");
    System.out.println("9- Eliminar una sucursal");





        option= scanner.nextInt();
    switch (option){

    }
}while(option!=0);












    }
}
