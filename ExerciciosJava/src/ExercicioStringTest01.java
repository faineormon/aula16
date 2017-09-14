import org.junit.Assert;
import org.junit.Test;

import br.com.db1start.aula14.ExerciciosString01;

public class ExercicioStringTest01 {

	@Test
	public void textoMaiusculoTest() {
		ExerciciosString01 palavra = new ExerciciosString01();
		String texto1 = "qualquercoisa";
		Assert.assertTrue(palavra.textoMaiusculo("qualquercoisa").equals(texto1.toUpperCase()));
		System.out.println(texto1.toUpperCase());
		
	}

}
