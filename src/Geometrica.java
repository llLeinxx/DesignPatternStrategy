public class Geometrica implements ICalcMedia{

    public double CalculaMedia(double p1, double p2){
        return Math.sqrt(p1 * p2);

    }


    public String Situacao (double media){

        return (media > 7.0) ? "Aprovado" : "Reprovado";

    }
}
