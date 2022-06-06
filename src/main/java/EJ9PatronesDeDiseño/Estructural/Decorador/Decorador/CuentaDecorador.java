package EJ9PatronesDeDiseño.Estructural.Decorador.Decorador;

import EJ9PatronesDeDiseño.Estructural.Decorador.Inter.ICuentaBancaria;
import EJ9PatronesDeDiseño.Estructural.Decorador.Model.Cuenta;

public abstract class CuentaDecorador implements ICuentaBancaria<Cuenta> {
protected ICuentaBancaria cuentaDecorada;

public CuentaDecorador(ICuentaBancaria cuentaDecorada){
    this.cuentaDecorada=cuentaDecorada;
}
    @Override
    public void agregarCuenta(Cuenta cuenta) {
this.cuentaDecorada.agregarCuenta(cuenta);
    }
}
