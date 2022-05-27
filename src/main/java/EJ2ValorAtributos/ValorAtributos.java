package EJ2ValorAtributos;

public class ValorAtributos {
    public static void main(String[] args) {
        long dni=40895483;
        int edad=24;
        double pi=3.14;
        String temperatura= "38°";
        boolean interruptor=false;
        boolean tiposocio=false;
        String nombreyapellido ;

        //DECLARACION ARREGLO DRECTA
        String [] arreglo={"franco"};
        //DECALRACIONA RREGLO INDIRECTA
        String[] arreglo2= new String[25];
        arreglo2[1]="manu";


        for (String a:arreglo2
             ) {
            System.out.println(a);

        }


        System.out.println(dni);


    }
}
