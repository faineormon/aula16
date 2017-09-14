import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import br.com.db1start.aula14.ExerciciosInteger03;

public class ExercicioInteger03Test {

	private ExerciciosInteger03 calculosoma = new ExerciciosInteger03();
	
	@After
	public void after() {
		System.out.println("Resultado " + calculosoma.exibirResultado());
	}
	
	@Test
	public void mutiplicar() {
		calculosoma.mutiplicar(10d, 2d);
		Assert.assertTrue(calculosoma.exibirResultado() == 20d);
	}

}
