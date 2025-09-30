package projeto_final_bloco_01;

import java.util.InputMismatchException;
import java.util.Scanner;

import projeto_final_bloco_01.controller.ProdutoController;
import projeto_final_bloco_01.model.Carne;
import projeto_final_bloco_01.model.Frango;
import projeto_final_bloco_01.model.Produto;
import projeto_final_bloco_01.model.Suino;
import projeto_final_bloco_01.model.Tempero;
import projeto_final_bloco_01.util.Cores;

public class Menu {
	
	private static final Scanner leia = new Scanner(System.in);
	
	// Controller
	private static final ProdutoController produtoController = new ProdutoController();
	
	public static void main(String[] args) {

		int opcao;
		
		// cria alguns registros iniciais
		criarProdutosTeste();

        // Laço de repetição que mantém o menu rodando até a opção sair ser acionada
	while (true) {

		System.out.println(Cores.TEXT_RED_BOLD + Cores.ANSI_YELLOW_BACKGROUND
		        + "╔══════════════ 🥩🍗🐖🧂  BOMSABOR  🧂🐖🍗🥩 ══════════════╗" + Cores.TEXT_RESET);
		System.out.println(Cores.TEXT_RED_BOLD + Cores.ANSI_YELLOW_BACKGROUND
		        + "  [1] ✳️  Criar Produto                                      " + Cores.TEXT_RESET);
		System.out.println(Cores.TEXT_RED_BOLD + Cores.ANSI_YELLOW_BACKGROUND
		        + "  [2] 📋  Listar Todos os Produtos                           " + Cores.TEXT_RESET);
		System.out.println(Cores.TEXT_RED_BOLD + Cores.ANSI_YELLOW_BACKGROUND
		        + "  [3] 🔎  Buscar Produto por Id                              " + Cores.TEXT_RESET);
		System.out.println(Cores.TEXT_RED_BOLD + Cores.ANSI_YELLOW_BACKGROUND
		        + "  [4] 🔄  Atualizar Dados do Produto                         " + Cores.TEXT_RESET);
		System.out.println(Cores.TEXT_RED_BOLD + Cores.ANSI_YELLOW_BACKGROUND
		        + "  [5] 🗑️  Apagar Produto                                     " + Cores.TEXT_RESET);
		System.out.println(Cores.TEXT_RED_BOLD + Cores.ANSI_YELLOW_BACKGROUND
		        + "  [0] 🚪  Sair                                               " + Cores.TEXT_YELLOW_BOLD);
		System.out.println(Cores.TEXT_RED_BOLD + Cores.ANSI_YELLOW_BACKGROUND
		        + "╚═══════════════════════════════════════════════════════════╝" + Cores.TEXT_RESET);
		
		// Entrada do usuário
		System.out.print(Cores.TEXT_YELLOW_BRIGHT + "\n👉 Entre com a opção desejada: " + Cores.TEXT_RESET);
		
		// Tratamento de exceção para evitar erro quando o usuário digita algo que não é número
		try {
			opcao = leia.nextInt();
			leia.nextLine();
		} catch (InputMismatchException e) {
			opcao = -1;
			System.out.println("\nDigite um número inteiro entre 0 e 5");
			leia.nextLine();
		}
		// Condição de parada do loop (encerra aplicação)

		if (opcao == 0) { // Caso o usuário escolha 0, o programa mostra mensagem de despedida, 
			System.out.println(Cores.TEXT_YELLOW_BOLD + "\n👋 BomSabor - Do açougue direto pra sua mesa");
			sobre();// chama o método 'sobre()' e encerra a aplicação
			leia.close();
			System.exit(0);
		}

		// Controle de fluxo do menu
		// Verifica qual opção do menu o usuário escolheu e executa a ação
		switch (opcao) {
		case 1:
			System.out.println(Cores.TEXT_WHITE + "✳️ Criar Produto\n\n");
			cadastrarProduto();
			keyPress();
			break;
		case 2:
			System.out.println(Cores.TEXT_WHITE + "📋 Listar Todos os Produtos\n\n");
			listarProdutos();
			keyPress();
			break;
		case 3:
			System.out.println(Cores.TEXT_WHITE + "🔎  Consultar Dados do Produto - por Id\n\n");
			procurarProdutoPorId();
			keyPress();
			break;
		case 4:
			System.out.println(Cores.TEXT_WHITE + "🔄  Atualizar Dados do Produto\n\n");
			atualizarProduto();
			keyPress();
			break;
		case 5:
			System.out.println(Cores.TEXT_WHITE + "🗑️ Apagar Produto\n\n");
			deletarProduto();
			keyPress();
			break;
		default:
			System.out.println(Cores.TEXT_RED_BOLD + "\n❌ Opção Inválida!\n" + Cores.TEXT_RESET);
			keyPress();
			break;
		}
	}
}
	
