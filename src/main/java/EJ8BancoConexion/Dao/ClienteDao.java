package EJ8BancoConexion.Dao;

import EJ8BancoConexion.Beans.Cliente;

import javax.swing.*;
import java.sql.*;

public class ClienteDao implements IPersona <Cliente>{
    private final String insert="INSERT INTO cliente(dni,nombreCliente,apellidoCliente,telefono,email,nombreSucursalfk)VALUES (?,?,?,?,?,?)";
    private final String update="UPDATE cliente SET nombreCliente=?,apellidoCliente=?,telefono=?,email=? WHERE dni=?";
    private final String delete="DELETE FROM cliente WHERE dni=?";
    private PreparedStatement ps;
    private Conexion CN;


    public ClienteDao() {
        ps=null;
        CN= new Conexion();

    }
    @Override
    public boolean agregar(Cliente obj) {
        boolean band=false;


        try {

            ps=CN.getConnection().prepareCall(insert);
            ps.setString(1, obj.getDni());
            ps.setString(2, obj.getNombre());
            ps.setString(3, obj.getApellido());
            ps.setString(4, obj.getTelefono());
            ps.setString(5, obj.getEmail());
            ps.setString(6, String.valueOf(obj.getSucursalDeCliente().getNombreSucursal()));
           int res= ps.executeUpdate();
           if(res>0){
               JOptionPane.showMessageDialog(null,"Registro guardado");
           }
        } catch (SQLException e) {
            System.out.println("Error en la parte de clienteDao"+ e.getMessage());
            e.printStackTrace();
        }finally {
            ps=null;

        }
return band;

    }

    @Override
    public boolean actualizar(Cliente obj) {

        boolean band=false;


        try {

            ps=CN.getConnection().prepareCall(update);

            ps.setString(1, obj.getNombre());
            ps.setString(2, obj.getApellido());
            ps.setString(3, obj.getTelefono());
            ps.setString(4, obj.getEmail());
            ps.setString(5, obj.getDni());
            int res= ps.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null,"Registro Actualizado");
            }
        } catch (SQLException e) {
            System.out.println("Error en la parte de clienteDao"+ e.getMessage());
            e.printStackTrace();
        }finally {
            ps=null;

        }
        return band;


    }

    @Override
    public boolean eliminar(String dni) {
        boolean band=false;
        try{
            ps=CN.getConnection().prepareCall(delete);

            ps.setString(1, dni);

            int res= ps.executeUpdate();
            if (res>0){
                JOptionPane.showMessageDialog(null,"Cliente eliminado con exito");
            }
          CN.close();


        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al eliminar cliente "+ex.getMessage());
        }
return band;

    }
}
