package projeto_final_bloco_01.controller;

import java.util.ArrayList;
import java.util.List;

import projeto_final_bloco_01.model.Produto;
import projeto_final_bloco_01.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {
	
	// Collection para armazenar os produtos
	private List<Produto> listaProdutos = new ArrayList<Produto>();
	int id = 0; // contador para gerar IDs automaticamente

	@Override
	public void listarTodos() {
		if (listaProdutos.isEmpty()) {
			System.out.println("\n📭 Nenhum produto cadastrado!");
		} else {
			System.out.println("\n📋 Lista de Produtos:");
			for (var produto : listaProdutos) {
				produto.visualizar();
				System.out.println("──────────────────────────────");
			}
		}
	}

	@Override
	public void cadastrar(Produto produto) {
		listaProdutos.add(produto);
		System.out.printf("🎉 Produto cadastrado com sucesso: %s - id: %d %n", produto.getNome(), produto.getId());
	}

	@Override
	public void atualizar(Produto produto) {
		var buscarProduto = buscarNaCollection(produto.getId());
		
		if (buscarProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscarProduto), produto);
			System.out.printf("\n✅ O Produto id: %d foi atualizado com sucesso! 🔄%n", produto.getId());
		} else {
			System.out.printf("\n❌ O Produto id: %d não foi encontrado! 🔍%n", produto.getId());
		}
	}

	@Override
	public void procurarPorId(int id) {
		var produto = buscarNaCollection(id);
		
		if (produto != null) {
			System.out.println("\n🔎 Produto encontrado:");
			produto.visualizar();
		} else {
			System.out.printf("\n❌ O Produto id: %d não foi encontrado!%n", id);
		}
	}

	@Override
	public void deletar(int id) {
		var produto = buscarNaCollection(id);
		
		if (produto != null) {
			if (listaProdutos.remove(produto) == true) {
				System.out.printf("\n🗑️ O Produto id: %d foi deletado com sucesso!%n", id);
			}
		} else {
			System.out.printf("\n❌ O Produto id: %d não foi encontrado!%n", id);
		}
	}

	// Métodos auxiliares
	public int gerarId() {
		return ++id;
	}
	
	public Produto buscarNaCollection(int id) {
		for (var produto : listaProdutos) {
			if (produto.getId() == id) {
				return produto;
			}
		}
		return null;
	}
}

