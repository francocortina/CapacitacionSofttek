package EJ9PatronesDeDiseño.Estructural.Fachada.CheckFachada;

import EJ9PatronesDeDiseño.Estructural.Fachada.Api.AvionApi;
import EJ9PatronesDeDiseño.Estructural.Fachada.Api.HotelApi;

import static EJ9PatronesDeDiseño.Estructural.Fachada.Api.AvionApi.BuscarVuelos;
import static EJ9PatronesDeDiseño.Estructural.Fachada.Api.HotelApi.BuscarHotel;

public class Fachada {


public Fachada(){}


public void buscar(String fechaIda, String fechaVuelta, String origen, String destino){
BuscarVuelos(fechaIda,fechaVuelta,origen,destino);
BuscarHotel(fechaIda,fechaVuelta,origen,destino);
}

}
