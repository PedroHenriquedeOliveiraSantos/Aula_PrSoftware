package entidade;

public class ContaBancaria {
	public String titular;
	public double saldo;
	public ContaBancaria(String titular, double saldo) {
    this.titular= titular;
    this.saldo= saldo;
	}
	
	
	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		} else  {
			System.out.println("Valor inválido");
		}
			
	}
	
	public void sacar(double valor) {
		if (valor > 0) {
			this.saldo -= valor;
		} else  {
			System.out.println("Valor inválido, digite apenas o valor a ser sacado");
		}
			
	}
    
	
	@Override
	public String toString() {
		return "Titular: " + titular + "\nSaldo: R$" + saldo + "";
	}
	
	
}
