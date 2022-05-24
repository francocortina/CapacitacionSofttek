package Ej7Banco.Beans;

public abstract class Cuenta {
    //Atributos
   protected Integer numCuenta;
   protected Double saldo;
   protected Integer cbu;
//Constructor
    public Cuenta(Integer numCuenta, Double saldo, Integer cbu){
        this.numCuenta=numCuenta;
        this.saldo=saldo;
        this.cbu=cbu;

    }

    //Metodos

    public Integer getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(Integer numCuenta) {
        this.numCuenta = numCuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Integer getCbu() {
        return cbu;
    }

    public void setCbu(Integer cbu) {
        this.cbu = cbu;
    }


//    public abstract double Extraer(Double monto);
//
//
//    public abstract void Depositar(Double monto);
}
