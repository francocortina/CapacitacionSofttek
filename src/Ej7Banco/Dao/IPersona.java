package Ej7Banco.Dao;

import javax.swing.table.DefaultTableModel;

public interface IPersona<T> {

    boolean agregar(T obj);
    boolean actualizar(T obj);
    boolean eliminar (T dni);
    DefaultTableModel lista();
}
