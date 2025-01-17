package br.com.tt;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;




@RunWith(Parameterized.class)
public class VerificaNumeroPrimoTest {
	
	private VerificaNumeroPrimo verificaNumeroPrimo ; 
	private Boolean valorEsperado;
	private Integer numero;
	
	
	
	
	
	public VerificaNumeroPrimoTest( Integer numero, Boolean valorEsperado) {
		super();
		this.numero = numero;
		this.valorEsperado = valorEsperado;
		
	}

	@Before
	public void inicializacao(){
		verificaNumeroPrimo = new VerificaNumeroPrimo(); 
	}
	
	@Parameters
	public static Collection<Object[]> numerosPrimos() {
		//@formatter:off
		return Arrays.asList(new Object[][] { 
			{ 2, false  }, 
			{ 6, false },
			{ 19, true }, 
			{ 22, false},
			{ 23, true }
			}

		);
		//@formatter:on
	}

	@Test
	public void testValidar() {
		assertEquals(valorEsperado, verificaNumeroPrimo.validar(numero));
	}
	
	@Test
	public void test0() {
		System.out.println(valorEsperado + " - " + numero);
	}
	
	@Test
	public void test1() {
		
	}

}
