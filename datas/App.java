import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int op, dia, mes, ano;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Informe a opção desejada: ");
        System.out.println("\n[1] - Inserir data manualmente e exibir a data informada e o dia seguinte.");
        System.out.println("\n[2] - Exibir data atual e o dia seguinte.");
        System.out.print("\nR: ");
        op = sc.nextInt();
    
        if (op == 1){
          System.out.print("\n- Informe o dia: ");
          dia = sc.nextInt();
         
          System.out.print("- Informe o mês: ");
          mes = sc.nextInt();
    
          System.out.print("- Informe o ano: ");
          ano = sc.nextInt();
    
          Datas data1 = new Datas(dia, mes, ano);
    
          if (data1.getDataInvalida() == false) {
            System.out.println("\n-> Data informada: " + data1.toString());
            data1.modificaData();
            System.out.println("-> Dia seguinte: " + data1.toString());
          }
          
          else System.out.println("Data inválida.");
        }
        
        else {
          Datas data2 = new Datas();
    
          System.out.println("\n-> Data atual: " + data2.toString());
          data2.modificaData();
          System.out.println("-> Dia seguinte: " + data2.toString());
        }
          
        sc.close();
    }
        
}
