import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int primeiroParametro = sc.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int segundoParametro = sc.nextInt();

        try {
            contar(primeiroParametro, segundoParametro);
        } catch (ParametrosInvalidosException ex) {
            System.out.println(ex.getMessage());
        }
    }
    static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        if (primeiroParametro >= segundoParametro) {
            throw new ParametrosInvalidosException("Parâmetros Inválidos! O segundo Parâmetro precisa ser MAIOR que o primeiro.");
        } else {
            int contagem = segundoParametro - primeiroParametro;
            System.out.println("-------------------------");
            for (int i = 1; i <= contagem; i++) {
                System.out.println("Imprimindo o número: " + i);
            }
        }
    }
}