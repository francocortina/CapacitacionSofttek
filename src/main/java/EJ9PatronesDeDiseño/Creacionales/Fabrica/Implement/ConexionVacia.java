package EJ9PatronesDeDiseño.Creacionales.Fabrica.Implement;

import EJ9PatronesDeDiseño.Creacionales.Fabrica.Inter.IConexion;

public class ConexionVacia implements IConexion {

    @Override
    public void conectar() {
        System.out.println("No existe esta conexion");
    }

    @Override
    public void desconectar() {
        System.out.println("No existe esta conexion");
    }
}
