package EstructurasDeControl2.EstructurasDeControl;

public class EJ7 {
    /*
    Crear un programa Java que permita calcular el factorial de un numero N.
para realizar el calculo utilice todas las estructuras repetitivas estudiadas.
Se llama factorial de un número natural n al producto de los n primeros
números naturales Se representa por n!, es decir, el factorial de n (n!) se
calcula como:
n!=n x (n-1) x (n-2) x ........ 3 x 2 x 1.
Por ejemplo, el factorial de 5 es 5!=5 x 4 x 3 x 2 x 1 -> 5!=120 Se define la
factorial de 0 por 0! = 1.
    * */
    public static void main(String[] args) {

//for
        int fact=1;
        int num= 5;

        for (int i = 1; i <=num; i++) {
            fact*=i;
        }
        System.out.println(fact);
//While
      fact=1;
      num= 5;
      int j=1;
        while (j<num){
            j++;
            fact*=j;

        }
        System.out.println(fact);
//DoWhile
        fact=1;
        num= 5;
        j=1;
        do {
            j++;
            fact*=j;

        }while(j<num);
        System.out.println(fact);




    }



}
