package EJ8BancoConexion.Dao;

import javax.swing.*;
import java.sql.*;

public class Conexion {
private static final String DRIVER= "com.mysql.cj.jdbc.Driver";
private static final String USER= "root";
private static final String PASSWORD= "";
private static final String URL= "jdbc:mysql://localhost:3306/banco";
private Connection CN;

//Patrón Singleton
private static Conexion instancia;

private Conexion(){
    CN=null;
}

public Connection getConnection(){
    try {
        Class.forName(DRIVER);
        CN= DriverManager.getConnection(URL,USER,PASSWORD);

    }catch (ClassNotFoundException | SQLException ex){

        System.out.println("Error en conexion "+ex.getMessage());
    }
return CN;

}

//Patrón Singleton
public static Conexion getInstance(){
        if(instancia==null){
            instancia= new Conexion();
        }
        return instancia;

    }


public void close(){
    try {
        CN.close();

    }catch (Exception ex){
        JOptionPane.showMessageDialog(null,ex.getMessage(),"Error al cerrar conexion con la base de datos",JOptionPane.ERROR_MESSAGE);

    }

}



}


