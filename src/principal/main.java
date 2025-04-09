package principal;

import entidade.ContaBancaria;

public class main {
   private String Titular;
   private double saldo;

	
	public static void main(String[] args) {
		ContaBancaria joao = new ContaBancaria("João",1000);
		
		System.out.println("Titular" + joao.getTitular());
		System.out.println("Saldo" + joao.getSaldo());	
		
	    joao.setTitular("João Kleber");
	    joao.depositar(500);
	    joao.depositar(1000);
	    joao.depositar(50);
	    
	    joao.sacar(50);
	    joao.sacar(-50);


	 	System.out.println(joao.toString());
	
	}

}
