package br.com.tt;

import static org.junit.Assert.*;
import org.junit.Test;


public class AvaliacaoTest {

	@Test
	public void testAvaliarAlunoAprovado() {
		
		Avaliacao avaliacao = new Avaliacao();
		Estudante aluno = mockito.mock(Estudante.class);
		when(aluno.getNotaProva()).thenReturn(8d);
		when(aluno.getNotaTrabalho()).thenReturn(7D);
		
		
		String resultado = avaliacao.avaliar(aluno);
		
		assertEquals(Avaliacao.APROVADO, resultado);		
		
	}
	
	@Test
	public void testAvaliarAlunoReprovado() {
		
		Avaliacao avaliacao = new Avaliacao();
		
		String resultado = avaliacao.avaliar(6D,7D);
		assertEquals("Avaliar Auno"+ Avaliacao.REPROVADO, Avaliacao.REPROVADO, resultado);		
		
	}
	
	private Estudante getAluno(){
		Estudante aluno = Mockito.mock(Estudante.class);
		
	}

}
