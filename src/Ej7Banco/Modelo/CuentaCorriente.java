package Ej7Banco.Modelo;

import Ej7Banco.Modelo.Cuenta;

public class CuentaCorriente extends Cuenta {
    //Atributos
    Double interes;

    //Constructor
    public CuentaCorriente(Integer numCuenta, Double saldo,Integer cbu, Double interes){
        super(numCuenta,saldo,cbu);
        this.interes=interes;

    }
    //METODOS


    public Double getInteres() {
        return interes;
    }

    public void setInteres(Double interes) {
        this.interes = interes;
    }
}

//Sobreescritura de metodos
//    @Override
//    public double Extraer(double monto) {
//        //El metodo sería de otra forma pero ppor el momento lo dejo igual
//        if (saldo>=monto){
//            saldo-=monto;
//            System.out.println("Saldo actual "+saldo);
//            return saldo;
//        }else
//        {
//            System.out.println("Saldo insuficiente");
//            return saldo;
//        }
//    }
//
//    @Override
//    public void Depositar(double monto) {
//        saldo+=monto;
//    }