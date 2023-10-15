import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);    

      int numeroConta  = 1021;
      String agencia = "067-8";
      String nomeCliente = "Mario Andrade";
      double saldo = 237.48;
      

      System.out.println("Olá, bom dia! Insira o nome do cliente: ");    
      nomeCliente = sc.nextLine();
      System.out.println("Por favor, digite o número da conta: ");
      numeroConta = sc.nextInt(); 
      System.out.println("Por favor, digite o número da agência: ");
      agencia = sc.next();

      System.out.println("Olá, " + nomeCliente + " obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta de número " + numeroConta + " e o seu saldo " + saldo + " já está disponível para saque!");
    
    sc.close();
    }
}
