package formas_ps;

public class Retangulo extends Forma {
    private double altura, base;

    public Retangulo (double altura, double base){
        this.altura = altura;
        this.base = base;
    }

    @Override
    double calcularPerimetro() {
        return 2 * (this.altura + this.base);
    }

    @Override
    double calcularArea() {
       return this.base * this.altura;
    }

}
