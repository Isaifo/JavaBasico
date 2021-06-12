package tiposRetorno;

public class Carro {
	
	  //declaracao dos atributos
	
		String marca;
		String modelo;
		int numPassageiros;
		double capCombustivel;
		double consCombustivel;
		
		// método sem retorno
		
		void exibirAutonomia() {
			
			System.out.println("A autonomia eh: " + capCombustivel * consCombustivel);
			
			
		}
		
		// método com retorno
		
		double obterAutonomia() {
			System.out.println("Método autonomia foi chamado.");
			return capCombustivel * consCombustivel;
			
		}
		
		// método com parâmetro
		
		double calcularCombutivel(double km) {
			
			double qtdCombustivel = km/consCombustivel;
			return qtdCombustivel;
		}
		
}
