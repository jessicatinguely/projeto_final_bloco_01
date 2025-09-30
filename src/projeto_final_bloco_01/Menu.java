package projeto_final_bloco_01;

import java.util.InputMismatchException;
import java.util.Scanner;

import projeto_final_bloco_01.util.Cores;

public class Menu {
	
	private static final Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {

		int opcao;
	
	while (true) {

		System.out.println(Cores.TEXT_RED_BOLD + Cores.ANSI_YELLOW_BACKGROUND
				+ "                                                       " + Cores.TEXT_RESET);
		System.out.println(Cores.TEXT_RED_BOLD + Cores.ANSI_YELLOW_BACKGROUND
				+ "╔══════════════════════ BOMSABOR ═════════════════════╗" + Cores.TEXT_RESET);

		System.out.println(Cores.TEXT_RED_BOLD + Cores.ANSI_YELLOW_BACKGROUND
				+ "                                                       " + Cores.TEXT_RESET);
		System.out.println(Cores.TEXT_RED_BOLD + Cores.ANSI_YELLOW_BACKGROUND
				+ "  [1] Criar Produto                                    " + Cores.TEXT_RESET);
		System.out.println(Cores.TEXT_RED_BOLD + Cores.ANSI_YELLOW_BACKGROUND
				+ "  [2] Listar Todos os Produtos                         " + Cores.TEXT_RESET);
		System.out.println(Cores.TEXT_RED_BOLD + Cores.ANSI_YELLOW_BACKGROUND
				+ "  [3] Buscar Produto por Id                            " + Cores.TEXT_RESET);
		System.out.println(Cores.TEXT_RED_BOLD + Cores.ANSI_YELLOW_BACKGROUND
				+ "  [4] Atualizar Dados do Produto                       " + Cores.TEXT_RESET);
		System.out.println(Cores.TEXT_RED_BOLD + Cores.ANSI_YELLOW_BACKGROUND
				+ "  [5] Apagar Produto                                   " + Cores.TEXT_RESET);
		System.out.println(Cores.TEXT_RED_BOLD + Cores.ANSI_YELLOW_BACKGROUND
				+ "  [0] Sair                                             " + Cores.TEXT_YELLOW_BOLD);
	
		System.out.println(Cores.TEXT_RED_BOLD + Cores.ANSI_YELLOW_BACKGROUND
				+ "                                                       " + Cores.TEXT_RESET);
		System.out.println(Cores.TEXT_RED_BOLD + Cores.ANSI_YELLOW_BACKGROUND
				+ "╚═════════════════════════════════════════════════════╝" + Cores.TEXT_RESET);

		// Entrada do usuário
		System.out.print(Cores.TEXT_YELLOW_BRIGHT + "\nEntre com a opção desejada: " + Cores.TEXT_RESET);
		
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
			System.out.println(Cores.TEXT_YELLOW_BOLD + "\nBomSabor - Do açougue direto pra sua mesa");
			sobre();// chama o método 'sobre()' e encerra a aplicação
			leia.close();
			System.exit(0);
		}

		// Controle de fluxo do menu
		switch (opcao) {
		case 1:// Aqui vamos implementar a criação de um novo produto (CRUD - Create)
			System.out.println(Cores.TEXT_WHITE + "Criar Produto\n\n");
			
			keyPress();
			break;
		case 2:// Aqui vamos listar todos os produtos cadastrados (CRUD - Read)
			System.out.println(Cores.TEXT_WHITE + "Listar Todos os Produtos\n\n");
			
			keyPress();
			break;
		case 3:// Aqui vamos buscar um produto específico pelo ID (CRUD - Read by Id)
			System.out.println(Cores.TEXT_WHITE + "Consultar Dados do Produto - por Id\n\n");
			
			keyPress();
			break;
		case 4:// Aqui vamos atualizar dados de um produto existente (CRUD - Update)
			System.out.println(Cores.TEXT_WHITE + "Atualizar Dados do Produto\n\n");
			
			keyPress();
			break;
		case 5:// Aqui vamos apagar um produto do sistema (CRUD - Delete)
			System.out.println(Cores.TEXT_WHITE + "Apagar Produto\n\n");
			keyPress();
			break;
		default:
			System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
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
		System.out.println(Cores.TEXT_YELLOW_BOLD + "Projeto Desenvolvido por: Jessica Ghirardelli Tinguely " + Cores.TEXT_RESET);
		System.out.println(Cores.TEXT_YELLOW_BOLD + "jessicatinguely@icloud.com" + Cores.TEXT_RESET);
		System.out.println(
				Cores.TEXT_YELLOW_BOLD + "https://github.com/jessicatinguely/projeto_final_bloco_01" + Cores.TEXT_RESET);
		System.out.println(
				Cores.TEXT_YELLOW_BOLD + "═══════════════════════════════════════════════════════════" + Cores.TEXT_RESET);
	}

	public static void keyPress() {
		System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para continuar...");
		leia.nextLine();

	}
}

