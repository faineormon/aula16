import org.junit.Assert;
import org.junit.Test;

import br.com.db1start.aula14.ExerciciosInteger05;

public class ExercicioInteger05Test {

	private ExerciciosInteger05 calculosoma = new ExerciciosInteger05();
		
	@Test
	public void par() {
		Double resultado = calculosoma.par(10d);
		Assert.assertTrue(resultado == 0);
		System.out.println("Resultado " + resultado);
	}

}
