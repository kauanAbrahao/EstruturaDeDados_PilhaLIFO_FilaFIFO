package exercicio_04e05e06;

import java.util.Arrays;

public class FilaLivros {

	Metodos[] livros;
	int tamanho;
	
	FilaLivros(int capacidade){
		livros = new Metodos[capacidade];
		tamanho = 0;
		
	}
	
	public void enfileira(String titulo, int exemplares) {
		if (this.tamanho >= livros.length) {
			System.out.println("Lista cheia! Não há como acrescentar livros");
		}
		else {
			Metodos livro = new Metodos(titulo, exemplares);
			livros[tamanho] = livro;
			tamanho++;
		}
	
	}
	
	public Metodos desenfileira(Metodos descartado) {
		if (this.verificaVazio()) {
			System.out.println("Fila vazia.");
		}
		else {
			descartado = this.livros[0];
			for (int i = 0; i<this.tamanho-1; i++) {
				this.livros[i] = this.livros[i+1];
				if (i == this.tamanho-2) {
					this.livros[i+1] = null;
				}
			}
			this.tamanho--;
		}
		return descartado;
		
	}
	
	public String toString() {
		return Arrays.toString(livros);
	}
	
	public boolean verificaVazio(){
		if (this.tamanho == 0) {
			return true;
		}
		else {
			return false;
	
		}
	}
	
	
	
}
