package Exercicios;

public class Ex02 {
	private Double resultado;
	
	public Double comparando (Double valor1, Double valor2, Double valor3) {
		if(valor1 < valor2 && valor1 < valor3) {
			resultado = valor1;
		} else {
			if(valor2 < valor3 && valor2 < valor1) {
				resultado = valor2;
			} else {
				resultado = valor3;
			}
		}
		return resultado;
	}
}
