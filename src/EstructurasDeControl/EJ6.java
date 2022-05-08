package EstructurasDeControl;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
*Crear un programa Java que imprima la siguiente tabla:<br>
* NOTA1    NOTA2   NOTA3    PROMEDIO <br>
*a) Ingrese la cantidad de filas a mostrar.<br>
b) Cargue el valor de las notas utilizando una función Random.<br>
c) Calcule el promedio de las tres notas por cada fila.<br>
d) Muestre el promedio por fila redondeando a 2 cifras decimales<br>
*
* */
public class EJ6 {
    public static void main(String[] args) {
        Random random= new Random();
        Scanner scanner= new Scanner(System.in);
        ArrayList<Filas> tabla1= new ArrayList<Filas>();
        System.out.println("Ingrese cantidad de Filas a Mostar: ");
        int numerofilas= scanner.nextInt();
        System.out.println("Nota1 "+"Nota2 "+" Nota3"+" Promedio");
        //For
        for (int i = 0; i <numerofilas ; i++) {
            double nota1=random.nextInt(1+10);
            double nota2=random.nextInt(1+10);
            double nota3=random.nextInt(1+10);
            Filas notas1= new Filas(nota1,nota2,nota3);

            System.out.println(notas1.getNota1()+"   "+notas1.getNota2()+"    "+notas1.getNota3()+"    "
            + notas1.CalcularPromedio(notas1.getNota1(),notas1.getNota2(),notas1.getNota3()));
        }

        //while
        int j=0;
        System.out.println("");
        System.out.println("Nota1 "+"Nota2 "+" Nota3"+" Promedio");
        while(j<numerofilas){
            j++;

            double nota1=random.nextInt(1+10);
            double nota2=random.nextInt(1+10);
            double nota3=random.nextInt(1+10);
            Filas notas1= new Filas(nota1,nota2,nota3);

            System.out.println(notas1.getNota1()+"   "+notas1.getNota2()+"    "+notas1.getNota3()+"    "
             + notas1.CalcularPromedio(notas1.getNota1(),notas1.getNota2(),notas1.getNota3()));




        }

       //do while

        System.out.println("");
        System.out.println("Nota1 "+"Nota2 "+" Nota3"+" Promedio");
        int k=0;
        do {
        k++;
            double nota1=random.nextInt(1+10);
            double nota2=random.nextInt(1+10);
            double nota3=random.nextInt(1+10);
            Filas notas1= new Filas(nota1,nota2,nota3);

            System.out.println(notas1.getNota1()+"   "+notas1.getNota2()+"    "+notas1.getNota3()+"    "
                    + notas1.CalcularPromedio(notas1.getNota1(),notas1.getNota2(),notas1.getNota3()));

        }while(k<numerofilas);







    }




}

//Objeto Fila
class Filas{
    double nota1;
    double nota2;
    double nota3;
    double promedio;

    //Cosntructor
    public Filas(double nota1, double nota2, double nota3){
        this.nota1=nota1;
        this.nota2=nota2;
        this.nota3=nota3;
    }

    public String CalcularPromedio(double nota1, double nota2, double nota3){
            double promedio=(nota1+nota2+nota3)/3;
        DecimalFormat df = new DecimalFormat("#.00");
            return df.format(promedio);
    }

    public double getPromedio(){
        return promedio;

    }
    public void setPromedio(double promedio){
        this.promedio=promedio;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }
}

