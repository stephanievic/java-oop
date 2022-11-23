public class TrabalhadorHora extends Empregado{
    private int horas;
    private double salarioHora;

    public TrabalhadorHora(String primeiroNome, String ultimoNome) {
        super(primeiroNome, ultimoNome);
    }

    @Override
    double calcularGanho() {
        return this.salario = this.salarioHora * this.horas;
    }
    
    public int getHoras() {
        return horas;
    }

    public int setHoras(int horas) {
        return this.horas = horas;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public double setSalarioHora(double salarioHora) {
        return this.salarioHora = salarioHora;
    }
}
