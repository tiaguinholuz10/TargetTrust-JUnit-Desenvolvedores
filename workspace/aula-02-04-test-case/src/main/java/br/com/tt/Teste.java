package br.com.tt;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class Teste extends TestCase{
	
	protected double valor1;
	protected double valor2;
	
	@Before
	public void setUp(){
		
		valor1 = 2.0;
		valor2 = 3.0;
	}

	@Test
	public void teste(){
		System.out.println(valor1+valor2);
		assertTrue(5.0 == (valor1+valor2));
		assertTrue(5.0 == (valor1+valor2));
		int qtd = this.countTestCases();
		System.out.println("Quantidade de testes = "+ qtd);
		String name = this.getName();
		System.out.println("Meu teste = "+ name);
		
		
		this.setName("novoTesteOutroNome");
		name = this.getName();
		System.out.println("Meu teste = "+ name);
	}
	
	@After
	public void tearDown(){
		valor1 = 0D;
		valor2 = 0D;
		
		//Fecha conex�es e recursos
	}
}
