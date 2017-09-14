import org.junit.Assert;
import org.junit.Test;

import br.com.db1start.aula14.ExerciciosInteger06;

public class ExercicioInteger06Test {

	private ExerciciosInteger06 calculo = new ExerciciosInteger06();
		
	@Test
	public void maiorNumero() {
		Integer resultado = calculo.maior(12, 15);
		Assert.assertTrue(resultado == 15);
		System.out.println("Resultado " + resultado);
	}

}
