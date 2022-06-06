package EJ8BancoConexion.Dao;


import EJ8BancoConexion.Models.Sucursal;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class SucursalDao implements ISucursal<Sucursal>{

    private final String insert="INSERT INTO sucursal(nombreSucursal,bancoNombrefk)VALUES (?,?)";
    private final String update="UPDATE sucursal SET nombreSucursal=? WHERE nombreSucursal=?";
    private final String delete="DELETE FROM sucursal WHERE nombreSucursal=?";
    private final String mostrar="SELECT nombreSucursal FROM sucursal";
    private PreparedStatement ps;
    private Conexion CN;

    public SucursalDao(){
        ps=null;
        CN=Conexion.getInstance();

    }

    @Override
    public boolean agregar(Sucursal obj) {
        boolean band=false;


        try {

            ps=CN.getConnection().prepareCall(insert);
            ps.setString(1, obj.getNombreSucursal());
            ps.setString(2, obj.getNombreBancofk().getNombreBanco());
            int res= ps.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null,"Sucursal Creada");
            }
        } catch (SQLException e) {
            System.out.println("Error en la parte de SucursalDao"+ e.getMessage());
            e.printStackTrace();
        }finally {
            ps=null;

        }
        return band;
    }

    public boolean actualizar(Sucursal obj, Sucursal obj2) {

        boolean band=false;


        try {

            ps=CN.getConnection().prepareCall(update);

            ps.setString(1,obj2.getNombreSucursal());
            ps.setString(2,obj.getNombreSucursal());

            int res= ps.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null,"Sucursal Actualizada");

            }
        } catch (SQLException e) {
            System.out.println("Error en la parte de SucursalDao"+ e.getMessage());
            e.printStackTrace();
        }finally {
            ps=null;

        }
        return band;


    }

    @Override
    public boolean eliminar(String nombreSucursal) {
        boolean band=false;
        try{
            ps=CN.getConnection().prepareCall(delete);

            ps.setString(1, nombreSucursal);

            int res= ps.executeUpdate();
            if (res>0){
                JOptionPane.showMessageDialog(null,"Sucursal eliminada con exito");
            }
            CN.close();


        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al eliminar Sucursal "+ex.getMessage());
        }
        return band;

    }

    public void mostrarSucursales() {

        try{
            ps=CN.getConnection().prepareCall(mostrar);
            ResultSet res=ps.executeQuery();
            while(res.next()){
                System.out.println("Nombre Sucursal: "+res.getString("nombreSucursal"));
            }


        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al mostrar saldo  en DAO"+ex.getMessage());
        }


    }

}
