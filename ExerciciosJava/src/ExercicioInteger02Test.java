import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import br.com.db1start.aula14.ExerciciosInteger02;

public class ExercicioInteger02Test {

	private ExerciciosInteger02 calculosoma = new ExerciciosInteger02();
	
	@After
	public void after() {
		System.out.println("Resultado " + calculosoma.exibirResultado());
	}
	
	@Test
	public void subtrair() {
		calculosoma.subtrair(10d, 2d);
		Assert.assertTrue(calculosoma.exibirResultado() == 8d);
	}

}
