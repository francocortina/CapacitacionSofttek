package EJ8BancoConexion.Service;

import EJ8BancoConexion.Dao.ClienteDao;
import EJ8BancoConexion.Dao.SucursalDao;
import EJ8BancoConexion.Models.Banco;
import EJ8BancoConexion.Models.Cliente;
import EJ8BancoConexion.Models.Sucursal;

public class SucursalService {
    SucursalDao obj= new SucursalDao();
    public void agregar(String nombreSucursal, Banco nombreBanco) {
        try{obj.agregar(new Sucursal(nombreSucursal,nombreBanco));
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }


    public void actualizar(String nombreSucursal,String nuevoNombre) {
        try{obj.actualizar(new Sucursal(nombreSucursal),new Sucursal(nuevoNombre));

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }



    }

    public void eliminar(String nombreSucursal) {
        try{obj.eliminar(nombreSucursal);

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }



    }


    public void mostrarSucursales() {
        try{obj.mostrarSucursales();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }



    }

}
