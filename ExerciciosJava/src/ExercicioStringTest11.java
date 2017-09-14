import org.junit.Assert;
import org.junit.Test;

import br.com.db1start.aula14.ExerciciosString11;

public class ExercicioStringTest11 {

	@Test
	public void textoMaiusculoTest() {
		ExerciciosString11 palavra = new ExerciciosString11();
		Assert.assertTrue(palavra.contandoLetras("faine") == 3);

		
	}

}
