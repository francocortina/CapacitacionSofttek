package EstructurasDeControl;

import java.util.Scanner;

public class EJ5 {
/*5) Crear un programa Java para obtener el M.C.D de un número por medio del
algoritmo de Euclides*/
public static void main(String[] args) {
    int b;
    int a;
    Scanner scanner= new Scanner(System.in);
    do{

    System.out.println("Ingrese Número 1: ");
    a= scanner.nextInt();
    System.out.println("Ingrese Núumero 2: ");
    b= scanner.nextInt();

        if(a>b){
            a = a - b;
        }
        else{
            b = b - a;
        }
        System.out.println(a);
    }while(b>0);



}

}


