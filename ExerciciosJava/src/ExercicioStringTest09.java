import org.junit.Assert;
import org.junit.Test;

import br.com.db1start.aula14.ExerciciosString09;

public class ExercicioStringTest09 {

	@Test
	public void textoMaiusculoTest() {
		ExerciciosString09 palavra = new ExerciciosString09();
		String texto1 = "Faine Ormon";
		Assert.assertTrue(palavra.trocandoLetras("Faine Ormon").equals(texto1.replace("Faine", "Aluna")));
		System.out.println(palavra.trocandoLetras("Faine Ormon"));
		
	}

}
