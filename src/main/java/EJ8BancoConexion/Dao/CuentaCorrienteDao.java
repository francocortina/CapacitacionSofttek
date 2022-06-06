package EJ8BancoConexion.Dao;

import EJ8BancoConexion.Models.CuentaCorriente;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CuentaCorrienteDao implements ICuenta<CuentaCorriente>{

    private final String  insert="INSERT INTO cuentacorriente(saldo,cbu,dnicliente )VALUES(?,?,?)";
    private final String  depositar="UPDATE cuentacorriente SET saldo=saldo+? WHERE cbu=? AND ?>0";
    private final String  extraer="UPDATE cuentacorriente SET saldo=saldo-? WHERE cbu=? AND saldo>=?";
    private final String  eliminar="DELETE FROM cuentacorriente WHERE cbu=?";
    private final String  mostrar="SELECT saldo FROM cuentacorriente WHERE cbu=?";
    private PreparedStatement ps;
    private Conexion cn;

    public CuentaCorrienteDao(){
        ps=null;
        cn=Conexion.getInstance();

    }


    //Agregar Cuenta Corriente
    @Override
    public void agregar(CuentaCorriente obj) {
        try{
            //1- Hacer la conexion con (cn) e instanciar la llamada con (ps)
            ps= cn.getConnection().prepareCall(insert);
            ps.setDouble(1,obj.getSaldo());
            ps.setString(2, obj.getCbu());
            ps.setString(3, obj.getDniCliente().getDni());


          int res=  ps.executeUpdate();
          if(res>0){
              JOptionPane.showMessageDialog(null,"CUENTA CREADA, SALDO DEPOSITADO");
          }
        }catch (SQLException ex){
                JOptionPane.showMessageDialog(null, "Error al crear cuenta Corriente "+ex.getMessage());
        }

    cn.close();

    }

    //Elimianar cuenta corriente por cbu


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

    //Extraer monto por cbu
    @Override
    public Double extraer(Double monto,String cbu) {
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

    //Depositar monto por cbu
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
                JOptionPane.showMessageDialog(null,"SALDO DEPPOSITADO");
            }else{
                System.out.println("NO SE PERMITEN NEGATIVOS");
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al depositar saldo "+ex.getMessage());
        }

        cn.close();


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
