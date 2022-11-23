public class TrabalhadorPecaProduzida extends Empregado {
    private double remuneracao;
    private int quantidade;

    public TrabalhadorPecaProduzida(String primeiroNome, String ultimoNome) {
        super(primeiroNome, ultimoNome);
    }

    @Override
    double calcularGanho() {
        return this.salario = this.remuneracao + this.quantidade;
    }
    
    public double getQuantidade() {
        return quantidade;
    }

    public int setQuantidade(int quantidade) {
        return this.quantidade = quantidade;
    }

    public double getRecomuneracao() {
        return remuneracao;
    }

    public double setRecomuneracao(double recomuneracao) {
       return this.remuneracao = recomuneracao;
    }

}
