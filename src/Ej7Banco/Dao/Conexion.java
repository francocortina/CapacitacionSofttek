package Ej7Banco.Dao;



import javax.swing.*;
import java.sql.*;

public class Conexion {

//    //1 Crear la conexion
//    Connection miConeccion;
//
//    {
//        try {
//            miConeccion = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco","root","");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }


  Connection cn=null;

  private static String driver="com.mysql.cj.jdbc.Driver";
  private static String usuario="root";
  private static String password="";
  private static String url="jdbc:mysql://localhost:3306/banco";

static {
  try{
    Class.forName(driver);
  }catch (Exception ex){
    JOptionPane.showMessageDialog(null,ex.toString(),"Proyecto",0);

  }

}


public Connection getCn(){

  try{
    cn=DriverManager.getConnection(url,usuario,password);
  }catch (Exception ex){

    System.out.println("Algo anda mal");
    JOptionPane.showMessageDialog(null,ex.toString(),"Proyecto",0);

  }
  return null;

}
}
