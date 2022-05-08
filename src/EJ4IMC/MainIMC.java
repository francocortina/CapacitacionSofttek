package EJ4IMC;

import java.util.Scanner;

public class MainIMC {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Indice de Masa Corporal");
        Operaciones op= new Operaciones();

        System.out.println("Ingrese su Peso: ");
        double peso= scanner.nextDouble();
        if(peso<0){

            System.out.println("Error al ingresar su peso");
        }else{
            System.out.println("Ingrese su altura: ");
            double altura= scanner.nextDouble();
            if (altura<0){
                System.out.println("Error al ingrsar su altura");

            }else{
                double imc=op.indiceMasaCorporal(peso,altura);
                if(imc<18.5){System.out.println("Su IMC es de: "+imc+" KG/m^2, BAJO ");}
                else{
                    if(imc>=18.5 & imc<=24.9){
                        System.out.println("Su IMC es de: "+imc+" KG/m^2, NORMAL");
                    }else{
                        if(imc>=25 & imc<=29.9){
                            System.out.println("Su IMC es de: "+imc+" KG/m^2, SOBREPESO");
                        }else{
                            if(imc>=30 & imc<=34.9){
                                System.out.println("Su IMC es de: "+imc+" KG/m^2, OBESIDAD1");
                            }else{

                                if(imc>=35 & imc<=39.9){
                                    System.out.println("Su IMC es de: "+imc+" KG/m^2, OBESIDAD2");
                                }else{
                                    System.out.println("Su IMC es de: "+imc+" KG/m^2, OBESIDAD3");

                                }
                            }

                        }

                    }
                }


            }
        }



    }


}
