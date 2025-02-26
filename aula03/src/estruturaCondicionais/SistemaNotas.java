package estruturaCondicionais;

import java.util.Scanner;

public class SistemaNotas {

	public static void main(String[] args) {
	//Calculule  média de um aluno e diga se ele foi:
	// - Recuperação 5 a 6.9
	// - Exame  3 a 4.9 
	// - Medifinal + EXAME/2	
	// - Aprovado - 7 a 10
	// - Reprovado 0 a 6.9
		
   Scanner sc = new Scanner(System.in);
   System.out.println("Digite a primeira nota: ");
   double nota1 = sc.nextDouble();
   System.out.println("Digite a segunda nota: ");
   double nota2 = sc.nextDouble();
   
   double media = (nota1 + nota2) /2;
   
   System.out.println("A sua média foi de:" + media);
   
   if (media >=7) {
	   System.out.println("Aprovado");
   }
   else if (media >= 5) {
	   System.out.println("Recuperação"); 
   }   
 
   System.out.println("Exame");
   System.out.println("Digite a nota para calcular se ficou de exame: ");
   double notaexame = sc.nextDouble();
   
   double mediaExame = (notaexame + media ) /2;
   media = (notaexame + media) /2
   if (mediaExame <= 4.9) {
	   
	}
		   
   else{
		System.out.println("Reprovado");
		     
   }  
   
   sc.close();
	}

}
