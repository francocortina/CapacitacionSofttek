package EJ8BancoConexion.Dao;

public interface ISucursal <T>{
    public boolean agregar(T obj);
    public boolean actualizar(T obj, T obj2);
    public boolean eliminar(String nombreSucursal);
    public void mostrarSucursales();
}
