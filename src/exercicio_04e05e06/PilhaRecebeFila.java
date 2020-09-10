package exercicio_04e05e06;

import java.util.Arrays;

public class PilhaRecebeFila {

		Metodos[] livros_descartados;
		int tamanho;
		
		PilhaRecebeFila(int capacidade){
			tamanho = 0;
			livros_descartados = new Metodos[capacidade];
		}
		
		public void empilha(Metodos descartado){
			if (!verificaCheio()) {
				livros_descartados[tamanho] = descartado;
				this.tamanho++;
			}
			else {
				System.out.println("Vetor cheio. Impossível adicionar mais elementos");
			}
		}
		
		//---------------------//---------------------//------------------//---------------------
		public boolean verificaCheio() {
			if (tamanho == livros_descartados.length) {
				return true;
			}
			else {
				return false;
			}
		}
		//--------------------//-----------------------//---------------------//----------------
		public String toString() {
			ordena();
			return Arrays.toString(livros_descartados);
			
		}
		
		public void ordena() {
			String titulo1, titulo2 = "";
			for (int i = 0; i<tamanho; i++) {
				for (int j = (i+1); j<tamanho; j++) {
					titulo1 = livros_descartados[i].getTitulo();
					titulo2 = livros_descartados[j].getTitulo();
					if (titulo1.compareToIgnoreCase(titulo2)>0) {
						Metodos aux = livros_descartados[j];
						livros_descartados[j] = livros_descartados[i];
						livros_descartados[i] = aux;
					}
						
					
				}
			}
			
		}
}
