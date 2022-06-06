package EJ8BancoConexion.Models;

public class CajaDeAhorro extends Cuenta{
    private TipoMoneda tipo;
    private Cliente dniCliente;

    public CajaDeAhorro() {
    }

    public CajaDeAhorro(Double saldo, String cbu, TipoMoneda tipo,Cliente dniCliente) {
        super(saldo, cbu);
        this.tipo = tipo;
        this.dniCliente=dniCliente;
    }
    public CajaDeAhorro(Integer numCuneta, Double saldo, String cbu, TipoMoneda tipo) {
        super(numCuneta, saldo, cbu);
        this.tipo = tipo;
    }


    public TipoMoneda getTipo() {
        return tipo;
    }

    public void setTipo(TipoMoneda tipo) {
        this.tipo = tipo;
    }

    public Cliente getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(Cliente dniCliente) {
        this.dniCliente = dniCliente;
    }
}
