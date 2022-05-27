package EJ9PatronesDeDiseño.Creacionales.Fabrica.Implement;

import EJ9PatronesDeDiseño.Creacionales.Fabrica.Inter.IConexion;

public class ConexionOracle implements IConexion {
    private String host;
    private String puerto;
    private String usuario;
    private String contraseña;

    //Creo la instancia unica
    private static ConexionOracle instance;

//Creo
private ConexionOracle(){
    this.host="Oracle.com";
    this.puerto="8080";
    this.usuario="Oracle.com";
    this.contraseña="1321";


}
public static ConexionOracle  getInstance(){
    if(instance==null){
        instance= new ConexionOracle();
        return instance;
    }
    return instance;
}

    @Override
    public void conectar() {
        System.out.println("Conectado a Oracle");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectado de Oracle");
    }
}
