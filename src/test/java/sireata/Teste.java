package sireata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.edu.utfpr.dv.sireata.bo.ComentarioBO;
import br.edu.utfpr.dv.sireata.model.Anexo;
import br.edu.utfpr.dv.sireata.model.Comentario;
import br.edu.utfpr.dv.sireata.model.Comentario.SituacaoComentario;

public class Teste {

	private final Anexo a = new Anexo();
	Comentario com = new Comentario();
	ComentarioBO comBo = new ComentarioBO();
		
	@Test
    void test1(){
        a.setDescricao("Teste1");
        assertEquals("Teste1", a.getDescricao());
    }
	
	
	@Test
    void test2(){
        com.setSituacao(SituacaoComentario.RECUSADO);
        com.setComentarios("");
        try {
        	comBo.validarDados(com);
        }catch (Exception e) {
        	assertEquals("Comente: ", e.getMessage());
		}
	}
	

	
}
