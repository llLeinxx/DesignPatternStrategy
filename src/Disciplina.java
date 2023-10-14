public class Disciplina {
    private ICalcMedia CalcMedia;
    private double media;
    private String Nome;
    private double p1;
    private double p2;
    private String Situacao;

    public Disciplina(ICalcMedia CalcMedia) {
        this.CalcMedia = CalcMedia;
    }
    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public String getSituacao() {
        return Situacao;
    }

    public void setSituacao(String situacao) {
        Situacao = situacao;
    }

    public void CalcularMedia(){

        media = CalcMedia.CalculaMedia(p1, p2);
        Situacao = CalcMedia.Situacao(media);
    }
}
