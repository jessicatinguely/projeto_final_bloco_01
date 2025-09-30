package projeto_final_bloco_01.model;

public class Frango extends Produto {

	// Atributo específico
	private String tipo;

	public Frango(int id, String nome, float preco, float peso, String tipo) {
		super(id, nome, 2, preco, peso);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.printf("Tipo de frango: %s%n", this.tipo);
	}
}