	// Método utilitário: sobre()
	// Exibe informações do projeto/desenvolvedor
	public static void sobre() {
		System.out.println(
				Cores.TEXT_YELLOW_BOLD + "\n═══════════════════════════════════════════════════════════" + Cores.TEXT_RESET);
		System.out.println(Cores.TEXT_YELLOW_BOLD + "👩‍💻 Projeto Desenvolvido por: Jessica Ghirardelli Tinguely " + Cores.TEXT_RESET);
		System.out.println(Cores.TEXT_YELLOW_BOLD + "✉️ jessicatinguely@icloud.com" + Cores.TEXT_RESET);
		System.out.println(
				Cores.TEXT_YELLOW_BOLD + "🌐 https://github.com/jessicatinguely/projeto_final_bloco_01" + Cores.TEXT_RESET);
		System.out.println(
				Cores.TEXT_YELLOW_BOLD + "═══════════════════════════════════════════════════════════" + Cores.TEXT_RESET);
	}

	public static void keyPress() {
		System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para continuar...");
		leia.nextLine();

	}
	
	 // ================== CRUD (métodos chamados pelo menu) ==================

    // [1] Criar
    private static void cadastrarProduto() {

        System.out.print("Digite o nome do Produto: ");
        String nome = leia.nextLine();

        System.out.print("Digite a categoria (1=Carne | 2=Frango | 3=Suíno | 4=Tempero): ");
        int categoria = leia.nextInt();

        System.out.print("Digite o preço (R$): ");
        float preco = leia.nextFloat();

        System.out.print("Digite o peso em gramas: ");
        float peso = leia.nextFloat();
        leia.nextLine(); // consome quebra de linha antes de ler Strings específicas

        switch (categoria) {
            case 1 -> {
                System.out.print("Digite o corte (ex.: Bife, Pedaço): ");
                String corte = leia.nextLine();
                produtoController.cadastrar(new Carne(produtoController.gerarId(), nome, preco, peso, corte));
            }
            case 2 -> {
                System.out.print("Digite o tipo (ex.: Coxa e Sobrecoxa, Peito): ");
                String tipo = leia.nextLine();
                produtoController.cadastrar(new Frango(produtoController.gerarId(), nome, preco, peso, tipo));
            }
            case 3 -> {
                System.out.print("Digite a parte do suíno (ex.: Costelinha, Lombo): ");
                String parte = leia.nextLine();
                produtoController.cadastrar(new Suino(produtoController.gerarId(), nome, preco, peso, parte));
            }
            case 4 -> {
                System.out.print("Digite o tipo de tempero (ex.: Sal Grosso): ");
                String tipo = leia.nextLine();
                produtoController.cadastrar(new Tempero(produtoController.gerarId(), nome, preco, peso, tipo));
            }
            default -> System.out.println(Cores.TEXT_RED + "Categoria inválida!" + Cores.TEXT_RESET);
        }
    }

    // [2] Listar
    private static void listarProdutos() {
        produtoController.listarTodos();
    }

    // [3] Buscar por ID
    private static void procurarProdutoPorId() {
        System.out.print("Digite o ID do Produto: ");
        int id = leia.nextInt();
        leia.nextLine();
        produtoController.procurarPorId(id);
    }

