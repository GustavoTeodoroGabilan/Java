package Javiosa;

import java.util.Scanner;

public class metodo_03 {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double media=0;
		String nomeAluno;
		
		System.out.println("Digite um nome: ");
		nomeAluno = entrada.next();
		System.out.println("Digite a média: ");
		media=entrada.nextDouble();
		
		//chamada do procedimento
		//parametro real
		analise(nomeAluno,media);
		
	}//main
	//parametro formal
	public static void analise(String nomeAluno,double media) {
		if(media<=3) {
			System.out.println(nomeAluno+" - DP");
		}else if(media<6){
			System.out.println(nomeAluno+" - Exame");
		}else {
			System.out.println(nomeAluno+" - Aprovado");
		}
	}

}
