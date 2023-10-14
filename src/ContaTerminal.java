import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // entradas
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo(a)! Por favor, digite o número da sua agência:");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da sua Conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite seu nome:");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o saldo R$:");
        double saldo = scanner.nextDouble();

        // saida
        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco! \nSua agência é: "
                + agencia + ", conta: " + numeroConta + " e seu saldo de R$ " + saldo
                + " já está disponível para saque.");

        scanner.close();
    }
}