    // [4] Atualizar
    private static void atualizarProduto() {
        System.out.print("Digite o ID do Produto: ");
        int id = leia.nextInt();
        leia.nextLine();

        // Busca o produto atual
        Produto produto = produtoController.buscarNaCollection(id);

        if (produto != null) {
            // Dados atuais
            String nome = produto.getNome();
            int categoria = produto.getCategoria();
            float preco = produto.getPreco();
            float peso = produto.getPeso();

            // Nome
            System.out.printf("Nome atual: %s\nDigite o novo nome (ENTER para manter): ", nome);
            String entrada = leia.nextLine();
            nome = entrada.isEmpty() ? nome : entrada;

            // Preço
            System.out.printf("Preço atual: %.2f\nDigite o novo preço (ENTER para manter): ", preco);
            entrada = leia.nextLine();
            preco = entrada.isEmpty() ? preco : Float.parseFloat(entrada.replace(",", "."));

            // Peso
            System.out.printf("Peso atual (g): %.0f\nDigite o novo peso em g (ENTER para manter): ", peso);
            entrada = leia.nextLine();
            peso = entrada.isEmpty() ? peso : Float.parseFloat(entrada.replace(",", "."));

            // Atualiza conforme a categoria do produto
            switch (categoria) {
                case 1 -> { // Carne
                    String corte = ((Carne) produto).getCorte();
                    System.out.printf("Corte atual: %s\nDigite o novo corte (ENTER para manter): ", corte);
                    entrada = leia.nextLine();
                    corte = entrada.isEmpty() ? corte : entrada;
                    
                    var atualizado = new Carne(id, nome, preco, peso, corte);

                    produtoController.atualizar(atualizado);
                    
                    atualizado.visualizar();
                  
                }
                case 2 -> { // Frango
                    String tipo = ((Frango) produto).getTipo();
                    System.out.printf("Tipo atual: %s\nDigite o novo tipo (ENTER para manter): ", tipo);
                    entrada = leia.nextLine();
                    tipo = entrada.isEmpty() ? tipo : entrada;

                    var atualizado = new Frango(id, nome, preco, peso, tipo);

                    produtoController.atualizar(atualizado);
                    
                    atualizado.visualizar();
                }
                case 3 -> { // Suíno
                    String parte = ((Suino) produto).getParte();
                    System.out.printf("Parte atual: %s\nDigite a nova parte (ENTER para manter): ", parte);
                    entrada = leia.nextLine();
                    parte = entrada.isEmpty() ? parte : entrada;

                    var atualizado = new Suino(id, nome, preco, peso, parte);

                    produtoController.atualizar(atualizado);
                    
                    atualizado.visualizar();
                }
                case 4 -> { // Tempero
                    String tipo = ((Tempero) produto).getTipo();
                    System.out.printf("Tipo atual: %s\nDigite o novo tipo (ENTER para manter): ", tipo);
                    entrada = leia.nextLine();
                    tipo = entrada.isEmpty() ? tipo : entrada;
                    
                    var atualizado = new Tempero(id, nome, preco, peso, tipo);

                    produtoController.atualizar(atualizado);
                    
                    atualizado.visualizar();
                }
                default -> System.out.println(Cores.TEXT_RED + "Categoria inválida!" + Cores.TEXT_RESET);
            }

        } else {
            System.out.printf("\nO produto ID %d não foi encontrado!\n", id);
        }
    }

    // [5] Deletar
    private static void deletarProduto() {
        System.out.print("Digite o ID do Produto: ");
        int id = leia.nextInt();
        leia.nextLine();

        Produto produto = produtoController.buscarNaCollection(id);

        if (produto != null) {
            System.out.print("\nTem certeza que deseja excluir este produto? (S/N): ");
            String confirmacao = leia.nextLine();

            if (confirmacao.equalsIgnoreCase("S")) {
                produtoController.deletar(id);
            } else {
                System.out.println("\nOperação cancelada!");
            }
        } else {
            System.out.printf("\nO produto ID %d não foi encontrado!\n", id);
        }
    }

    // ================== Auxiliares ==================

    // cria alguns produtos de teste automaticamente
    private static void criarProdutosTeste() {
    	System.out.println("Criando produtos teste...");
        produtoController.cadastrar(new Carne(produtoController.gerarId(), "Picanha", 59.90f, 500f, "Picanha"));
        produtoController.cadastrar(new Frango(produtoController.gerarId(), "Coxa e Sobrecoxa", 22.00f, 800f, "Coxa e Sobrecoxa"));
        produtoController.cadastrar(new Suino(produtoController.gerarId(), "Costelinha", 34.50f, 700f, "Costelinha"));
        produtoController.cadastrar(new Tempero(produtoController.gerarId(), "Sal do Himalaya", 5.00f, 1000f, "Sal Grosso"));
    	System.out.println("Produtos teste criados com sucesso!");
    }

}


