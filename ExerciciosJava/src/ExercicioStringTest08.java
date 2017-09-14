import org.junit.Assert;
import org.junit.Test;

import br.com.db1start.aula14.ExerciciosString08;

public class ExercicioStringTest08 {

	@Test
	public void textoMaiusculoTest() {
		ExerciciosString08 palavra = new ExerciciosString08();
		String texto1 = "Francislaine";
		Assert.assertTrue(palavra.quantasLetras("Francislaine").equals(texto1.substring(8,12)));
		System.out.println(texto1.substring(8,12));
		
	}

}
