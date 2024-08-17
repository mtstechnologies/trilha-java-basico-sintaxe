import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //solicitado os dados do usuario
        System.out.println("Informe o numero da sua conta: ");
        Integer numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Informe sua agencia: ");
        String agencia = scanner.nextLine();

        System.out.println("Informe seu nome: ");
        String nome = scanner.nextLine();

        
        double saldo = 1500.00;        


        //exibindo confirmacao de criacao de conta
        System.out.print("\n\nOlá: " + nome + ", obrigado por criar uma conta em nosso banco, \nsua agencia é " + agencia + ", \nconta é " + numero + " \ne seu saldo R$ " + saldo + " já esta disponivel para saque\n\n"); 
        //System.out.printf("Olá, %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.%n", nome, agencia, numero, saldo);
        scanner.close();
    }
}
