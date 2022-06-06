package EJ9PatronesDeDiseño.Comportamiento.Observer;

import java.util.ArrayList;

public class Acelerador implements SujetoObservable{
    //Arraylist de todos los observadores
private ArrayList<Observador> observadores;
 public Acelerador(){
      this.observadores= new ArrayList<Observador>();

 }
//Añadir Observadores
    public void agregarObservadore(Observador o){
        observadores.add(o);
    }

    public void  acelerar(int a){
        System.out.println("Subir las revoluciones a :"+ a);
        notificar();
    }



    @Override
    public void notificar() {
        for (Observador o: observadores
             ) {
            o.actualizar();

        }
    }
    //Sujeto Observado
}
