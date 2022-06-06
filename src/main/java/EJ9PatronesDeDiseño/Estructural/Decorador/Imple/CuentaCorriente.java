package EJ9PatronesDeDiseño.Estructural.Decorador.Imple;

import EJ9PatronesDeDiseño.Estructural.Decorador.Inter.ICuentaBancaria;
import EJ9PatronesDeDiseño.Estructural.Decorador.Model.Cuenta;
import jdk.swing.interop.SwingInterOpUtils;

public class CuentaCorriente implements ICuentaBancaria<Cuenta> {

    @Override
    public void agregarCuenta(Cuenta cuenta) {
        System.out.println("==========================");
        System.out.println("Cuenta Corriente agregada");
        System.out.println("Cliente: "+ cuenta.getNombrecliente());
    }
}
