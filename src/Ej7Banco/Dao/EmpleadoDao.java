package Ej7Banco.Dao;

import Ej7Banco.Beans.Empleado;

import javax.swing.table.DefaultTableModel;

public class EmpleadoDao implements IPersona<Empleado> {
    @Override
    public boolean agregar(Empleado obj) {
        return false;
    }

    @Override
    public boolean actualizar(Empleado obj) {
        return false;
    }

    @Override
    public boolean eliminar(Empleado dni) {
        return false;
    }

    @Override
    public DefaultTableModel lista() {
        return null;
    }
}
