import java.util.Scanner;

public class calculadora {
     public static void main(String[] args) {
        
        
        Scanner leitor1 = new Scanner(System.in);
        System.out.print("Número 1: ");
        int num1 = leitor1.nextInt();

        Scanner leitor2 = new Scanner(System.in);
        System.out.print("Número 2: ");
        int num2 = leitor2.nextInt();
       

        System.out.println("");
        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
    }   
}
