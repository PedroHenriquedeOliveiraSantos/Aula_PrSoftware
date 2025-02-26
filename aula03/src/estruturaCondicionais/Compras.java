package estruturaCondicionais;

import java.util.Scanner;

public class Compras {

	public static void main(String[] args) {
		//Switch Case
		// Maquína de Cartão
		
		// Metodo de pagamento
		// 1 - Dinheiro/Pix - 10%
		// 2 - Débito - 5% de desconto
		// 3 - Crédito - Valor Total
		
		//Metodos de Parcelamento
		// 1- A vista = Valor Total
		// 2- 2x - 5% de juros
		// 3- 3x 10% de juros
		
		// Valor da compra 
        
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Informe o valor da sua compra R$: ");
		double valorCompra = sc.nextDouble();
		
		System.out.println("Metodos de Pagamento");
		System.out.println("1 - Dinheiro/Pix");
		System.out.println("2 - Debito");
		System.out.println("3 - Credito");
		int metodoPagamento = sc.nextInt();
		
		switch (metodoPagamento) {
		
		case 1:
			double valorFinal =  valorCompra * 0.9;
			System.out.println("Sua compra ficou R$" + valorFinal);
		    break;
		case 2:
			 valorFinal = valorCompra * 0.95;
			System.out.println("Sua compra ficou R$" + valorFinal);
		    break;
		case 3:
			System.out.println("Metodo Parcelamento");
			System.out.println("1 - A vista");
			System.out.println("2 - 2x, 5% de juros");
			System.out.println("3 - 3x, 10% de juros");
			int metodoParcelamento = sc.nextInt();
			
			switch (metodoParcelamento) {		
		case 1 :
            System.out.println("Sua compra ficor R$" +  valorCompra);
			break;
			
		case 2 :
			 valorFinal = valorCompra + 1.05;
			System.out.println("Sua compra ficor R$" +  valorFinal);
			break;
		case 3:
			valorFinal = valorCompra * 1.1;
			System.out.println("Sua compra ficou R$" + valorFinal);
			break;
		
			}

		default:
			System.out.println("Opção Inválida");	
			break;
		
		
			
		
		}
		sc.close();
		
		}
}

