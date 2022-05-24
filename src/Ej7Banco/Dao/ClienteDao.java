package Ej7Banco.Dao;

import Ej7Banco.Beans.Cliente;

import javax.swing.table.DefaultTableModel;
import java.sql.CallableStatement;
import java.sql.Connection;

public class ClienteDao implements IPersona<Cliente>{
    //Hago la coneccion
Connection cn = new Conexion().getCn();
    @Override
    public boolean agregar(Cliente obj) {
        boolean band=false;
        try{CallableStatement cs= cn.prepareCall("{call USP_AGREGARCLIENTE(?,?,?,?,?,?)}");
            cs.setString(1,obj.getDni());
            cs.setString(2,obj.getNombre());
            cs.setString(3,obj.getApellido());
            cs.setString(4,obj.getTelefono());
            cs.setString(5,obj.getEmail());
            cs.setString(6,obj.getAltaCliente());
            if (cs.executeUpdate()>0){
             band=true;

            }

        }

        catch (Exception ex){
            System.out.println(ex+" Algo ESTÁ MAL");
        }
        return band;
    }

    @Override
    public boolean actualizar(Cliente obj) {
        return false;
    }

    @Override
    public boolean eliminar(Cliente dni) {
        return false;
    }


    @Override
    public DefaultTableModel lista() {
        return null;
    }
}
