package EJ8BancoConexion.Main;


import EJ8BancoConexion.Beans.Cliente;
import EJ8BancoConexion.Beans.Sucursal;
import EJ8BancoConexion.Beans.TipoMoneda;
import EJ8BancoConexion.Service.CajaDeAhorroService;
import EJ8BancoConexion.Service.ClienteService;
import EJ8BancoConexion.Service.CuentaCorrienteService;
import EJ8BancoConexion.Service.EmpleadoService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Solo falta hacer los metodos de Sucursal, pero el programa anda*/
        String dni;
        String nombre;
        String apellido;
        String telefono;
        String email;
        String cbu;
        Double monto;
       TipoMoneda tipo;


        int option;
        Scanner scanner= new Scanner(System.in);
        do{
            System.out.println("------Menú Principal Banco------");
            System.out.println("Elija la opción que desea: ");
            System.out.println("1-Acceso Empleado");
            System.out.println("2-Acceso Cliente");
            System.out.println("0-Exit");
            option= scanner.nextInt();
            switch (option){
                case 1:
                    System.out.println("Elija la opción que desea");
                    System.out.println("1-Crear Cuenta Empleado");
                    System.out.println("2-Modificar Cuenta Empleado");
                    System.out.println("3-Eliminar cuenta Empleado");
                    System.out.println("0-Exit");
                    option= scanner.nextInt();
                    switch (option){
                        case 1:
                            System.out.println("Ingrese su dni");
                            dni= scanner.next();
                            System.out.println("Ingrese su nombre");
                            nombre= scanner.next();
                            System.out.println("Ingrese su apellido");
                            apellido= scanner.next();
                            System.out.println("Ingrese su telefono");
                            telefono= scanner.next();
                            System.out.println("Ingrese su email");
                            email= scanner.next();
                            //Lo dejé fijo en La Plata, sino tendría que crear un DAO de Sucursal o agregarlas a la BD directamente
                            EmpleadoService emp = new EmpleadoService();
                            emp.agregar(dni,nombre,apellido,telefono,email,new Sucursal("La Plata"));
                            break;
                        case 2:

                            System.out.println("Ingrese su dni");
                            dni= scanner.next();
                            System.out.println("Puede cambiar o mantener sus datos de perfil");
                            System.out.println("Ingrese su nombre");
                            nombre= scanner.next();
                            System.out.println("Ingrese su apellido");
                            apellido= scanner.next();
                            System.out.println("Ingrese su telefono");
                            telefono= scanner.next();
                            System.out.println("Ingrese su email");
                            email= scanner.next();

                            emp = new EmpleadoService();
                            emp.actualizar(dni,nombre,apellido,telefono,email);
                            break;
                        case 3:
                            System.out.println("¿Desea eliminar su cuenta?");
                            System.out.println("Ingrese su numero de dni: ");
                            dni= scanner.next();
                            emp = new EmpleadoService();
                            emp.eliminar(dni);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("------Bienvenido----");
                    System.out.println("1-Registarse");
                    System.out.println("2-Modificar Cuenta");
                    System.out.println("3-Eliminar Cuenta");
                    System.out.println("4-Cuenta Corriente");
                    System.out.println("5-Cuenta Caja De Ahorro");
                    System.out.println("0-Exit");
                    option= scanner.nextInt();
                    switch (option){
                        case 1:
                            System.out.println("Ingrese su dni");
                            dni= scanner.next();
                            System.out.println("Ingrese su nombre");
                            nombre= scanner.next();
                            System.out.println("Ingrese su apellido");
                            apellido= scanner.next();
                            System.out.println("Ingrese su telefono");
                            telefono= scanner.next();
                            System.out.println("Ingrese su email");
                            email= scanner.next();
                            ClienteService cli= new ClienteService();
                            //Por el momento solo lo agrego a la sucursal La Plata sino tendría que crear otro Dao para sucursal o agregarlo directamente
                            cli.agregar(dni,nombre,apellido,telefono,email,new Sucursal("La Plata"));
                            break;
                        case 2:
                            System.out.println("Ingrese su dni");
                            dni= scanner.next();
                            System.out.println("Puede cambiar o mantener sus datos de perfil");
                            System.out.println("Ingrese su nombre");
                            nombre= scanner.next();
                            System.out.println("Ingrese su apellido");
                            apellido= scanner.next();
                            System.out.println("Ingrese su telefono");
                            telefono= scanner.next();
                            System.out.println("Ingrese su email");
                            email= scanner.next();
                            cli= new ClienteService();
                            //Por el momento solo lo agrego a la sucursal La Plata sino tendría que crear otro Dao apra sucursal o agregarlo directamente
                            cli.actualizar(dni,nombre,apellido,telefono,email);
                            break;
                        case 3:
                            System.out.println("¿Desea eliminar su cuenta?");
                            System.out.println("Ingrese su numero de dni: ");
                            dni= scanner.next();
                            cli = new ClienteService();
                            cli.eliminar(dni);
                            break;

                        case 4:
                            System.out.println("1-Crear cuenta Corriente");
                            System.out.println("2-Extraer Dinero");
                            System.out.println("3-Depositar Dinero");
                            System.out.println("4-Eliminar cuenta Corriente");
                            System.out.println("5-Mostrar Saldo");
                            System.out.println("0-Exit");
                            option=scanner.nextInt();
                            switch (option){
                                case 1:
                                    //Esta opcion tendria que estar en la parte de empleado
                                    //Para crearle la cuenta al cliente,, lo puse acá para diferenciar las tareas
                                    System.out.println("Ingrese su dni de Cliente");
                                    dni= scanner.next();
                                    System.out.println("Ingrese monto inicial, agregar .00 al final");
                                    monto= scanner.nextDouble();
                                    System.out.println("Ingrese la clave de CBU que desea crear");
                                    cbu= scanner.next();
                                    CuentaCorrienteService corriente= new CuentaCorrienteService();
                                    corriente.agregar(monto,cbu,new Cliente(dni));
                                    break;
                                case 2:
                                    System.out.println("Ingrese su CBU");
                                    cbu= scanner.next();
                                    System.out.println("Ingrese el monto a extraer, agregar .00");
                                    monto= scanner.nextDouble();
                                    corriente=new CuentaCorrienteService();
                                    corriente.extraer(monto,cbu);
                                    break;
                                case 3:
                                    System.out.println("Ingrese su CBU");
                                    cbu= scanner.next();
                                    System.out.println("Ingrese monto a depositar, agregar .00 al final");
                                    monto= scanner.nextDouble();
                                    corriente=new CuentaCorrienteService();
                                    corriente.depositar(monto,cbu);
                                    break;
                                case 4:
                                    System.out.println("Ingrese su cbu para ELIMINAR su cuenta Corriente");
                                    cbu= scanner.next();
                                    corriente=new CuentaCorrienteService();
                                    corriente.eliminar(cbu);
                                    break;
                                case 5:
                                    System.out.println("Ingrese el CBU de la cuenta");
                                    cbu= scanner.next();
                                    corriente=new CuentaCorrienteService();
                                    corriente.mostrar(cbu);

                            }
                            break;
                        case 5:
                            System.out.println("1-Crear cuenta Caja de Ahorro");
                            System.out.println("2-Extraer Dinero");
                            System.out.println("3-Depositar Dinero");
                            System.out.println("4-Eliminar cuenta Caja de Ahorro");
                            System.out.println("5-Mostrar saldo");
                            System.out.println("0-Exit");
                            option=scanner.nextInt();
                            switch (option){
                                case 1:
                                    //Esta opcion tendria que estar en la parte de empleado
                                    //Para crearle la cuenta al cliente, lo puse acá para diferenciar las tareas
                                    System.out.println("Ingrese su dni de Cliente");
                                    dni= scanner.next();
                                    //Podría hacerlo con un if el tipo de moneda, lo pongo directo por ser un proyecto nuestro
                                    System.out.println("Ingrese el tipo de Moneda de la cuenta en Mayúscula, PESOS/DOLARES/EUROS");
                                    tipo= TipoMoneda.valueOf(scanner.next());
                                    System.out.println("Ingrese monto inicial, agregar .00 al final");
                                    monto= scanner.nextDouble();
                                    System.out.println("Ingrese la clave de CBU que desea crear ");
                                    cbu= scanner.next();
                                    CajaDeAhorroService ahorro= new CajaDeAhorroService();
                                    ahorro.agregar(monto,cbu,tipo,new Cliente(dni));

                                    break;
                                case 2:
                                    System.out.println("Ingrese su CBU");
                                    cbu= scanner.next();
                                    System.out.println("Ingrese el monto a extraer, agregar .00");
                                    monto= scanner.nextDouble();
                                    ahorro=new CajaDeAhorroService();
                                    ahorro.extraer(monto,cbu);
                                    break;
                                case 3:
                                    System.out.println("Ingrese su CBU");
                                    cbu= scanner.next();
                                    System.out.println("Ingrese monto a depositar, agregar .00 al final");
                                    monto= scanner.nextDouble();
                                    ahorro=new CajaDeAhorroService();
                                    ahorro.depositar(monto,cbu);
                                    break;
                                case 4:
                                    System.out.println("Ingrese su cbu para ELIMINAR su cuenta Caja de Ahorro");
                                    cbu= scanner.next();
                                    ahorro=new CajaDeAhorroService();
                                    ahorro.eliminar(cbu);
                                    break;
                                case 5:
                                    System.out.println("Ingrese el CBU de la cuenta");
                                    cbu= scanner.next();
                                    ahorro=new CajaDeAhorroService();
                                    ahorro.mostrar(cbu);
                            }
                            break;
                    }

break;
            }




        }while (option!=0);






    }
}
