package EJ8BancoConexion.Dao;


import EJ8BancoConexion.Models.Empleado;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmpleadoDao implements IPersona<Empleado>{
private final String  insertar= "INSERT INTO empleado(dni,nombreEmpleado,apellidoEmpleado,telefono,email,nombreSucursalfk)VALUES(?,?,?,?,?,?)";
private final String  actualizar= "UPDATE empleado SET nombreEmpleado=?,  apellidoEmpleado=?, telefono=?, email=? WHERE  dni=?";
private final String  eliminar= "DELETE FROM empleado WHERE dni=?";
private PreparedStatement ps;
private Conexion cn;
public EmpleadoDao(){
    ps=null;
    cn=Conexion.getInstance();
}
    @Override
    public boolean agregar(Empleado obj) {
    boolean  band=false;
    try{
        ps= cn.getConnection().prepareCall(insertar);
        ps.setString(1,obj.getDni());
        ps.setString(2,obj.getNombre());
        ps.setString(3,obj.getApellido());
        ps.setString(4,obj.getTelefono());
        ps.setString(5,obj.getEmail());
        ps.setString(6, String.valueOf(obj.getSucursalEmpleado().getNombreSucursal()));
        int rs=ps.executeUpdate();
            if (rs>0){
                JOptionPane.showMessageDialog(null,"Empleado agregado con exito");
            }

    }catch (SQLException ex){
               JOptionPane.showMessageDialog(null,"Error al agregar Empleado "+ex.getMessage());
           }
    finally {
        ps=null;
        cn.close();
    }


    return band;
    }

    @Override
    public boolean actualizar(Empleado obj) {
        boolean  band=false;
        try{
            ps= cn.getConnection().prepareCall(actualizar);

            ps.setString(1,obj.getNombre());
            ps.setString(2,obj.getApellido());
            ps.setString(3,obj.getTelefono());
            ps.setString(4,obj.getEmail());
            ps.setString(5,obj.getDni());
            int rs=ps.executeUpdate();
            if (rs>0){
                JOptionPane.showMessageDialog(null,"Empleado actualizado con exito");
            }

        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al actualizar Empleado "+ex.getMessage());
        }
        finally {
            ps=null;
            cn.close();
        }


        return band;

    }

    @Override
    public boolean eliminar(String dni) {
        boolean  band=false;
        try{
            ps= cn.getConnection().prepareCall(eliminar);
            ps.setString(1,dni);
            int rs=ps.executeUpdate();
            if (rs>0){
                JOptionPane.showMessageDialog(null,"Empleado eliminado con exito");
            }

        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al eliminar Empleado "+ex.getMessage());
        }
        finally {
            ps=null;
            cn.close();
        }


        return band;
    }


}
