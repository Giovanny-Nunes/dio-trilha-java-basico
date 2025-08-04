import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = sc.nextLine();

        System.out.println("Informe o seu Número de Conta: ");
        String numero = sc.nextLine();

        System.out.println("Informe o seu Saldo atual: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");



    }
}
