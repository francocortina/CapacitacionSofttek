package EJ3Operaciones;

import java.util.Scanner;

public class CalculadoraMetodos {
    public static void main(String[] args) {
        Operaciones operaciones= new Operaciones();
        Scanner sacaner= new Scanner(System.in);
        int option;
        int num1;
        int num2;
        do{
            System.out.println("Bienvenido");
            System.out.println("1- sumar");
            System.out.println("2- restar");
            System.out.println("3- dividir");
            System.out.println("4- multiplicar");
            System.out.println("0- Salir");
            option= sacaner.nextInt();
            switch (option){
                case 1:
                    System.out.println("Ingrese num1");
                  num1= sacaner.nextInt();
                    System.out.println("Ingrese num2");
                   num2= sacaner.nextInt();
                    System.out.println("Resultado:"+operaciones.Suma(num1,num2));
                    break;
                case 2:
                    System.out.println("Ingrese num1");
                     num1= sacaner.nextInt();
                    System.out.println("Ingrese num2");
                     num2= sacaner.nextInt();
                    System.out.println("Resultado:"+operaciones.Resta(num1,num2));
                    break;
                case 3:
                    System.out.println("Ingrese num1");
                    num1= sacaner.nextInt();
                    System.out.println("Ingrese num2");
                    num2= sacaner.nextInt();
                    System.out.println("Resultado:"+operaciones.Div(num1,num2));
                    break;
                case 4:
                    System.out.println("Ingrese num1");
                    num1= sacaner.nextInt();
                    System.out.println("Ingrese num2");
                    num2= sacaner.nextInt();
                    System.out.println("Resultado:"+operaciones.Mult(num1,num2));
                    break;


            }


        }while (option!=0);

    }


}
