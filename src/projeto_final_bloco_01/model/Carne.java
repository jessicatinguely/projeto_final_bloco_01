package projeto_final_bloco_01.model;

public class Carne extends Produto {

	// Atributo específico
	private String corte;

	public Carne(int id, String nome, float preco, float peso, String corte) {
		super(id, nome, 1, preco, peso);
		this.corte = corte;
	}

	public String getCorte() {
		return corte;
	}
	
	public void setCorte(String corte) {
		this.corte = corte;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.printf("Corte: %s%n", this.corte);
	}
}
