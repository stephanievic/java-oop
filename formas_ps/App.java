package formas_ps;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double lado1, lado2, base, altura, raio;
        int forma, op;

        Scanner sc = new Scanner (System.in);

        do {
            System.out.println("Informe a forma geométrica, dentre as opções abaixo: ");
            System.out.println("\n [1] - Retãngulo");
            System.out.println("\n [2] - Círculo");
            System.out.println("\n [3] - Triângulo");
            forma = sc.nextInt();

            switch (forma) {
                case 1:
                    System.out.print("Informe a altura do retângulo: ");
                    altura = sc.nextDouble();
                    
                    System.out.print("Informe a base do retângulo: ");
                    base = sc.nextDouble();

                    Retangulo r = new Retangulo(altura, base);

                    System.out.println("\nPerímetro: " + r.calcularPerimetro());

                    System.out.println("Área: " + r.calcularArea());

                break;
                
                case 2: 
                    System.out.print("Informe o raio do circulo: ");
                    raio = sc.nextDouble();

                    Circulo c = new Circulo(raio);

                    System.out.println("\nPerimetro: " + c.calcularPerimetro());
                    System.out.println("Area: " + c.calcularArea());
                break;

                case 3:
                    System.out.print("Informe om lado 1 do triangulo: ");
                    lado1 = sc.nextDouble();

                    System.out.println("Informe o lado 2 do triangulo: ");
                    lado2 = sc.nextDouble();

                    System.out.println("Informe a base: ");
                    base = sc.nextDouble();

                    System.out.println("Informe a altura: ");
                    altura = sc.nextDouble();

                    Triangulo t = new Triangulo(altura, lado1, lado2, base);

                    System.out.println("\nPerimetro: " + t.calcularPerimetro());
                    System.out.println("Area: " + t.calcularArea());
                break;
            }

            System.out.println("Deseja informar mais alguma forma? [1] para SIM | [0] para NÃO");
            op = sc.nextInt();

        } while (op == 1);
        
        sc.close();
    }
}
