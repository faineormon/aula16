import org.junit.Assert;
import org.junit.Test;

import br.com.db1start.aula14.ExerciciosString04;

public class ExercicioStringTest04 {

	@Test
	public void textoMaiusculoTest() {
		ExerciciosString04 palavra = new ExerciciosString04();
		String texto1 = " DB1START ";
		Assert.assertTrue(palavra.quantasLetras(" DB1START ").equals(texto1.trim().length()));
		System.out.println(texto1.trim().length());
		
	}

}
