import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomeCliente = teclado.nextLine();

        System.out.println("Digite o numero da agencia: ");
        String agencia = teclado.next();

        System.out.println("Digite o numero da conta: ");
        int numero = teclado.nextInt();

        System.out.println("Digite o seu saldo: ");
        double saldo = teclado.nextDouble();

        System.out.println("Ola ".concat(nomeCliente) + 
            (" obrigado por criar uma conta em nosso banco, sua agencia e ".concat(agencia)) + 
            ", conta " + numero + " e seu saldo " + saldo + (" ja esta disponivel para saque."));
    }    
}
