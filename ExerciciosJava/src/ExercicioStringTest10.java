import org.junit.Assert;
import org.junit.Test;

import br.com.db1start.aula14.ExerciciosString10;

public class ExercicioStringTest10 {

	@Test
	public void textoMaiusculoTest() {
		ExerciciosString10 palavra = new ExerciciosString10();
		String[] frutas = palavra.separandoLetras("banana,maçã,melancia");
		Assert.assertTrue(frutas[0].equals("banana"));
		Assert.assertTrue(frutas[1].equals("maçã"));
		Assert.assertTrue(frutas[2].equals("melancia"));
		
	}

}
