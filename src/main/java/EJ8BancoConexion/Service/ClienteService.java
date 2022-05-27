package EJ8BancoConexion.Service;

import EJ8BancoConexion.Beans.Cliente;
import EJ8BancoConexion.Beans.Sucursal;
import EJ8BancoConexion.Dao.ClienteDao;

public class ClienteService {

    ClienteDao obj= new ClienteDao();
    public void agregar(String dni, String nombre, String apellido, String telefono, String email, Sucursal sucursalDeCliente) {
        try{obj.agregar(new Cliente(dni,nombre,apellido,telefono,email,sucursalDeCliente));

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }



    }


    public void actualizar(String dni, String nombre, String apellido, String telefono, String email) {
        try{obj.actualizar(new Cliente(dni,nombre,apellido,telefono,email));

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }



    }

    public void eliminar(String dni) {
        try{obj.eliminar(dni);

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }



    }
}