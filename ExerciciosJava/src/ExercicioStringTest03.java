import org.junit.Assert;
import org.junit.Test;

import br.com.db1start.aula14.ExerciciosString03;

public class ExercicioStringTest03 {

	@Test
	public void textoMaiusculoTest() {
		ExerciciosString03 palavra = new ExerciciosString03();
		String texto1 = "DB1START";
		Assert.assertTrue(palavra.quantasLetras("DB1START").equals(texto1.length()));
		System.out.println(texto1.length());
		
	}

}
