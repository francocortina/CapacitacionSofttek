package EJ9PatronesDeDiseño.Creacionales.Singleton;

public class Main {
    public static void main(String[] args) {
        Conexion c = Conexion.getInstance();

c.conectar();
c.desconectar();



    }
}
