public class Chefe extends Empregado {
    
    public Chefe(String primeiroNome, String ultimoNome) {
        super(primeiroNome, ultimoNome);
    }

    @Override
    public double calcularGanho (){
        return this.salario * 4;
    }

    @Override
    public double getSalario() {
        return super.getSalario();
    }

    @Override
    public double setSalario(double salario) {
        return super.setSalario(salario);
    }
}
