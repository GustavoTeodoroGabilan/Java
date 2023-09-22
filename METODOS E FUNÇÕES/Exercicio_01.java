package Javiosa;

import java.util.Scanner;

public class Exercicio_01 {
	
	static Scanner entrada = new Scanner (System.in);
	static String nome;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int acomodacao = 0;
		int diaria=0;
		
		System.out.println("Digite seu nome: ");
		nome = entrada.next();
		System.out.println("---------ACOMODAÇÕES----------");
		System.out.println("        1 - Standart          ");
		System.out.println("        2 - Luxo          ");
		System.out.println("        3 - Super Luxo          ");
		System.out.println("------------------------------");
		System.out.println("Digite a acomodação");
		acomodacao = entrada.nextInt();
		while(acomodacao != 1 && acomodacao != 2 && acomodacao != 3) {
			System.out.println("Digite a acomodação valida: ");
			acomodacao = entrada.nextInt();
		}
		System.out.println("Digite a quantidade de diarias");
		diaria = entrada.nextInt();
		
		
		double estadia=estadia(diaria,acomodacao);
		pagamento(estadia);
	}//fecha main
	private static double estadia(int diaria, int acomodacao) {
		
		double estadia=0;
		
		
		if (acomodacao == 1) {
			estadia = diaria*380;
		}else if (acomodacao == 2) {
			estadia = diaria*450;
		}else {
			estadia = diaria*560;
		}
	
		
		return estadia;
	}
	private static void pagamento(double estadia) {
		String pagamento;
		
		System.out.println("Digite a forma de pagamento (a vista - V/ a prazo - P):");
		pagamento = entrada.next();
		
		if(pagamento.equalsIgnoreCase("V")) {
			estadia *= 0.90;
		}
		System.out.println("o senhor(a)"+nome+" deve pagar:" + estadia);
	}
}
