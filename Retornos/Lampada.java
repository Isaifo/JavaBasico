package tiposRetorno;

public class Lampada {

		String modelo;
		String tensao;
		boolean ligada;
		
		void ligar() {
			ligada = true;
		}
		
		void desligar() {
			ligada = false;
		}
		
		void mostrarEstado(){
			if(ligada) {
				System.out.println("Lampada esta ligada");
				
			}else {
				System.out.println("Lampada esta desligada");
			}
		}
		// m�todos dentro de outros m�todos
		
		void mudarEstado() {
			if (ligada) {
				desligar();
			}else {
				ligar();
			}
		}
}
