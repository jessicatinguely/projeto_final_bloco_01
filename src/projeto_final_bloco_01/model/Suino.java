package projeto_final_bloco_01.model;

public class Suino extends Produto {

	// Atributo específico
	private String parte;

	public Suino(int id, String nome, float preco, float peso, String parte) {
		super(id, nome, 3, preco, peso);
		this.parte = parte;
	}

	public String getParte() {
		return parte;
	}

	public void setParte(String parte) {
		this.parte = parte;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.printf("Parte do suíno: %s%n", this.parte);
	}
}
