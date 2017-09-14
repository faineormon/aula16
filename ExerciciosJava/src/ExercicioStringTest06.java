import org.junit.Assert;
import org.junit.Test;

import br.com.db1start.aula14.ExerciciosString06;

public class ExercicioStringTest06 {

	@Test
	public void textoMaiusculoTest() {
		ExerciciosString06 palavra = new ExerciciosString06();
		String texto1 = "Francislaine";
		Assert.assertTrue(palavra.quantasLetras("Francislaine").equals(texto1.substring(0,4)));
		System.out.println(texto1.substring(0,4));
		
	}

}
