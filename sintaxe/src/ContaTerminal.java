import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente();
        Conta conta = new Conta();
        conta.setCliente(cliente);

        System.out.println("Seja bem vindo(a) ao processo de criação de Conta! \n" +
                "Preencha os dados conformem forem aparecendo no questionário. \n");

        System.out.println("Por favor, digite seu nome:");
        cliente.setNome(sc.nextLine());

        System.out.println("Agora, digite o número da conta:");
        conta.setNumero(sc.nextInt());

        System.out.println("E por fim, digite o número da agência:");
        conta.setAgencia(sc.next());

        conta.setSaldo(50);

        System.out.println("-----------------------------------------");
        System.out.println("Olá, "+ conta.getCliente().getNome() +"! Obrigado por criar uma conta em nosso banco. \n" +
                        "Sua agência é: " + conta.getAgencia() + "\n" +
                        "Seu número de conta é: " + conta.getNumero() + "\n" +
                        "O saldo inicial de R$" + conta.getSaldo() + " já está disponível para saque.");
    }
}