package exercicios_01e02;

import java.util.Arrays;

public class Fila {
	private int tamanho;
	private int[] elementos;
	
	public Fila(int capacidade) {
		tamanho = 0;
		elementos = new int [capacidade];
	}
	
	//-------------------------------------//-----------------------------//-------
	
	public void adiciona(int elemento){
		if (!verificaCheio()) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		}
		else {
			System.out.println("Lista cheia! Impossível adicionar mais elementos.");
		}
	}
	
	//------------//------------//----------------//-----------------//------------
	public boolean verificaCheio() {
		if (tamanho == elementos.length) {
			return true;
		}
		else {
			return false;
		}
	}
	//-----------------//--------------------------//-----------------//-------
	public void remove(int indice) {
		if (verificaVazio()) {
			System.out.println("Lista vazia!");
		}
		else {
			if (indice >= elementos.length || indice<0) {
				throw new IllegalArgumentException("Posição inválida");
			}
			for (int i = indice; i<this.tamanho-1; i++) {
				this.elementos[i] = this.elementos[i+1];
				if (i == this.tamanho-2) {
					this.elementos[i+1] = 0;
				}
			}
			tamanho--;
		}
	}
	//------------------------//--------------------------//--------------------
	public boolean verificaVazio(){
		if (this.tamanho == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	//------------------------//------------------//----------------//---------
	public int getTamanho() {
		return this.tamanho;
	}
	
	//------------------------//-----------//-----------------//-------------
	public String toString() { //Mostra o array. mostraVetor()
		return Arrays.toString(elementos);
	}
	
	

}
