package EJ6EstructurasDeControl2.EstructurasDeControl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ5 {
/*5) Crear un programa Java para obtener el M.C.D de un número por medio del
algoritmo de Euclides*/
    //<h1>Corrreccion de ejercio del MCD, AGREGO ERRORES Excepciones y corrijo forma de hacerlo</h1>
public static void main(String[] args) {
    boolean error=true;
    Scanner scanner= new Scanner(System.in);
do{
    try{

//INGRESO DE DATOS
        System.out.println("Ingresar num1: ");
        int num1= scanner.nextInt();
        System.out.println("Ingrese num2: ");
        int num2= scanner.nextInt();
        System.out.println("El MCD es: "+calcularMCD(num1,num2));}
    //EXCEPTIONS
    catch (InputMismatchException e){
        System.out.println("No se permite ingresar texto!!");
        error=false;


    }
    catch (ErrorNegativo e){
        System.out.println("Numero Negativo, porfavor ingrese un numero positivo");
        error=false;
    }







}while(error);

}


    private static int calcularMCD (int num1, int num2) throws InputMismatchException,ErrorNegativo{
    if (num1<0| num2<0){
throw  new ErrorNegativo();

    }
        int acumulador = 0;
        int resto;
        int numero1 = Math.min(num1, num2);
        int numero2 = Math.max(num1, num2);

        // Si numero2 > nnumero1 intercambiamos  posición

        resto = numero1 % numero2;
        while (resto > 0) {
            // Itera mientras el resto es mayor a cero.
            acumulador = numero2;
            numero2 = resto;
            numero1 = acumulador;
            resto = numero1 % numero2;
        }
        return numero2;
    }

}



class ErrorNegativo extends Exception{
    public ErrorNegativo(){};
    public ErrorNegativo(String Error){
        super(Error);
    };


}

