package repeticao;

import java.util.Scanner;

public class Aula04_exe02 {

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			int codigo=0, contador=0;
			int cand1=0,cand2=0,cand3=0,cand4=0,cand5=0,cand6=0;

			
			System.out.println("Digite o codigo: ");
			codigo = entrada.nextInt();
			
			while (codigo != 0) {
				switch (codigo){
				
				case 1:
					cand1++;
					break;
				
				case 2:
					cand2++;
					break;
					
				case 3:
					cand3++;
					break;
					
				case 4:
					cand4++;
					break;
					
				case 5:
					cand5++;
					break;
					
				case 6:
					cand6++;
					break;
					
				default:
					System.err.println("Voto invalido");
					contador--;
				}//switch
				
				contador++;
				System.out.println("Digite o codigo: ");
				codigo = entrada.nextInt();
				
			}//while
			
			System.out.println("Candidato 1: "+cand1);
			System.out.println("Candidato 2: "+cand2);
			System.out.println("Candidato 3: "+cand3);
			System.out.println("Candidato 4: "+cand4);
			System.out.println("Votos Nulos: "+cand5);
			System.out.println("Votos Brancos: "+cand6);
			System.out.println("Porcentagem de votos brancos: " + String.format("%.2f", (cand6/contador*100.0)) + "%");
			System.out.println("Porcentagem de votos nulos: " + String.format("%.2f", (cand5/contador*100.0)) + "%");
		}

		
	}

}
