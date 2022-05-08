package EstructurasDeControl2.EstructurasDeControl;

import java.util.Scanner;

public class EJ3 {

    public static void main(String[] args) {

 //3 Crear un programa Java para calcular el resto y cociente de dos números  por medio de restas sucesivas.

        int num1;
        int num2;
        int cociente=0;
        Scanner scanner= new Scanner(System.in);

        do{
            System.out.println("Ingrese Dividendo");
            num1= scanner.nextInt();
            System.out.println("Ingrese divisor");
            num2= scanner.nextInt();
/*Mientras num1 sea mayor o igual a num2 2 entra*/
            while(num1>=num2){

               num1-=num2;
               cociente++;



            }
            System.out.println("Resto "+num1);
            System.out.println("Cociente:" + cociente);
        }while(num1>0 & num2>0);



    }}


