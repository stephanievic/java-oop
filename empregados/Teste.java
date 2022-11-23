import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        String nome [] = new String [2]; 
        int tipoFuncionario, op;
        double salario;

        Scanner sc= new Scanner (System.in);
        
        do {
            System.out.print("Informe o primeiro nome do funcionário: ");
            nome [0] = sc.next();

            System.out.println("Informe o último nome: ");
            nome [1] = sc.next();

            System.out.print("Informe o tipo de funcionário: ");
            System.out.println("[1] - Chefe");
            System.out.println("[2] - Trabalhador Comissionado");
            System.out.println("[3] - Trabalhador peça produzida");
            System.out.println("[4] - Trabalhador hora");
            tipoFuncionario = sc.nextInt();

            switch (tipoFuncionario) {
                case 1:
                    Chefe c = new Chefe (nome[0], nome [1]);

                    System.out.print("Informe o salário:");
                    salario = c.setSalario(sc.nextDouble());

                    System.out.println("O salário mensal desse funcionário é: " + c.calcularGanho());

                break;

                case 2:
                    TrabalhadorComissionado tc = new TrabalhadorComissionado(nome [0], nome [1]);
                    double comissao;
                    int quantidade;

                    System.out.print("Informe o salário: ");
                    salario = tc.setSalario(sc.nextDouble());

                    System.out.print("Informe o valor da comissão: ");
                    comissao = tc.setComissao(sc.nextDouble());

                    System.out.print("Informe a quantidade: ");
                    quantidade = tc.setQuantidade(sc.nextInt());

                    System.out.println("O salário desse funcionário é: " + tc.calcularGanho());
                
                break;

                case 3:
                    TrabalhadorPecaProduzida pp = new TrabalhadorPecaProduzida (nome [0], nome [1]);
                    double remuneracao;
                    int qntd;

                    System.out.print("Informe a remuneração: ");
                    remuneracao = pp.setRecomuneracao(sc.nextDouble());

                    System.out.print("Informe a quantidade de peças produzidas: ");
                    qntd = pp.setQuantidade(sc.nextInt());

                    System.out.println("O salário desse funcionário é: " + pp.calcularGanho());
                break;

                case 4:
                    TrabalhadorHora th = new TrabalhadorHora (nome [0], nome [1]);

                    int horas;
                    double salarioHora;

                    System.out.print("Informe as horas trabalhadas: ");
                    horas = th.setHoras(sc.nextInt());

                    System.out.print("Informe o salário por hora trabalhada: ");
                    salarioHora = th.setSalarioHora(sc.nextDouble());

                    System.out.println("O salário desse funcionário é: " + th.calcularGanho());
                break;
            }

            System.out.println("Deseja informar outro funcionário? [0] para NÃO | [1] para SIM");
            op = sc.nextInt();
        }
        while (op == 1);

        sc.close();
        
    }
}
