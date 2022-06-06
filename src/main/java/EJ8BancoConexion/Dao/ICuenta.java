package EJ8BancoConexion.Dao;

import java.sql.SQLException;
/*
* Cuentas de Ahorro o Cuentas Corrientes
*
* Agregar= Crea  cuenta ahorro/corriente
* Eliminar= Elimina cuenta por dni
* Extraer= Extraer dinero para Cuenta de Ahorro/ Y se combina en Cuentas corrientes para la Transferencia
* Depositar= Deposita  dinero en cualquiera de las dos cuentas
* DepositarCuentaCorriente= Se usa para la transferencia de Cuenta Corriente
* Mostrarsaldo = Muestra el saldo de ambas cuentas
*
* */
public interface ICuenta<T> {
   public void agregar(T obj);
   public void eliminar(String cbu);
   public Double extraer(Double monto,String cbu);
   public void depositar(Double monto,String cbu) throws SQLException;
   public void depositarCuentaCorriente(Double monto,String cbu,String cbu2) throws SQLException;
   public Double mostrarSaldo(String cbu);
}
