package exercicio_03;

public class PrincipalTeste {
	
	
	
	public static void main(String[] args) {
		int valor = 0;
		Pilha pilha = new Pilha(10);
		Lista lista = new Lista(10);
		
		pilha.adiciona(20);
		pilha.adiciona(15);
		
		lista.adiciona(33);
		lista.adiciona(44);
		
		System.out.println("Pilha: " + pilha.toString());
		System.out.println("Fila: " + lista.toString());
		System.out.println("\n");
		
		valor = pilha.desempilha();
		lista.adiciona(valor);
		System.out.println("Pilha: " + pilha.toString());
		System.out.println("Fila: " + lista.toString());
		System.out.println("\n");
		
		lista.adiciona(102);
		valor = lista.desenfileira();
		pilha.adiciona(valor);
		System.out.println("Pilha: " + pilha.toString());
		System.out.println("Fila: " + lista.toString());
		
	}

}
