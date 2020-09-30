package sireata;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.mockito.Mock;
import br.edu.utfpr.dv.sireata.bo.DepartamentoBO;
import br.edu.utfpr.dv.sireata.model.Campus;
import br.edu.utfpr.dv.sireata.model.Departamento;

public class Teste2 {

	@Mock
	private DepartamentoBO testeDpto;
	
	@Test
	public void salvar() {
		Departamento testeD = new Departamento();
		testeDpto = mock(DepartamentoBO.class);
		testeD.setCampus(new Campus());
		try {
			when(testeDpto.salvar(testeD)).thenReturn(1);
			int res = testeDpto.salvar(testeD);
			assertEquals(1, res);
		}
		catch (Exception e) {
			e.printStackTrace();
		}				
	}
}
