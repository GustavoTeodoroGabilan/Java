package repeticao;

import java.util.Scanner;

public class Aula04_exe03 {

	public static void main(String[] args) {

		
		try (Scanner entrada = new Scanner(System.in)) {
			int cont4 = 1, cont5 = 1, cont7 = 1, cont12 = 1;
			int numero = 0, totNumero = 0, canal = 0;
		
			
			System.out.println("Digite o numero do canal: ");
			canal = entrada.nextInt();
			
			while (canal != 0) {
				while (canal != 4 && canal != 5 && canal != 7 && canal != 12) {
					System.out.println("Digite o numero do canal correto: ");
					canal = entrada.nextInt();
				}//while 2
				
				switch (canal) {
				
				case 4 :
					System.out.println("Digite numero de pessoas: ");
					numero = entrada.nextInt();
					cont4 = cont4+numero;
					break;
					
				case 5 :
					System.out.println("Digite numero de pessoas: ");
					numero = entrada.nextInt();
					cont7 = cont7+numero;
					break;
					
				case 7 :
					System.out.println("Digite numero de pessoas: ");
					numero = entrada.nextInt();
					cont7 = cont7+numero;
					break;
				case 12 :
					System.out.println("Digite numero de pessoas: ");
					numero = entrada.nextInt();
					cont12 = cont12+numero;
					break;
				}//switch
				
				totNumero = totNumero + numero;
				
				System.out.println("Digite o numero do canal: ");
				canal = entrada.nextInt();
			}//while 1
			
			System.out.println("Canal 4: " + String.format("%.2f", (cont4*100.0/totNumero)) + "%");
			System.out.println("Canal 5: " + String.format("%.2f", (cont5*100.0/totNumero)) + "%");
			System.out.println("Canal 7: " + String.format("%.2f", (cont7*100.0/totNumero)) + "%");
			System.out.println("Canal 12: " + String.format("%.2f", (cont12*100.0/totNumero)) + "%");
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
