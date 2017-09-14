import org.junit.Assert;
import org.junit.Test;

import br.com.db1start.aula14.ExerciciosString07;

public class ExercicioStringTest07 {

	@Test
	public void textoMaiusculoTest() {
		ExerciciosString07 palavra = new ExerciciosString07();
		String texto1 = "Francislaine";
		Assert.assertTrue(palavra.quantasLetras("Francislaine").equals(texto1.substring(3,12)));
		System.out.println(texto1.substring(3,12));
		
	}

}
