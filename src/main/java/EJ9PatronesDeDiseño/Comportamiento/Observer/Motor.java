package EJ9PatronesDeDiseño.Comportamiento.Observer;

public class Motor implements Observador{
    //Obsevardor
    public Motor(){}
    @Override
    public void actualizar() {
        System.out.println("actualizar Potencia, Velocidad");
    }

}
