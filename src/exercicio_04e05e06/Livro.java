package exercicio_04e05e06;

public class Livro {
	public static void main(String[] args) {
		FilaLivros fila = new FilaLivros(5);
		PilhaLivros pilha = new PilhaLivros(5);
		PilhaRecebeFila pilhadescarte = new PilhaRecebeFila(5);
		
		Metodos descartado = new Metodos("", 0);
		
	
		fila.enfileira("Senhor dos Anéis", 42);
		
		fila.enfileira("O Anticristo", 212);
		
		System.out.println("Elementos da fila:");
		System.out.println(fila.toString() + "\n");
		
		descartado = fila.desenfileira(descartado);
		pilhadescarte.empilha(descartado);
		
		System.out.println("Elementos da fila:");
		System.out.println(fila.toString() + "\n");
		
		fila.enfileira("A Origem das Espécies", 3);
		fila.enfileira("O Estrageiro", 3);
		fila.enfileira("Relações Contemporâneas", 32);
		
		descartado = fila.desenfileira(descartado);
		pilhadescarte.empilha(descartado);
		
		descartado = fila.desenfileira(descartado);
		pilhadescarte.empilha(descartado);
		
		System.out.println("Elementos da fila:");
		System.out.println(fila.toString() + "\n");
		
		pilha.empilha("Turma da Mônica", 33);
		pilha.empilha("Menino Maluquinho", 498);
	//	System.out.println("Elementos da Pilha: " + "\n" + pilha.toString());
		
	//	pilha.desempilha();
	//	System.out.println("Elementos da Pilha: " + "\n" + pilha.toString());
	//	System.out.println("\n");
		
		System.out.println("Pilha de Descarte ordenada: " + "\n" + pilhadescarte.toString());
		
	}	
}
