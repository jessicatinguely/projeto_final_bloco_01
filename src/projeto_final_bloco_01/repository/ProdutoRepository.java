package projeto_final_bloco_01.repository;

import projeto_final_bloco_01.model.Produto;

public interface ProdutoRepository {
	
	// Métodos do CRUD
	public void listarTodos();                 // Read (listar todos)
	public void cadastrar(Produto produto);    // Create
	public void atualizar(Produto produto);    // Update
	public void procurarPorId(int id);         // Read (buscar por id)
	public void deletar(int id);               // Delete
}
