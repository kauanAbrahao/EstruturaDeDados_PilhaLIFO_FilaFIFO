package exercicios_01e02;

import javax.swing.JOptionPane;

public class FilaTeste {
	public static void main(String[] args) {
		
		Fila fila = new Fila (10);
		boolean loop = true;
		int opc = 0;
		
		while (loop) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha: " + "\n" + "1 - adicionar elemento" + "\n" + "2 - remover elemento" + "\n" + 
					"3 - Quantidade de posições preenchidas" + "\n" + "4 - Imprimir fila" + "\n" + "9 - finalizar"));
		switch(opc) {

			case 1:
				int elemento = Integer.parseInt(JOptionPane.showInputDialog("Inserir valor: "));
				fila.adiciona(elemento);
				break;
				
			case 2:
				fila.remove(0);
				break;
				
			case 3:
				System.out.println(fila.getTamanho());
				break;
			
			case 4:
				System.out.println(fila.toString());
				break;
			
			case 9:
				loop = false;
				break;
			
			default:
				JOptionPane.showMessageDialog(null, "Inserir valor válido");
		}
		}
	}
}
