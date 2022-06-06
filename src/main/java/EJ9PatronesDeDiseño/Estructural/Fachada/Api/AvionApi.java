package EJ9PatronesDeDiseño.Estructural.Fachada.Api;

public class AvionApi {


    public static void BuscarVuelos(String fechaIda, String fechaVuelta, String origen, String destino){
        System.out.println("==================");
        System.out.println("Vuelos encontrados para "+ destino+" desde "+ origen);
        System.out.println("Fecha Ida "+ fechaIda+ " Fecha Vuelta "+ fechaVuelta);
        System.out.println("Latam $35000");


    }
}
