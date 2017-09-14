package ExerciciosTest;

import org.junit.Assert;
import org.junit.Test;

import Exercicios.Ex03;

public class ExTeste03 {
	private Ex03 fazendoMedia = new Ex03();
	
	@Test
	public void comparar() {
		Assert.assertTrue(fazendoMedia.media(10d, 20d, 30d) == 20d);
		System.out.println(fazendoMedia.media(10d, 20d, 30d));
	}
	
}
