package exercicio_03;

import java.util.Arrays;

public class Pilha {
	private int tamanho;
	private int [] elementos;
	
	public Pilha(int capacidade) {
		tamanho = 0;
		elementos = new int[capacidade];
	}
	
	//------------------//-------------------//------------------
	
			public void adiciona(int elemento){
				if (!verificaCheio()) {
					this.elementos[this.tamanho] = elemento;
					this.tamanho++;
				}
				else {
					System.out.println("Vetor cheio. Impossível adicionar mais elementos");
				}
			}
			
		//-------------//-------------------//----------------//-------

		public boolean verificaCheio() {
			if (tamanho == elementos.length) {
				return true;
			}
			else {
				return false;
			}
		}
		//----------------------//-----------------------//----------------
		public boolean verificaVazio(){
			if (this.tamanho == 0) {
				return true;
			}
			else {
				return false;
		
			}
		}
		
		//---------------------------//--------------------//------------
		
		
		public int getTamanho() {
			return this.tamanho;
		}
		public void empilha(int elemento) {
			adiciona(elemento);
		}
		//------------------------------------///------------------------//------
		public int desempilha() {
			int valor = 0;
			if (this.verificaVazio()) {
				System.out.println("Pilha vazia.");
			}
			else {
				valor = this.elementos[tamanho-1];
				this.elementos[tamanho-1] = 0;
				this.tamanho--;
			}
			return valor;
		}
		
		//-------------------------//---------------------//------------------
		public String toString() { //Mostra o array. mostraVetor()
			return Arrays.toString(this.elementos);
		}
}
