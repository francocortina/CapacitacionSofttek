package EJ8BancoConexion.Beans;

public class Empleado extends Persona{
    private Integer numEmpleado;
    private Sucursal sucursalEmpleado;

    public Empleado() {
    }

    public Empleado(String dni, String nombre, String apellido, String telefono, String email,Sucursal sucursalEmpleado) {
        super(dni, nombre, apellido, telefono, email);
        this.sucursalEmpleado=sucursalEmpleado;
    }

    public Empleado(String dni, String nombre, String apellido, String telefono, String email, Integer numEmpleado) {
        super(dni, nombre, apellido, telefono, email);
        this.numEmpleado = numEmpleado;
    }
    public Empleado(String dni, String nombre, String apellido, String telefono, String email) {
        super(dni, nombre, apellido, telefono, email);

    }

    public Integer getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(Integer numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public Sucursal getSucursalEmpleado() {
        return sucursalEmpleado;
    }

    public void setSucursalEmpleado(Sucursal sucursalEmpleado) {
        this.sucursalEmpleado = sucursalEmpleado;
    }
}
