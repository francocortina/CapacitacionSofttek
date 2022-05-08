package EstructurasDeControl;

public class EJ1 {
    public static void main(String[] args) {
        //1 Calcular la suma de los primeros 100 numeros enteros positivos

        //For
        int suma=0;
        for (int i = 0; i <100 ; i++) {
            suma+=i;

        }
        System.out.println("For:" +suma);

        //While
        int i=0;
        suma=0;
        while(i<100){

            suma+=i;
            i++;

        }
        System.out.println("While: "+suma);

        //do while
        i=0;
        suma=0;
        do{
            suma+=i;
            i++;
        }while(i<100);
        System.out.println("DoWhile: "+suma);
    }

}
