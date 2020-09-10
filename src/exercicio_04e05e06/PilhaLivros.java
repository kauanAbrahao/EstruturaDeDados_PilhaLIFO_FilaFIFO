package exercicio_04e05e06;

import java.util.Arrays;

public class PilhaLivros {
	Metodos[] livros;
	int tamanho;
	
	PilhaLivros(int capacidade){
		livros = new Metodos[capacidade];
		tamanho = 0;
	}
	
	public void empilha(String titulo, int exemplares){
		if (!verificaCheio()) {
			Metodos livro = new Metodos(titulo, exemplares);
			livros[tamanho] = livro;
			this.tamanho++;
		}
		else {
			System.out.println("Vetor cheio. Impossível adicionar mais elementos");
		}
	}
	//-----------------//-------------------//-------------------//-----------------//----------
	public void desempilha() {
		if (this.verificaVazio()) {
			System.out.println("Pilha vazia.");
		}
		else {
			this.livros[tamanho-1] = null;
			this.tamanho--;
		}
	}
	//-----------------//------------------//----------------
	public boolean verificaCheio() {
		if (tamanho == livros.length) {
			return true;
		}
		else {
			return false;
		}
	}
	//------------------//------------------//----------------
	public boolean verificaVazio(){
		if (this.tamanho == 0) {
			return true;
		}
		else {
			return false;
	
		}
	}
	
	public String toString() {
		return Arrays.toString(livros);
	}
	
	public void teste() {
		System.out.println(livros[0].getTitulo());
	}
	
	
}
