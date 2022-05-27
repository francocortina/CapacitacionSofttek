package EJ8BancoConexion.Dao;

public interface IPersona  <T>{
    public boolean agregar(T obj);
    public boolean actualizar(T obj);
    public boolean eliminar(String dni);
}
