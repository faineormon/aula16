import org.junit.Assert;
import org.junit.Test;

import br.com.db1start.aula14.ExerciciosInteger04;

public class ExercicioInteger04Test {

	private ExerciciosInteger04 calculosoma = new ExerciciosInteger04();
		
	@Test
	public void dividir() {
		Double resultado = calculosoma.dividir(10d, 2d);
		Assert.assertTrue(resultado == 5d);
		System.out.println("Resultado " + resultado);
	}

}
