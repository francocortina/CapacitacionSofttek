package EJ8BancoConexion.Service;

import EJ8BancoConexion.Models.Cliente;
import EJ8BancoConexion.Models.CuentaCorriente;
import EJ8BancoConexion.Dao.CuentaCorrienteDao;

import javax.swing.*;

public class CuentaCorrienteService {
    private CuentaCorrienteDao corriente;


    public CuentaCorrienteService(){
        this.corriente= new CuentaCorrienteDao();

    }
//Agregar cuentaCorriente
    public void agregar(Double monto, String cbu, Cliente dniCliente){
        try {
            corriente.agregar(new CuentaCorriente(monto,cbu,dniCliente));
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null,"Error en Deposito service"+ex.getMessage());
        }


    }

    //Extraer  cuentaCorriente
    public void extraer(Double monto,String cbu){
        try {
            corriente.extraer(monto,cbu);
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null,"Error en Extraer service"+ex.getMessage());
        }


    }

    //Depositar en Cuenta Corriente
    public void depositar(Double monto, String cbu){
        try {
            corriente.depositar(monto,cbu);
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null,"Error en Depositar service"+ex.getMessage());
        }

    }

    //Eliminar una cuentaCorriente
    public void eliminar(String cbu){
        try{
            corriente.eliminar(cbu);
        }catch (Exception ex){
           JOptionPane.showMessageDialog(null,"Error en elimianr Service"+ex.getMessage());
        }


    }

    //Mostrar saldo de  una CAJADEAHORRO
    public void mostrar(String cbu){
        try{
            corriente.mostrarSaldo(cbu);
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null,"Error en mostrar saldo Service"+ex.getMessage());
        }


    }



}
