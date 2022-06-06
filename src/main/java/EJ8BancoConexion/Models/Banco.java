package EJ8BancoConexion.Models;

public class Banco {
    private String nombreBanco;

    public Banco() {
    }

    public Banco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

}
