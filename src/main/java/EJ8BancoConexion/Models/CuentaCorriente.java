package EJ8BancoConexion.Models;



public class CuentaCorriente extends Cuenta {
    private Double interes;
    private Cliente dniCliente;

    public CuentaCorriente() {
    }
    public CuentaCorriente(Double saldo, String cbu,Cliente dniCliente) {
        super(saldo, cbu);
        this.dniCliente=dniCliente;

    }
    public CuentaCorriente(Integer numCuneta, Double saldo, String cbu, Double interes) {
        super(numCuneta, saldo, cbu);
        this.interes = interes;
    }

    public Cliente getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(Cliente dniCliente) {
        this.dniCliente = dniCliente;
    }

    public Double getInteres() {
        return interes;
    }

    public void setInteres(Double interes) {
        this.interes = interes;
    }
}
