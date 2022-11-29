package sorteio_exception;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        int tentativas = 0, numUsuario = 0, numSorteado;
        boolean acerto = false;
        
        Sorteio s = new Sorteio();
        numSorteado = (int) s.sortear();
        
        do {
            tentativas ++;
            
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Informe o seu palpite: ");
                numUsuario = sc.nextInt();

                if (numUsuario == numSorteado){
                    System.out.println("\nParabéns! Voce acertou em " + tentativas + "tentativas");
                    acerto = true;
                    break;
                }

                s.verifica(numUsuario);

                sc.close();
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        
        } while (acerto == false);
    }
}
