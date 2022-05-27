package EJ9PatronesDeDiseño.Creacionales.Singleton;

public class Conexion {
    /*1-Lo que hace este patron es  que crea  una variable  de tippo lo que necesiten, ejemplo conexion
   2- Luego crea un metodo que lo que hace es si esa varibale esta vacía instancia al objeto,
   como ese metodo pregunta siempre si es null, si ya fue instanciado en algun momento no se vovlera a instanciar*/
private static Conexion instancia;
//Constructor vacío en private para no poder instanciarlo
private Conexion(){};

//Metodo que si hace que si la variable ya está instanciada no la vuelve a instanciar
   //No olvidarse de metodo static sino será imposible el acceso en otras clases

 public static Conexion getInstance(){
     if(instancia==null){
         instancia=new Conexion();
     }
    return instancia;

 }

public void conectar(){
    System.out.println("Conexion exitosa a la BD");
}

public void desconectar(){
    System.out.println("Se ah desconectado exitosamente");
}


}
