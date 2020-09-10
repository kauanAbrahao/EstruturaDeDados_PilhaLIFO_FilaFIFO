package exercicio_04e05e06;

public class Metodos {
	private String titulo;
	private int exemplares;
	
	public Metodos(String titulo, int exemplares) {
		this.titulo = titulo;
		this.exemplares = exemplares;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getExemplares() {
		return exemplares;
	}

	public void setExemplares(int exemplares) {
		this.exemplares = exemplares;
	}
	
	public String toString() {
		return "Título: " + this.titulo + " - Exemplares: " + this.exemplares;
	}
}
