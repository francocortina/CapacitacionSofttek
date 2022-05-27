package EJ9PatronesDeDiseño.Creacionales.Fabrica.Main;

import EJ9PatronesDeDiseño.Creacionales.Fabrica.Inter.IConexion;



public class App {

 public static void main(String[] args) {
  ConexionFabrica frabica= new ConexionFabrica();
  IConexion c1=frabica.getConexion("MYSQL");
  c1.conectar();
  c1.desconectar();

  IConexion c2= frabica.getConexion("ORACLE");
c2.conectar();
c2.desconectar();

  IConexion c3=frabica.getConexion("MYSQL");
  c3.conectar();
  c3.desconectar();
 }





}
