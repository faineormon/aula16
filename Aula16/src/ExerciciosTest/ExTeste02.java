package ExerciciosTest;

import org.junit.Assert;
import org.junit.Test;

import Exercicios.Ex02;

public class ExTeste02 {
	private Ex02 comparacao = new Ex02();
	
	@Test
	public void comparar() {
		Assert.assertTrue(comparacao.comparando(10d, 5d, 12d) == 5d);
		System.out.println(comparacao.comparando(10d, 5d, 12d));
	}
	
}
