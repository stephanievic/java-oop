package formas_ps;

public class Triangulo extends Forma {
    private double altura, lado1, lado2, base;

    public Triangulo (double altura, double lado1, double lado2, double base){
        this.altura = altura;
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    double calcularPerimetro() {
        return this.lado1 + this.lado2 + this.base;
    }

    @Override
    double calcularArea() {
        return (this.base * this.altura) / 2;
    }
    
}
