package EJ9PatronesDeDiseño.Comportamiento.Observer;

public class Main {


    public static void main(String[] args) {
        Motor motor1= new Motor();
        Acelerador ac1= new Acelerador();
        ac1.agregarObservadore(motor1);
        ac1.acelerar(400);
    }
}
