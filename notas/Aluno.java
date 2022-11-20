package notas;

public class Aluno {
    private String nome;
    private int matricula;
    private double prova1;
    private double prova2;
    private double trabalho;
    private double media;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getProva1() {
        return prova1;
    }

    public void setProva1(double prova1) {
        this.prova1 = prova1;
    }

    public double getProva2() {
        return prova2;
    }

    public void setProva2(double prova2) {
        this.prova2 = prova2;
    }

    public double getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(double trabalho) {
        this.trabalho = trabalho;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double media (double prova1, double prova2, double trabalho){

        this.media = (((this.prova1 * 2.5) + (this.prova2 * 2.5) + (this.trabalho * 2)) / 7);

        return this.media;
    }
    
    public void finalMedia (){
        double finalMedia = 6 - this.media;

        if (this.media < 6){
            System.out.print("O aluno precisa de " + finalMedia + " pontos para passar.");
        }

        else if (this.media >= 6){
            System.out.println("O aluno precisa de 0 pontos para passar.");
        }
    }
}
