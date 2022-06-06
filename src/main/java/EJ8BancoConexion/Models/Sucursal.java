package EJ8BancoConexion.Models;

public class Sucursal {
 private String nombreSucursal;
 private Banco nombreBancofk;

 public Sucursal(){
 }

    public Sucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }
    public Sucursal(String nombreSucursal, Banco nombreBancofk) {
        this.nombreSucursal = nombreSucursal;
        this.nombreBancofk = nombreBancofk;
    }

    public Banco getNombreBancofk() {
        return nombreBancofk;
    }

    public void setNombreBancofk(Banco nombreBancofk) {
        this.nombreBancofk = nombreBancofk;
    }

    public String getNombreSucursal(){
     return nombreSucursal;

 }
 public void setNombreSucursal(String nombreSucursal){
     this.nombreSucursal=nombreSucursal;

 }


}
