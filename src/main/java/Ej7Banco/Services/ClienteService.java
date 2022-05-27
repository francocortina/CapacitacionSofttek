package Ej7Banco.Services;

import Ej7Banco.Beans.Cliente;
import Ej7Banco.Dao.ClienteDao;

import java.util.Date;

public class ClienteService {
ClienteDao  obj=new ClienteDao();

public void agregar(String dni, String nombre, String apellido, String telefono, String email, String date){
    if (obj.agregar(new Cliente(dni,nombre,apellido,telefono,email,date))){
        System.out.println(" Dato agregado");

    };


}



}
