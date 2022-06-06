package EJ8BancoConexion.Main;


import EJ8BancoConexion.Models.Banco;
import EJ8BancoConexion.Models.Cliente;
import EJ8BancoConexion.Models.Sucursal;
import EJ8BancoConexion.Models.TipoMoneda;
import EJ8BancoConexion.Service.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Solo falta hacer los metodos de Sucursal, pero el programa anda*/
        String dni;
        String nombre;
        String nombre2;
        String apellido;
        String telefono;
        String email;
        String cbu;
        Double monto;
       TipoMoneda tipo;
       String banco;



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
                    System.out.println("4-Crear Sucursal");
                    System.out.println("5-Modificar Sucursal");
                    System.out.println("6-Eliminar Sucursal");
                    System.out.println("7-Listar Sucursales");
                    System.out.println("0-Exit");
                    option= scanner.nextInt();
                    switch (option){
                        case 1:
                            scanner.nextLine();
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
                            System.out.println("Ingrese la sucursal: ");
                            nombre2=scanner.nextLine();
                            EmpleadoService emp = new EmpleadoService();
                            emp.agregar(dni,nombre,apellido,telefono,email,new Sucursal(nombre2));
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
                        case 4:
                            scanner.nextLine();
                            System.out.println("Nombre de la Nueva Sucursal");
                            nombre= scanner.nextLine();
                            SucursalService suc= new SucursalService();
                            suc.agregar(nombre,new Banco("BBVA"));

                            break;
                        case 5:
                            scanner.nextLine();
                            System.out.println("No se cambiaran nombres de sucursales con Clientes ya inscriptos");

                            System.out.println("       Ingrese Sucursal que desea cambiar: ");
                            nombre= scanner.nextLine();
                            System.out.println("Ingrese Nuevo nombre");
                            nombre2= scanner.nextLine();
                            suc= new SucursalService();
                            suc.actualizar(nombre,nombre2);
                            break;
                        case 6:
                            scanner.nextLine();
                            System.out.println("Nombre de Sucursal a eliminar");
                            nombre=scanner.nextLine();
                            suc=new SucursalService();
                            suc.eliminar(nombre);
                            break;
                        case 7:
                            suc=new SucursalService();
                            suc.mostrarSucursales();
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
                            System.out.println("Ingrese la sucursal: ");
                            nombre2=scanner.nextLine();
                            ClienteService cli= new ClienteService();
                            cli.agregar(dni,nombre,apellido,telefono,email,new Sucursal(nombre2));
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
                                    //Para crearle la cuenta al cliente, lo puse acá para diferenciar las tareas
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
