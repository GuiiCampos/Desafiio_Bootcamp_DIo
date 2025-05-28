import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int param1 = sc.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int param2 = sc.nextInt();
        sc.close();

        try {
            contar(param1, param2);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    static void contar(int primeiro, int segundo) throws ParametrosInvalidosException{
        if (primeiro > segundo) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        
        int contagem = segundo - primeiro;
        for (int i = 1; i <= contagem ; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}