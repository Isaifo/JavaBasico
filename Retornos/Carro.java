package tiposRetorno;

public class Carro {
	
	  //declaracao dos atributos
	
		String marca;
		String modelo;
		int numPassageiros;
		double capCombustivel;
		double consCombustivel;
		
		// m�todo sem retorno
		
		void exibirAutonomia() {
			
			System.out.println("A autonomia eh: " + capCombustivel * consCombustivel);
			
			
		}
		
		// m�todo com retorno
		
		double obterAutonomia() {
			System.out.println("M�todo autonomia foi chamado.");
			return capCombustivel * consCombustivel;
			
		}
		
		// m�todo com par�metro
		
		double calcularCombutivel(double km) {
			
			double qtdCombustivel = km/consCombustivel;
			return qtdCombustivel;
		}
		
}
