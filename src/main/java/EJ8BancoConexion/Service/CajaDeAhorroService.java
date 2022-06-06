package EJ8BancoConexion.Service;

import EJ8BancoConexion.Models.CajaDeAhorro;

import EJ8BancoConexion.Models.Cliente;
import EJ8BancoConexion.Models.TipoMoneda;
import EJ8BancoConexion.Dao.CajaDeAhorroDao;


import javax.swing.*;

public class CajaDeAhorroService {


    private CajaDeAhorroDao ahorro;


    public CajaDeAhorroService(){
        this.ahorro= new CajaDeAhorroDao();
    }
    //Agregar cuentaCorriente
    public void agregar(Double monto, String cbu, TipoMoneda tipo, Cliente dniCliente){
        try {
            ahorro.agregar(new CajaDeAhorro(monto,cbu,tipo,dniCliente));
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null,"Error en Deposito service"+ex.getMessage());
        }


    }

    //Extraer Cajadeahorro
    public void extraer(Double monto,String cbu){
        try {
            ahorro.extraer(monto,cbu);
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null,"Error en Extraer service"+ex.getMessage());
        }


    }

    //Depositar en CAJADEAHORRO
    public void depositar(Double monto, String cbu){
        try {
            ahorro.depositar(monto,cbu);
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null,"Error en Depositar service"+ex.getMessage());
        }

    }

    //Eliminar una CAJADEAHORRO
    public void eliminar(String cbu){
        try{
            ahorro.eliminar(cbu);
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null,"Error en elimianr Service"+ex.getMessage());
        }


    }
    //Mostrar saldo de  una CAJADEAHORRO
    public void mostrar(String cbu){
        try{
            ahorro.mostrarSaldo(cbu);
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null,"Error en mostrar saldo Service"+ex.getMessage());
        }


    }





}
