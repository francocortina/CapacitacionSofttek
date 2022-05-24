package EJ8BancoConexion.Beans;

public abstract class Cuenta {
    private Integer numCuenta;
    private Double saldo;
    private String cbu;

    public Cuenta() {
    }

    public Cuenta( Double saldo, String cbu) {

        this.saldo = saldo;
        this.cbu = cbu;
    }
    public Cuenta(Integer numCuenta, Double saldo, String cbu) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.cbu = cbu;
    }

    public Integer getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(Integer numCuenta) {
        this.numCuenta = numCuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }
}
