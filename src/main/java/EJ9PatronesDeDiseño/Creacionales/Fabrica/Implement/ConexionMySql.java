package EJ9PatronesDeDiseño.Creacionales.Fabrica.Implement;

import EJ9PatronesDeDiseño.Creacionales.Fabrica.Inter.IConexion;

public class ConexionMySql implements IConexion {
    private String host;
    private String puerto;
    private String usuario;
    private String contraseña;
    private static ConexionMySql instance;
    //Privado para intentar el Singleton
    private ConexionMySql(){
        this.host="MySql.com";
        this.puerto="8080";
        this.usuario="Oracle.com";
        this.contraseña="1321";
    }


    public static ConexionMySql getInstance(){
        if(instance==null){

            instance= new ConexionMySql();

            return instance;
        }
        return instance;
    }


    @Override
    public void conectar() {
        System.out.println("Conectado a la BD de MySql");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectado de la  BD de MySql");
    }
}
