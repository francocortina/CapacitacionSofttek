package EJ9PatronesDeDiseño.Estructural.Decorador.Api;

import EJ9PatronesDeDiseño.Estructural.Decorador.Decorador.BlindajeDecorador;
import EJ9PatronesDeDiseño.Estructural.Decorador.Imple.CajaDeAhorro;
import EJ9PatronesDeDiseño.Estructural.Decorador.Imple.CuentaCorriente;
import EJ9PatronesDeDiseño.Estructural.Decorador.Inter.ICuentaBancaria;
import EJ9PatronesDeDiseño.Estructural.Decorador.Model.Cuenta;

public class Main {
    public static void main(String[] args) {
        Cuenta c= new Cuenta(1,"Franco");
     ICuentaBancaria cuenta= new CuentaCorriente();
     ICuentaBancaria cuentaBlindada= new BlindajeDecorador(cuenta);
     cuentaBlindada.agregarCuenta(c);
    }
}
