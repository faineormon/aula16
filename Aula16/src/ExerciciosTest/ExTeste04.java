package ExerciciosTest;

import org.junit.Assert;
import org.junit.Test;

import Exercicios.Ex04;

public class ExTeste04 {
	private Ex04 fazendoArea = new Ex04();
	
	@Test
	public void comparar() {
		Assert.assertTrue(fazendoArea.area(10d, 2d) == 10d);
		System.out.println(fazendoArea.area(10d, 2d));
	}
	
}
