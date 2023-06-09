package repeticao;

import java.util.Scanner;

public class Aula04_exe04 {

	public static void main(String[] args) {
		
		try (Scanner entrada = new Scanner(System.in)) {
			int count50 = 0;
			int countBlue = 0;
			int countRedNotBlue = 0;
			int sumAge = 0;
			int countHeight = 0;			
			float altura ;
			
			
			
			for (int i=0; i<10; i++) {			
				System.out.println("Digite sua idade: ");
				int idade = entrada.nextInt();
				
				System.out.print("Altura (em centimetros): ");
				 altura = entrada.nextFloat();
				
				System.out.println("Digite seu Peso (Inteiro): ");
				float peso = entrada.nextFloat();
				
				System.out.println("Digite a cor do seu cabelo: ");
				char cabelo = entrada.next().charAt(0);
				
				System.out.println("Digite a cor do seu olho: ");
				char olho = entrada.next().charAt(0);
				
				if(idade>50 && peso<60) {
					count50++;
				}
				
				if(altura<1.5) {
					sumAge += idade;
					countHeight++;
				}
				
				if(olho == 'A') {
					countBlue++;
				}
				
				if(cabelo == 'R' && olho != 'A') {
					countRedNotBlue++;
				}						
			}
			
			double porcentagemIdadeAltura = countHeight == 0 ? 0 : (double) sumAge/countHeight;			
			double porcentagemOlhosAzuis = countBlue * 100/10.0; 
			
			System.out.println("Quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 kg: " + count50);
			System.out.println("Média das idades das pessoas com altura inferior a 1,50 m: " + porcentagemIdadeAltura);
			System.out.println("Porcentagem de pessoas com olhos azuis: " + porcentagemOlhosAzuis + "%");
			System.out.println("Quantidade de pessoas ruivas e que não possuem olhos azuis: " + countRedNotBlue);			
		}
	}

}