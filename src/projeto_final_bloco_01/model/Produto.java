package projeto_final_bloco_01.model;

/**
 * Classe abstrata Produto
 * Representa os itens do açougue (Carne, Frango, Suíno, Tempero).
 *
 * Atributos:
 * - id: identificador único do produto
 * - nome: nome do produto
 * - categoria: tipo do produto (1=Carne, 2=Frango, 3=Suíno, 4=Temperos/Condimentos)
 * - preco: preço unitário do produto
 * - peso: peso em gramas do produto
 *
 * Métodos principais:
 * - visualizar(): exibe os dados formatados no console
 */
public abstract class Produto {
	
	private int id;
	private String nome;
	private int categoria;
	private float preco;
	private float peso; 

	// Construtor
	public Produto(int id, String nome, int categoria, float preco, float peso) {
		this.id = id;
		this.nome = nome;
		this.categoria = categoria;
		this.preco = preco;
		this.peso = peso;
	}

	// Get e Set
	public int getId() { return id; }
	public void setId(int id) { this.id = id; }

	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }

	public int getCategoria() { return categoria; }
	public void setCategoria(int categoria) { this.categoria = categoria; }

	public float getPreco() { return preco; }
	public void setPreco(float preco) { this.preco = preco; }

	public float getPeso() { return peso; }
	public void setPeso(float peso) { this.peso = peso; }

	/**
	 * Exibe os dados do produto formatados no console:
	 * id, nome, categoria, preço e peso.
	 */
	public void visualizar() {
		String categoriaStr = " ";
		switch(this.categoria) {
			case 1 -> categoriaStr = "Carne";
			case 2 -> categoriaStr = "Frango";
			case 3 -> categoriaStr = "Suíno";
			case 4 -> categoriaStr = "Temperos/Condimentos";
			default -> categoriaStr = "Inválido";
		}
		
		System.out.println("\n═════════════════════════════════════════════");
		System.out.println("Dados do Produto");
		System.out.println("═════════════════════════════════════════════");
		System.out.printf("Id do produto: %d%n", this.id);
		System.out.printf("Categoria do produto: %s%n", categoriaStr);
		System.out.printf("Nome do produto: %s%n", this.nome);
		System.out.printf("Preço do produto: R$ %.2f%n", this.preco);
		System.out.printf("Peso do produto (sempre em gramas): %.2fg%n", this.peso);
	}
}
