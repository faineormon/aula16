import org.junit.Assert;
import org.junit.Test;

import br.com.db1start.aula14.ExerciciosString02;

public class ExercicioStringTest02 {

	@Test
	public void textoMaiusculoTest() {
		ExerciciosString02 palavra = new ExerciciosString02();
		String texto1 = "FaineOrmon";
		Assert.assertTrue(palavra.textoMinusculo("FaineOrmon").equals(texto1.toLowerCase()));
		System.out.println(texto1.toLowerCase());
		
	}

}
