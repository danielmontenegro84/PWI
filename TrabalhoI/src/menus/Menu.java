package menus;

import produtos.*;
import java.util.*;
import javax.swing.JOptionPane;

public class Menu {
    //private Scanner scanner;
    private ArrayList<Produto> carrinho;
    private ArrayList<String> historico;

    public Menu() {
        scanner = new Scanner(System.in);
        carrinho = new ArrayList<>();
        historico = new ArrayList<>();
    }

    // Método para exibir o menu
    public void exibirMenu() {
        ItensMenu opcao = null;

        while (opcao != ItensMenu.SAIR) {
            System.out.println("\n=== MENU PRINCIPAL ===");
            for (ItensMenu item : ItensMenu.values()) {
                System.out.println(item.getCodigo() + ". " + item.getDescricao());
            }
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();
            opcao = getOpcaoPorCodigo(escolha);

            if (opcao != null) {
                switch (opcao) {
                    case CC:
                        cadastrarCarrinho();
                        break;
                    case LISTPRODASC:
                        listarProdutosPorPreco();
                        break;
                    case LISTNOMEPROD:
                        listarProdutosPorNome();
                        break;
                    case REMPROD:
                        removerProduto();
                        break;
                    case HIST:
                        mostrarHistorico();
                        break;
                    case SAIR:
                        System.out.println("Saindo do sistema...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private ItensMenu getOpcaoPorCodigo(int codigo) {
        for (ItensMenu item : ItensMenu.values()) {
            if (item.getCodigo() == codigo) {
                return item;
            }
        }
        return null;
    }

    // 6.1 Cadastrar um carrinho (produtos com dados fixos)
    private void cadastrarCarrinho() {
        Produto p1 = new Produto("Produto 1", 10.0);
        Produto p2 = new Produto("Produto 2", 5.0);
        Produto p3 = new Produto("Produto 3", 15.0);

        carrinho.add(p1);
        carrinho.add(p2);
        carrinho.add(p3);

        historico.add("Carrinho cadastrado com 3 produtos.");
        System.out.println("Carrinho cadastrado com sucesso.");
    }

    // 6.2 Listar os produtos do carrinho do menor para o maior preço
    private void listarProdutosPorPreco() {
        Collections.sort(carrinho, Comparator.comparingDouble(Produto::getPreco));
        System.out.println("\nProdutos do carrinho (ordenados por preço):");
        for (Produto p : carrinho) {
            System.out.println(p);
        }
        historico.add("Produtos listados por preço.");
    }

    // 6.3 Listar os produtos do carrinho pelo nome do produto
    private void listarProdutosPorNome() {
        Collections.sort(carrinho, Comparator.comparing(Produto::getNome));
        System.out.println("\nProdutos do carrinho (ordenados por nome):");
        for (Produto p : carrinho) {
            System.out.println(p);
        }
        historico.add("Produtos listados por nome.");
    }

    // 6.4 Remover um produto do carrinho
    private void removerProduto() {
        System.out.print("Digite o nome do produto a ser removido: ");
        scanner.nextLine();  // Limpar o buffer
        String nome = scanner.nextLine();
        boolean encontrado = false;

        for (Produto p : carrinho) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                carrinho.remove(p);
                historico.add("Produto removido: " + nome);
                System.out.println("Produto removido com sucesso.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Produto não encontrado.");
        }
    }

    // 6.5 Mostrar Histórico
    private void mostrarHistorico() {
        System.out.println("\n=== Histórico de Ações ===");
        for (String acao : historico) {
            System.out.println(acao);
        }
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.exibirMenu();
    }
}
