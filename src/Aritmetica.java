public class Aritmetica implements ICalcMedia{
    public double CalculaMedia(double p1, double p2){
        return (p1 + p2) / 2;

    }


    public String Situacao (double media){

        return (media > 5.0) ? "Aprovado" : "Reprovado";

    }
}
