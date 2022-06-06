package EJ8BancoConexion.Dao;
/*
* Agregar= Crea cuenta para Cliente/Empleado
* Actualizar= Modifica los datos en base al dni tanto para Empleado/Cliente
* Eliminar= Elimina la cuenta en base al dni tanto para Empleado/Cliente
* */
public interface IPersona  <T>{
    public boolean agregar(T obj);
    public boolean actualizar(T obj);
    public boolean eliminar(String dni);
}
