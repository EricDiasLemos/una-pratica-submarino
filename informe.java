import java.util.Scanner;

public class informe    {
    public static void main(String[] args) {
        System.out.printf("Insira um número inteiro: ");

        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        System.out.printf("O número informado foi %d.%n", numero);
    }
}

