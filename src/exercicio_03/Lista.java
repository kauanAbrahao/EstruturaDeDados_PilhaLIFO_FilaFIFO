package exercicio_03;

import java.util.Arrays;

public class Lista {
	private int tamanho;
	private int [] elementos;
	
	public Lista(int capacidade) {
		tamanho = 0;
		elementos = new int[capacidade];
	}

	public void adiciona(int elemento){
		if (!verificaCheio()) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		}
		else {
			System.out.println("Lista cheia! Impossível adicionar mais elementos.");
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
public int getTamanho() {
	return this.tamanho;
}

//-------------------------//--------------------//--------------
public String toString() { //Mostra o array. mostraVetor()
	return Arrays.toString(this.elementos);
	/* Mas, e se eu não quiser mostrar os nulls?
	
	StringBuilder s = new StringBuilder();
	s.append("[");
	for (int i = 0; i<this.tamanho; i++) {
		s.append(elementos[i]);
	
		if(i == this.tamanho-1) {
			s.append("]");
		}
		else {
			s.append(", ");
		}
	
	}
	if (tamanho == 0) {
		s.append("Vetor vazio]");
	}
	return s.toString();
*/	
}

//------------------//---------------------//----------------
public void enfileira(int elemento) {
	this.adiciona(elemento);
		
}

//------------------//--------------------//----------------
public boolean verificaVazio(){
	if (this.tamanho == 0) {
		return true;
	}
	else {
		return false;

	}
}
//-------------------------//------------------//-----------
public void mostra() {
	if (this.verificaVazio()) {
		System.out.println("Pilha vazia");
	}
	else {
		System.out.println("O topo da pilha é o índice " + (tamanho-1) + ". O elemento que está no topo é: " + this.elementos[tamanho-1]);
	}
}
//-------------------//----------------------//--------------
public void primeiroNaFila() {
	if (!verificaVazio()) {
		System.out.println("O primeiro elemento na fila é: " +  elementos[0]);
	}
	else {
		System.out.println("Fila vazia.");
	}
}
//-------------------//----------------------//--------------//---------
	public int desenfileira() {
	int valor = 0;
	if (this.verificaVazio()) {
		System.out.println("Fila vazia.");
	}
	else {
		valor = this.removeNaPosicao(0);
	}
	return valor;
}
//-------------------------//-------------------------//------------------

public int removeNaPosicao(int indice) {
	int valor = 0;
	if (indice >= elementos.length || indice<0) {
		throw new IllegalArgumentException("Posição inválida");
	}
	valor = elementos[indice];
	for (int i = indice; i<this.tamanho-1; i++) {
		this.elementos[i] = this.elementos[i+1];
		if (i == this.tamanho-2) {
			this.elementos[i+1] = 0;
		}
	}
	this.tamanho--;
	return valor;
}
	
}
