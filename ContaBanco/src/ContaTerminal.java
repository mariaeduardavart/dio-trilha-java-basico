import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
       Scanner scanner = new Scanner(System.in);

       
       System.out.print("Digite seu nome: ");
       String nomeCliente = scanner.nextLine();

       System.out.print("Digite sua agência: ");
       String agencia = scanner.nextLine();

       System.out.print("Digite o número da sua conta: ");
       int numero = scanner.nextInt();

      
       scanner.nextLine();

       System.out.print("Digite seu saldo: ");
       String saldoStr = scanner.next();

       BigDecimal saldo = new BigDecimal(saldoStr);

       System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

       scanner.close();
    }
}

