package EJ9PatronesDeDiseño.Estructural.Fachada.Main;

import EJ9PatronesDeDiseño.Estructural.Fachada.CheckFachada.Fachada;

public class Cliente {


    public static void main(String[] args) {
        //ACA EL CLIENTE SOLO MEDIANTE UN SOLO METODO EN LA INTEFAZ GRAFICA BUSCA TODO
        Fachada fachada= new Fachada();
        fachada.buscar("02/07/2016","02/15/2016", "Peru" ,"BsAs");
    }




}
