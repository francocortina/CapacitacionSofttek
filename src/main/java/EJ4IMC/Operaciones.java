package EJ4IMC;

public class Operaciones {

    public double indiceMasaCorporal(double peso,double altura){
        double imc= peso/Math.pow(2,altura);
        return imc;
    }



}
