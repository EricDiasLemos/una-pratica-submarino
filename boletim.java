import java.util.Scanner;

public class boletim {
        public static void main(String[] args) {
            System.out.println("--- BOLETIM ESCOLAR ---");
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nota 1: ");
            double nota1 = scanner.nextDouble();

            System.out.print("Nota 2: ");
            double nota2 = scanner.nextDouble();

            System.out.print("Nota 3: ");
            double nota3 = scanner.nextDouble();

            System.out.print("Nota 4: ");
            double nota4 = scanner.nextDouble();
    
            double media = (nota1 + nota2 + nota3 + nota4) / 4;
    
            System.out.printf("A média das notas é: %.2f%n", media);
        }
}
