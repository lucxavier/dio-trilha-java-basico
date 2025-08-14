import java.util.Scanner;

public class ExemploExcecao {
  public static void main(String[] args) {
        // Cria um array de Strings para armazenar os 10 nomes.
        String[] nomes = new String[10];

        // Inicializa o Scanner para ler a entrada do usuário.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, insira 10 nomes.");

        // Loop para ler os 10 nomes e armazená-los no array.
        for (int i = 0; i < 10; i++) {
            // Solicita ao usuário que digite o nome correspondente.
            // Usamos (i + 1) para mostrar a contagem de 1 a 10.
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }
        
        System.out.println("\n--- Nomes selecionados ---");

        // Imprime o terceiro nome (índice 2).
        System.out.println("O terceiro nome da lista é: " + nomes[2]);

        // Imprime o sétimo nome (índice 6).
        System.out.println("O sétimo nome da lista é: " + nomes[6]);

        // Imprime o nono nome (índice 8).
        System.out.println("O nono nome da lista é: " + nomes[8]);

        // Fecha o scanner para liberar os recursos.
        scanner.close();
    }
}