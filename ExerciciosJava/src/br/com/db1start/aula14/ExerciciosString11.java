package br.com.db1start.aula14;

public class ExerciciosString11 {
	
	public Integer contandoLetras(String texto) {
		String[] vogais = {"a","e","i","o","u"};
		Integer i, j;
		
		for(i = 0; i < texto.length(); i++) {
			for(j = 0; j < vogais.length; j++)
				if(vogais[j] == texto.substring(i,j)) {	
				j++;
			}
		}
		return j;
	}
}
