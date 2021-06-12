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
		// métodos dentro de outros métodos
		
		void mudarEstado() {
			if (ligada) {
				desligar();
			}else {
				ligar();
			}
		}
}
