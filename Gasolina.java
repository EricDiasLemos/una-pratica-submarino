import java.util.Scanner;

public class Gasolina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o preço do litro da gasolina: ");
        double precoLitro = scanner.nextDouble();

        System.out.print("Digite a quantidade de litros vendidos: ");
        double litros = scanner.nextDouble();

        // Cálculo
        double total = precoLitro * litros;

        // Saída
        System.out.println("O valor a ser pago é: R$ " + total);

        scanner.close();
    }
}