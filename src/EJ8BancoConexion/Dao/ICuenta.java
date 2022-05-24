package EJ8BancoConexion.Dao;

public interface ICuenta<T> {
   public void agregar(T obj);
   public void eliminar(String cbu);
   public Double extraer(Double monto,String cbu);
   public void depositar(Double monto,String cbu);
   public Double mostrarSaldo(String cbu);
}
