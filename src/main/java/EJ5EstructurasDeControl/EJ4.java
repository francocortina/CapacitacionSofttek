package EJ5EstructurasDeControl;

import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {
        //4) Crear un programa Java para calcular la Serie de Fibonnaci
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese num para la serie de Fibonacci");
        int n= scanner.nextInt();
        int num1=0;
        int num2=1;
        int r;

        if (n==1){
            System.out.println(1+" Tiene que ingresar un num mayor a 1");
        }else if(n==0){
            System.out.println(0+" Tiene que ingresar un num mayor a 1");
        }else

            for (int i = 1; i <n ; i++) {
               r=num1;
               num1=num1+num2;
               num2=r;
                System.out.println(num2);

            }






    }
}
