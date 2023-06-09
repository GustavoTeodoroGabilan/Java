import java.util.Scanner;
public class teste {

	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int idade=0, contador=0, quantId=0, quantAl=0;
		double altura=0, peso=0, somaAltura=0, pesoMenor=0;
		
		while (contador<3){
			System.out.println("Digite sua idade: ");
			idade = entrada.nextInt();
			System.out.println("Digite sua altura: ");
			altura = entrada.nextDouble();
			System.out.println("Digite seu peso: ");
			peso = entrada.nextDouble();
			
			contador++;
			
			if (idade>50){
				quantId++;
			}//if
			if (idade>10 && idade<20){
				quantAl++;
				somaAltura+=altura;
			}//if
			if(peso<40) {
				pesoMenor++;
			}//if
		}//while
		System.out.println("Quantidade de pessoas com idade > 50: " + quantId);
		
		if (quantAl == 0){
			System.out.println("Media das alturas:0");
		} else {
			System.out.println("Media de altura:" + quantAl / altura);
		}
		System.out.println("Porcentagem de peso inferior 40:" + (pesoMenor/3)*100);
		
		
		
		
		
		
		
		

	}

}
