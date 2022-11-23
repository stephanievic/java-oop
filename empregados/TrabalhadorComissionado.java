public class TrabalhadorComissionado extends Empregado{
    
    public TrabalhadorComissionado(String primeiroNome, String ultimoNome) {
        super(primeiroNome, ultimoNome);
    }

    private double comissao;
    private int quantidade;

    @Override
    double calcularGanho() {
        return this.salario + (this.comissao * this.quantidade);
    }

    public double getComissao() {
        return comissao;
    }

    public double setComissao(double comissao) {
        return this.comissao = comissao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int setQuantidade(int quantidade) {
        return this.quantidade = quantidade;
    }
    
}
