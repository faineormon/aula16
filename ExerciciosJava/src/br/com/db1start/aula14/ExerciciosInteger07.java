package br.com.db1start.aula14;

public class ExerciciosInteger07 {
	
	Integer[] resultado = new Integer[50];
	
	public Integer[] inicio(Integer numero1) {
		Integer i = 0;
		for(Integer numero2 = numero1; numero2 <= 100; numero2++) {
			if(numero2 % 2 != 0) {
				resultado[i] = numero2;
				i++;
			}
		}
		return resultado;
	}
	
}
