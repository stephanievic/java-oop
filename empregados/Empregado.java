abstract class Empregado {
    protected double salario;
    protected String primeiroNome, ultimoNome;

    public Empregado(String primeiroNome, String ultimoNome) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
    }

    abstract double calcularGanho ();

    public double getSalario() {
        return salario;
    }

    public double setSalario(double salario) {
        return this.salario = salario;
    }
}