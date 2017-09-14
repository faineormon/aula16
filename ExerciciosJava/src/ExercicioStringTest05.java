import org.junit.Assert;
import org.junit.Test;

import br.com.db1start.aula14.ExerciciosString05;

public class ExercicioStringTest05 {

	@Test
	public void textoMaiusculoTest() {
		ExerciciosString05 palavra = new ExerciciosString05();
		String texto1 = " DB1START ";
		Assert.assertTrue(palavra.quantasLetras(" DB1START ").equals(texto1.length()));
		System.out.println(texto1.length());
		
	}

}
