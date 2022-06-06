package EJ8BancoConexion.Validaciones;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validaciones {
    public static boolean verificarEmail(String email){
        boolean bandera= true;
        Pattern patron= Pattern.compile("^[a-zA-Z0-9_!#$%&'\\*+/=?{|}~^.-]+@[a-zA-Z0-9.-]+$");
        Matcher mat = patron.matcher(email);
        if(mat.find()){
            bandera=false;
        }else {
            System.out.println("No existe este Email");
        }
        return bandera;

    }
    public static boolean verificarNegativos(Double num){
        boolean band=false;
        if(num<0){
            System.out.println("Error, numero negativo");
            band=true;
        }
        return band;
    }

    public static boolean verificarDni(String dni){
        boolean bandera=false;
        if (dni.length()>10){
            System.out.println("El dni es muy largo, no existe");
            bandera=true;
        }
        return  bandera;
    }


}
