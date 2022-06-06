package EJ8BancoConexion.Dao;

import java.sql.SQLException;

public interface ICuenta<T> {
   public void agregar(T obj);
   public void eliminar(String cbu);
   public Double extraer(Double monto,String cbu);
   public void depositar(Double monto,String cbu) throws SQLException;
   public void depositarCuentaCorriente(Double monto,String cbu,String cbu2) throws SQLException;
   public Double mostrarSaldo(String cbu);
}
