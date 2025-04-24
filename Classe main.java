import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Roupa> estoque = new ArrayList<>();
        String opcao;

        do {
            System.out.println("\n1 - Registrar nova roupa");
            System.out.println("2 - Adicionar peças ao estoque");
            System.out.println("3 - Remover peças do estoque");
            System.out.println("4 - Exibir todas as roupas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextLine();

            switch (opcao) {
                case "1":
                    System.out.print("Marca: ");
                    String marca = sc.nextLine();
                    System.out.print("Tipo: ");
                    String tipo = sc.nextLine();
                    System.out.print("Tamanho: ");
                    String tamanho = sc.nextLine();
                    System.out.print("Quantidade: ");
                    int qtd = Integer.parseInt(sc.nextLine());
                    System.out.print("Valor unitário: ");
                    double valor = Double.parseDouble(sc.nextLine());

                    estoque.add(new Roupa(marca, tipo, tamanho, qtd, valor));
                    break;

                case "2":
                    if (estoque.isEmpty()) {
                        System.out.println("Nenhuma roupa registrada ainda.");
                        break;
                    }
                    System.out.print("Índice da roupa para adicionar estoque: ");
                    int idxAdd = Integer.parseInt(sc.nextLine());
                    System.out.print("Quantidade a adicionar: ");
                    int qtdAdd = Integer.parseInt(sc.nextLine());
                    estoque.get(idxAdd).adicionarEstoque(qtdAdd);
                    estoque.get(idxAdd).exibirInformacoes();
                    break;

                case "3":
                    if (estoque.isEmpty()) {
                        System.out.println("Nenhuma roupa registrada ainda.");
                        break;
                    }
                    System.out.print("Índice da roupa para remover estoque: ");
                    int idxRem = Integer.parseInt(sc.nextLine());
                    System.out.print("Quantidade a remover: ");
                    int qtdRem = Integer.parseInt(sc.nextLine());
                    estoque.get(idxRem).removerEstoque(qtdRem);
                    estoque.get(idxRem).exibirInformacoes();
                    break;

                case "4":
                    if (estoque.isEmpty()) {
                        System.out.println("Nenhuma roupa registrada.");
                    } else {
                        for (int i = 0; i < estoque.size(); i++) {
                            System.out.println("Roupa #" + i);
                            estoque.get(i).exibirInformacoes();
                        }
                    }
                    break;

                case "0":
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (!opcao.equals("0"));

        sc.close();
    }
}