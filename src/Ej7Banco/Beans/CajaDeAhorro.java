package Ej7Banco.Beans;

public class CajaDeAhorro extends Cuenta {
//Atributos
  TipoMoneda tipoMoneda;
//COSNTRUCTOR
    public CajaDeAhorro(Integer numCuenta, Double saldo,Integer cbu,TipoMoneda tipoMoneda){
        super(numCuenta,saldo,cbu);
        this.tipoMoneda=tipoMoneda;

    }

//METODOS


    public TipoMoneda getTipoMoneda() {
        return tipoMoneda;
    }

    public void setTipoMoneda(TipoMoneda tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
    }
}

//@Override
//    public double Extraer(double monto) {
//        if (saldo>monto){
//            saldo-=monto;
//            System.out.println("Saldo actual "+saldo);
//            return saldo;
//
//        }else{
//
//            System.out.println("No posee saldo suficiente");
//            return saldo;
//        }
//
//    }
//
//    @Override
//    public void Depositar(double monto) {
//        saldo+=monto;
//
//    }
