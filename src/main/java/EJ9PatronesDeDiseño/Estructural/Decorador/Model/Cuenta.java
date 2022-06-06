package EJ9PatronesDeDiseño.Estructural.Decorador.Model;

public class Cuenta {
    private Integer id;
    private String nombrecliente;

    public Cuenta(){}

    public Cuenta(Integer id, String nombrecliente){
        this.id=id;
        this.nombrecliente=nombrecliente;
    }


    public Integer getId(){
        return  id;
    }

    public void setId(Integer id ){
this.id=id;
    }

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }
}

