package EJ9PatronesDeDiseño.Estructural.Decorador.Imple;

import EJ9PatronesDeDiseño.Estructural.Decorador.Inter.ICuentaBancaria;
import EJ9PatronesDeDiseño.Estructural.Decorador.Model.Cuenta;

public class CajaDeAhorro implements ICuentaBancaria<Cuenta> {
    @Override
    public void agregarCuenta(Cuenta cuenta) {
        System.out.println("============================");
        System.out.println("Cuenta Caja de Ahorro creada");
        System.out.println("Cliente: "+ cuenta.getNombrecliente());
    }
}
