package Exercicios;

public class Ex01 {
	private Double resultado;
	
	public Double comparando (Double valor1, Double valor2) {
		if(valor1 > valor2) {
			resultado = valor2;
		} else {
			resultado = valor1;
		}
		
		return resultado;
	}
}
