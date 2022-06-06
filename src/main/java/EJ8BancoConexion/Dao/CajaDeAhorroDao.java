package EJ8BancoConexion.Dao;

import EJ8BancoConexion.Models.CajaDeAhorro;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CajaDeAhorroDao implements ICuenta<CajaDeAhorro> {

    private final String  insert="INSERT INTO cajadeahorro (saldo,cbu,tipoMoneda,dnicliente)VALUES(?,?,?,?)";
    private final String  depositar="UPDATE cajadeahorro SET saldo=saldo+? WHERE cbu=? AND ?>0";
    private final String  extraer="UPDATE cajadeahorro SET saldo=saldo-? WHERE cbu=? AND saldo>=?";
    private final String  eliminar="DELETE FROM cajadeahorro WHERE cbu=?";
    private final String  mostrar="SELECT saldo FROM cajadeahorro WHERE cbu=?";
    private PreparedStatement ps;
    private Conexion cn;

    public CajaDeAhorroDao(){
        ps=null;
        cn=Conexion.getInstance();

    }



    @Override
    public void agregar(CajaDeAhorro obj) {
        try{
            //1- Hacer la conexion con (cn) e instanciar la llamada con (ps)
            ps= cn.getConnection().prepareCall(insert);
            ps.setDouble(1,obj.getSaldo());
            ps.setString(2, obj.getCbu());
            ps.setString(3,obj.getTipo().toString());
            ps.setString(4, obj.getDniCliente().getDni());

            int res=  ps.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null,"CUENTA CREADA, SALDO DEPOSITADO");
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al crear CAJA DE AHORRO "+ex.getMessage());
        }

        cn.close();

    }

    //Elimianar Caja de ahorro


    @Override
    public void eliminar(String cbu) {
        try{
            ps=cn.getConnection().prepareCall(eliminar);
            ps.setString(1,cbu);
            int res=ps.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null,"Cuenta eliminada ");
            }else{
                System.out.println("No existe esta cuenta");
            }

        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al eliminar en DAO"+ex.getMessage());
        }


    }

    //Extraer monto por cbu caja de ahorro
    @Override
    public Double extraer(Double monto, String cbu) {
        try{
            //1- Hacer la conexion con (cn) e instanciar la llamada con (ps)
            ps= cn.getConnection().prepareCall(extraer);
            ps.setDouble(1,monto);
            ps.setString(2, cbu);
            ps.setDouble(3,monto);
            int res=  ps.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null,"MONTO EXTRAIDO");
            }else{
                System.out.println("Saldo insuficiente");
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al extraer saldo "+ex.getMessage());
        }

        cn.close();
        return null;
    }


    @Override
    public void depositar(Double monto,String cbu) {

        try{
            //1- Hacer la conexion con (cn) e instanciar la llamada con (ps)
            ps= cn.getConnection().prepareCall(depositar);
            ps.setDouble(1,monto);
            ps.setString(2, cbu);
            ps.setDouble(3,monto);
            int res=  ps.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null,"SALDO DEPOSITADO");
            }else{
                System.out.println("NO SE PERMITEN NEGATIVOS");
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al depositar saldo "+ex.getMessage());
        }

        cn.close();


    }

    @Override
    public void depositarCuentaCorriente(Double monto, String cbu, String cbu2) throws SQLException {

    }

    @Override
    public Double mostrarSaldo(String cbu) {

        try{
            ps=cn.getConnection().prepareCall(mostrar);
            ps.setString(1,cbu);
           ResultSet res=ps.executeQuery();
            while(res.next()){
                System.out.println("Saldo Actual: "+res.getString("saldo"));
            }


        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al mostrar saldo  en DAO"+ex.getMessage());
        }
        return null;

    }

}
