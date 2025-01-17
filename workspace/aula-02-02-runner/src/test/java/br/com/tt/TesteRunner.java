package br.com.tt;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TesteRunner {
	
	public static void main(String[] args) {
		
	
		Result result = JUnitCore.runClasses(TesteJunit.class);
		for(Failure failure : result.getFailures()){
			System.out.println(failure.toString());
			System.out.println(failure.getDescription());
			//System.out.println(failure.getTrace());
			
		}
		System.out.println(result.wasSuccessful());
		int qtdRunCount = result.getRunCount();
		int qtdIgnoreCount = result.getIgnoreCount();
		int qtdFailureCount = result.getFailureCount();
		System.out.println("Tete executado " + qtdRunCount); 
		System.out.println("Teste Ignorado " + qtdIgnoreCount); 
		System.out.println("Teste falharam " + qtdFailureCount);  
	}	
	

}
