import java.util.Scanner;

public class SistemaChamados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        String chamado = "";

        while (opcao != 3) {
            System.out.println("=== Sistema de Chamados ===");
            System.out.println("1 - Abrir chamado");
            System.out.println("2 - Listar chamado");
            System.out.println("3 - Sair");
            System.out.println("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o problema: ");
                    chamado = scanner.nextLine();
                    System.out.println("Chamado registrado!");
                    break;

                case 2:
                    if (chamado.isEmpty()) {
                        System.out.println("Nenhum chamado registrado.");
                    } else {
                        System.out.println("Chamado: " + chamado);
                    }
                    break;

                case 3:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

            System.out.println();
        }

        scanner.close();
    }
}