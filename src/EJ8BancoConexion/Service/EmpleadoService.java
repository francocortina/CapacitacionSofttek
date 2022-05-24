package EJ8BancoConexion.Service;


import EJ8BancoConexion.Beans.Empleado;
import EJ8BancoConexion.Beans.Sucursal;
import EJ8BancoConexion.Dao.EmpleadoDao;


public class EmpleadoService {
    private EmpleadoDao obj= new EmpleadoDao();


    public void agregar(String dni, String nombre, String apellido, String telefono, String email, Sucursal sucursalEmpleado) {
        try{obj.agregar(new Empleado(dni,nombre,apellido,telefono,email,sucursalEmpleado));

        }catch (Exception ex){
            System.out.println("ERROR EN SERVICE EMPLEADO"+ex.getMessage());
        }



    }

    public void actualizar(String dni, String nombre, String apellido, String telefono, String email) {
        try{
             obj.actualizar(new Empleado(dni,nombre,apellido,telefono,email));


        }catch (Exception ex){
            System.out.println("ERROR EN SERVICE EMPLEADO"+ex.getMessage());
        }



    }

    public void eliminar(String dni ) {
        try{
            obj.eliminar(dni);


        }catch (Exception ex){
            System.out.println("ERROR EN SERVICE EMPLEADO Eliminar"+ex.getMessage());
        }



    }


}
