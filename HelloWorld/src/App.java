import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args){        
        Scanner scanner = new Scanner(System.in);

        while (true) {
            
                System.out.println("Menu:");
            System.out.println("1 - Par ou Impar");
            System.out.println("2 - Maior ou Menor");
            System.out.println("3 - Calculadora");
            System.out.println("4 - Nota");
            System.out.println("5 - Maior e Menor");
            System.out.println("6 - Caixa");
            System.out.println("7 - Desconto");
            System.out.println("8 - Positivos, Negativos e Zeros");
            System.out.println("9 - Repetição");
            System.out.println("10 - Contagem");
            System.out.println("");
            System.out.println("0 - Sair");
            System.out.println("");
            System.out.print("Escolha uma opção: ");

        int opcao = scanner.nextInt();
    

        switch (opcao) {
            case 1:
                ParImpar();
                break;
            case 2:
                MaiorMenor();
                break;
            case 3:
                Calculadora();
                break;
            case 4:
                Nota();
                break;
            case 5:
                Maiormenor();
                break;
            case 6:
                Caixa();
                break;
            case 7:
                Desconto();
                break;
            case 8:
                Positivos();
                break;
            case 9:
                Repeticao();
                break;
            case 10:
                Contagem();
                break;    
            case 0:
                System.out.println("Encerrando o programa...");
                return;
            default:
                System.out.println("Numero Invalido");
                continue;   
            }
        }         
     }
            


    public static void ParImpar() {
        System.out.print("Insira um Numero:");
        
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        
        int resultado = numero%2;

        if ( resultado == 0){
            System.out.println("O numero " + numero + " é par");
        } else {
            System.out.println("O numero " + numero + " é impar");
        }

        

    }

    public static void MaiorMenor() {
        System.err.print("Insira dois Numeros: ");

        Scanner scanner = new Scanner(System.in);
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        
        if (numero1 > numero2){
            System.out.println("O numero " + numero1 + " é maior que o numero " + numero2);
        } else if (numero1 < numero2) {
            System.out.println("O numero " + numero1 + " é menor que o numero " + numero2);
        } else {
            System.out.println("O numero " + numero1 + " é igual ao numero " + numero2);
        }
        
    }

    public static void Calculadora() {
      while (true) {
        System.out.println("Calculadora");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        
        if (opcao == 0) {
            System.out.println("Encerrando a calculadora...");
            return;
            
        } else if (opcao == 1) {
            System.out.println("Soma");
            System.out.print("Informe os 2 numeros para a soma: ");
            int numero1 = scanner.nextInt();
            int numero2 = scanner.nextInt();
            System.out.print("O resultado da soma é: " + (numero1 + numero2));

        } else if (opcao == 2) {
            System.out.println("Subtração");
            System.out.print("Informe os 2 numeros para a subtração: ");
            int numero1 = scanner.nextInt();
            int numero2 = scanner.nextInt();
            System.out.print("O resultado da subtração é: " + (numero1 - numero2));

        } else if (opcao == 3) {
            System.out.println("Multiplicação");
            System.out.print("Informe os 2 numeros para a multiplicação: ");
            int numero1 = scanner.nextInt();
            int numero2 = scanner.nextInt();
            System.out.println("O resultado da multiplicação é: " + (numero1 * numero2));


        } else if (opcao == 4) {
            System.out.println("Divisão");
            System.out.print("Informe os 2 numeros para a divisão: ");
            int numero1 = scanner.nextInt();
            int numero2 = scanner.nextInt();
            System.out.println("O resultado da divisão é: " + (numero1 / numero2));


        } else {
            System.out.println("Opção inválida. Encerrando a calculadora...");
            return;
        }
      }  

        
        
        
    }
    public static void Nota() {
        
        while (true) {
            
            System.out.print("Insira a nota de 0 a 100: ");

            Scanner scanner = new Scanner(System.in);
            int nota = scanner.nextInt();

            if (nota >= 90 && nota <= 100) {
                System.out.println("Você tirou um A");
                break;
            } else if (nota >= 80 && nota < 90) {
                System.out.println("Você tirou um B");
                break;
            } else if (nota >= 70 && nota < 80) {
                System.out.println("Você tirou um C");
                break;
            } else if (nota >= 60 && nota < 70) {
                System.out.println("Você tirou um D");
                break;
            } else if (nota >= 0 && nota < 60) {
                System.out.println("Você tirou um F");
                break;
            } else {
                System.out.println("Nota inválida. Insira um valor entre 0 e 100.");
        }
     }
    }
    public static void Maiormenor() {
        int numeroMaior = 0;
        int numeroMenor = 0;
        while (true) {

            System.out.print("Insira um numero diferente de 0: ");
            Scanner scanner = new Scanner(System.in);
            int numero = scanner.nextInt();


            if (numero == 0) {
                System.out.println("O maior numero inserido foi: " + numeroMaior);
                System.out.println("O menor numero inserido foi: " + numeroMenor);
                break;
            }
            else if (numero > numeroMaior) {
                numeroMaior = numero;
            }
            else if (numero < numeroMenor) {
                numeroMenor = numero;
            }
            if (numero == 0) {
                System.out.println("O maior numero inserido foi: " + numeroMaior);
                System.out.println("O menor numero inserido foi: " + numeroMenor);
                break;
            }
        }
    }

    public static void Caixa() {
        
        int saldo = 1000;
        while (true) {
            
            System.out.println("MENU:");
            System.out.println("1. Sacar");
            System.out.println("2. Ver Saldo");
            System.out.println("3. Depositar");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            Scanner scanner = new Scanner(System.in);
            int opcao = scanner.nextInt();

                if (opcao == 1) {
                    System.out.print("Informe o valor para sacar: ");
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque > saldo) {
                        System.out.println("Saldo insuficiente para realizar o saque.");
                    } else {
                        saldo -= valorSaque;
                    }
                    System.out.println("Saque realizado com sucesso!");
                } else if (opcao == 2) {
                    
                    System.out.println("Seu saldo é: "+ saldo);
                } else if (opcao == 3) {
                    System.out.print("Informe o valor para depositar: ");
                    double valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito;
                    System.out.println("Depósito realizado com sucesso!");
                } else if (opcao == 4) {

                    System.out.println("Encerrando o programa...");
                    break;
                } else {
                    System.out.println("Opção inválida. Tente novamente.");
                }
        }
    }

    public static void Desconto() {

        while (true) {
            
            System.out.println("Qual produto deseja comprar:");
            System.out.println("1 - Mercedes-Benz - Preço: R$ 500.000,00");
            System.out.println("2 - BMW - Preço: R$ 300.000,00");
            System.out.println("3 - Audi - Preço: R$ 400.000,00");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            Scanner scanner = new Scanner(System.in);
            int opcao = scanner.nextInt();
            
            
            if (opcao == 0) {
                System.out.println("Encerrando o programa...");
                break;
            } else if (opcao < 1 || opcao > 3) {
                System.out.println("Opção de produto inválida. Tente novamente.");
                continue;
            } 


            System.out.println("Informe onde você mora:");
            System.out.println("1 - São Paulo"); // 5% de desconto
            System.out.println("2 - Rio de Janeiro"); // 10% de desconto
            System.out.println("3 - Belo Horizonte"); // 15% de desconto
            System.out.print("Escolha uma opção: ");
            Scanner scanner2 = new Scanner(System.in);
            int localizacao = scanner2.nextInt();
            

            if (opcao == 0) {
                System.out.println("Encerrando o programa...");
                break;
            } else if (localizacao < 1 || localizacao > 3) {
                System.out.println("Localização inválida. Tente novamente.");
                continue;
            }


            if (opcao == 1) {
                if (localizacao == 1) {
                    System.out.println("O preço do Mercedes-Benz com desconto é: R$ " + (500000 * 0.95));
                } else if (localizacao == 2) {
                    System.out.println("O preço do Mercedes-Benz com desconto é: R$ " + (500000 * 0.90));
                } else if (localizacao == 3) {
                    System.out.println("O preço do Mercedes-Benz com desconto é: R$ " + (500000 * 0.85));
                } else {
                    System.out.println("Localização inválida.");
                }
            } else if (opcao == 2) {
                if (localizacao == 1) {
                    System.out.println("O preço da BMW com desconto é: R$ " + (300000 * 0.95));
                } else if (localizacao == 2) {
                    System.out.println("O preço da BMW com desconto é: R$ " + (300000 * 0.90));
                } else if (localizacao == 3) {
                    System.out.println("O preço da BMW com desconto é: R$ " + (300000 * 0.85));
                } else {
                    System.out.println("Localização inválida.");
                }
            } else if (opcao == 3) {
                if (localizacao == 1) {
                    System.out.println("O preço da Audi com desconto é: R$ " + (400000 * 0.95));
                } else if (localizacao == 2) {
                    System.out.println("O preço da Audi com desconto é: R$ " + (400000 * 0.90));
                } else if (localizacao == 3) {
                    System.out.println("O preço da Audi com desconto é: R$ " + (400000 * 0.85));
                } else {
                    System.out.println("Localização inválida.");
                }
            } else {
                System.out.println("Opção de produto inválida.");
            }
        }
    }

    public static void Positivos() {
        int loop = 0;
        System.out.println("Informe 10 nuemros para a contagem:");
        List<Integer> positivos = new ArrayList<>();
        List<Integer> negativos = new ArrayList<>();
        List<Integer> zeros = new ArrayList<>();

        while (loop < 10 == true) {
           
            System.out.println("insira o numero " + (loop + 1) + ":");
            Scanner scanner = new Scanner(System.in);
            int numero = scanner.nextInt();
            loop++;
            //quero adicionar uma lista de numeros positivos, negativos e zeros, e depois imprimir a lsita de cada um, e a quantidade de cada um

            if (numero > 0) {
                positivos.add(numero);
            }
            if (numero < 0) {
                negativos.add(numero);
            }
            if (numero == 0) {
                zeros.add(numero);
            }
        } 

        System.out.println("Numeros Positivos:"+ positivos);
        System.out.println("Numeros Negativos:"+ negativos);
        System.out.println("Numeros Zeros:"+ zeros);




    }

    public static void Repeticao() {
         
        while (true) {
            System.out.println("Informe um numero para a contagem: ");
            System.out.print("Digite 0 para sair: ");
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            int contador = 1;
            System.out.println("");

            if (N == 0) {
                break;
            }

            while (contador <= N) {
                    
                    System.out.println(contador);
                    contador++;

            }
        }
    }

    public static void Contagem() {
        while (true) {
            
            System.out.println("Escolha 0 para sair");
            System.out.println("Informe um numero para a contagem: ");

            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            int sub = N;
            int soma = 0;
            
            
                while (sub >= 1) {

                        soma += sub;
                        sub--;
                        System.out.print(sub + " ");
                }
                System.out.println("");
                System.out.println("A soma dos numeros de 0 a " + N + " é: " + soma);
                if (N == 0) {
                System.out.println("Encerrando o programa...");
                return;
            } 
       
        }
    }
}
