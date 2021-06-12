package tiposRetorno;

public class TesteCarro {
		public static void main(String[] args) {
			
			Carro van = new Carro(); // criando van na classe carro
			
			van.marca = "Fiat";
			van.modelo = "Ducato";
			van.numPassageiros= 10;
			van.capCombustivel = 100;
			van.consCombustivel = 0.2;
			
			
			System.out.println(van.marca);
			System.out.println(van.modelo);
			
			van.exibirAutonomia();
			
			double autonomia = van.obterAutonomia(); // obtem o valor atraves da chamada do metodo
			
			System.out.println("Valor da autonomia: " + autonomia);
			
			System.out.println("Valor da autonomia: " + van.obterAutonomia());
			
			double qtdCombustivel10 = van.calcularCombutivel(10);
			
			System.out.println("qtdCombustivel10 =" + qtdCombustivel10);
		}
}
