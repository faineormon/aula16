package ExerciciosTest;

import org.junit.Assert;
import org.junit.Test;

import Exercicios.Ex01;

public class ExTeste01 {
	private Ex01 comparacao = new Ex01();
	
	@Test
	public void comparar() {
		Assert.assertTrue(comparacao.comparando(10d, 5d) == 5d);
		System.out.println(comparacao.comparando(10d, 5d));
	}
	
	

}
