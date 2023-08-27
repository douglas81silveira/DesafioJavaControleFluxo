import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            int contagem = contar(parametroUm, parametroDois);
            for (int i=1; i <= contagem; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        terminal.close();
    }

    static int contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		int contagem =  parametroDois - parametroUm;

        if (contagem < 1) {
            throw new ParametrosInvalidosException();
        }

        return contagem;
	}
}
