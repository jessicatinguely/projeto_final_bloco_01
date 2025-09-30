package projeto_final_bloco_01.model;

public class Tempero extends Produto {

	// Atributo específico
	private String tipo;

	public Tempero(int id, String nome, float preco, float peso, String tipo) {
		super(id, nome, 4, preco, peso);
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
		System.out.printf("Tipo de tempero: %s%n", this.tipo);
	}
}
