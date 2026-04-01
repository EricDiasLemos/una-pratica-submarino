import java.util.Scanner;

public class Eurotrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada
        System.out.print("Digite o valor total da viagem: € ");
        double valorTotal = scanner.nextDouble();

        // Cálculo (dividindo igualmente entre os 3 destinos)
        double valorPorPais = valorTotal / 3;

        // Saída
        System.out.println("\nDistribuição dos custos:");
        System.out.println("Alemanha: € " + valorPorPais);
        System.out.println("Portugal: € " + valorPorPais);
        System.out.println("Itália: € " + valorPorPais);

        scanner.close();
    }
}