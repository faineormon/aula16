import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import br.com.db1start.aula14.ExerciciosInteger01;

public class ExercicioInteger01Test {

	private ExerciciosInteger01 calculosoma = new ExerciciosInteger01();
	
	@After
	public void after() {
		System.out.println("Resultado " + calculosoma.exibirResultado());
	}
	@Test
	public void somar() {
		calculosoma.somar(10d, 2d);
		Assert.assertTrue(calculosoma.exibirResultado() == 12d);
	}

}
