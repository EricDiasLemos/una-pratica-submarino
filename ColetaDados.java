import java.util.Scanner;

public class ColetaDados {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("--- SISTEMA DE SELEÇÃO INTERESTELAR ---");
        System.out.println("Por favor, insira os dados do candidato.");

        System.out.print("Nome completo do aspirante: ");
        String nome = leitor.nextLine();

        System.out.print("Idade terrestre: ");
        int idade = leitor.nextInt();

        System.out.print("Altura (em metros): ");
        double altura = leitor.nextDouble();

        System.out.print("Possui experiência ecom pilotagem de drones? (true/false): ");
        boolean temExperiencia = leitor.nextBoolean();

        System.out.println("\n--- PROCESSSANDO DADOS DA FICHA ---");
        System.out.printf("Canditato: %s %n", nome);
        System.out.printf("Idade:%d anos | altura: %.2f m %n", idade,altura);
        System.out.println("Qualificado para pilotagem? " + (temExperiencia ? "Sim" : "Não"));

        if (idade >= 18 && idade <= 45) {
            System.out.println("Staus: Apto para os testes físicos.");
        } else {
            System.out.println("Status: Idade fora dos parâmetros da missão.");
        }

        leitor.close();
        System.out.println("------------------------------------------------");
    }
}