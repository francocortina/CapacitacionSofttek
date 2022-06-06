package EJ8BancoConexion.Dao;

public interface ISucursal <T>{

    /*
    * Agregar= Crea una Sucursal
    * Actualizar=Modifica el nombre de sucursal mientras no tenga cuentas adosadas
    * Eliminar=Elimina la Sucursal si no posee clientes vigentes
    * MostrarSucursales=Lista las sucursales Vigentes
    * */
    public boolean agregar(T obj);
    public boolean actualizar(T obj, T obj2);
    public boolean eliminar(String nombreSucursal);
    public void mostrarSucursales();
}
