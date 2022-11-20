package notas;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int qntd;

        Scanner sc = new Scanner (System.in);

        System.out.print("Quantos alunos você quer informar?");
        qntd = sc.nextInt();

        Aluno A [] = new Aluno [qntd];

       for (int i = 0; i < qntd; i++){
        A [i] = new Aluno();

        System.out.print("\nInforme o nome do aluno: ");
        A[i].setNome (sc.next());

        System.out.print("\nInforme o número de matricula do aluno: ");
        A[i].setMatricula (sc.nextInt());

        System.out.print("Informe a nota da primeira prova: ");
        A[i].setProva1(sc.nextDouble());

        System.out.print("Informe a nota da segunda prova: ");
        A[i].setProva2(sc.nextDouble());

        System.out.print("Informe a nota do trabalho: ");
        A[i].setTrabalho(sc.nextDouble());


        System.out.println("A média desse aluno é: " + A[i].media (A[i].getProva1(), A[i].getProva2(), A[i].getTrabalho()));

        A[i].finalMedia();
       }

       sc.close();
    }
}
