import org.junit.Assert;
import org.junit.Test;

import br.com.db1start.aula14.ExerciciosInteger07;

public class ExercicioInteger07Test {

	private ExerciciosInteger07 calculo = new ExerciciosInteger07();
		
	@Test
	public void numeroImpar() {
		Integer resultado[] = calculo.inicio(5);
		
		Assert.assertTrue(resultado[0] == 5);
		Assert.assertTrue(resultado[1] == 7);
	}

}
