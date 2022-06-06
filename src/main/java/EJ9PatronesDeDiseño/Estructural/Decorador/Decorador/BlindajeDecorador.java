package EJ9PatronesDeDiseño.Estructural.Decorador.Decorador;

import EJ9PatronesDeDiseño.Estructural.Decorador.Inter.ICuentaBancaria;
import EJ9PatronesDeDiseño.Estructural.Decorador.Model.Cuenta;

public class BlindajeDecorador extends CuentaDecorador{

    public BlindajeDecorador(ICuentaBancaria cuentaDecorada) {
        super(cuentaDecorada);
    }

    @Override
    public void agregarCuenta(Cuenta cuenta) {
        super.agregarCuenta(cuenta);
        agregarBlindaje(cuenta);
    }

    public void agregarBlindaje(Cuenta cuenta){
        System.out.println("Blindaje agregado");

    }
}
