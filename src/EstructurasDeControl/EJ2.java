package EstructurasDeControl;

public class EJ2 {
    public static void main(String[] args) {
        //2 Crear un programa Java que imprima la tabla de multiplicar de los números 1 al 9.
        for (int j = 1; j <=9 ; j++) {
            for (int k = 1; k <=9 ; k++) {
                int mult=j*k;
                System.out.println(j+" * "+k+": "+mult);

            }
        }
    }
}
