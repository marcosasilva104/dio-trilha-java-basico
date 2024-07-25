import java.util.Scanner;

public class SimulacaoBancaria {
    
        public static void main(String[] args) {

            try (Scanner scanner = new Scanner(System.in)) {
                double saldo = 0;
                boolean continuar = true;
                
                while (continuar) {
                    
                    int opcao = scanner.nextInt();
                    
                    switch (opcao) {
                        case 1 -> {
                            saldo += scanner.nextDouble();
                            System.out.println("Saldo atual: "+saldo);
                        }
                        case 2 -> {
                            double saque = scanner.nextDouble();
                            if(saque >= saldo) {
                                System.out.println("Saldo insuficiente");
                            } else {
                                saldo -= saque;
                                System.out.println("Saldo atual: "+ saldo);
                            }
                        }
                        case 3 -> System.out.println("Saldo atual: "+  saldo);
                        case 0 -> {
                            System.out.println("Programa encerrado.");
                            continuar = false;
                        }
                        default -> System.out.println("Opção inválida. Tente novamente.");
                    }
                }
            }
        }
    }

