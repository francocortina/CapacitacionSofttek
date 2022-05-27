package EJ9PatronesDeDiseño.Creacionales.Fabrica.Main;

import EJ9PatronesDeDiseño.Creacionales.Fabrica.Implement.ConexionMySql;
import EJ9PatronesDeDiseño.Creacionales.Fabrica.Implement.ConexionOracle;
import EJ9PatronesDeDiseño.Creacionales.Fabrica.Implement.ConexionVacia;
import EJ9PatronesDeDiseño.Creacionales.Fabrica.Inter.IConexion;

public class ConexionFabrica {

    public IConexion getConexion(String motor){
        if(motor==null){
            return new ConexionVacia();
        }
        if(motor.equalsIgnoreCase("MYSQL")){

            return ConexionMySql.getInstance();
        }
        if(motor.equalsIgnoreCase("ORACLE")){
            return  ConexionOracle.getInstance();
        }
        return new ConexionVacia();
    }
}
