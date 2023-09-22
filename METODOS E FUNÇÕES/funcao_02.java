package Javiosa;

import java.util.Scanner;

public class funcao_02 {

	static Scanner entrada = new Scanner(System.in);
	static String nome;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dados();
	}
	public static void dados() {
		
		double nota1=0,nota2=0;
		
		System.out.println("Procedimento Dados");
		
		System.out.println("Digite o nome: ");
		nome = entrada.next();
		
		System.out.println("Nota 1: ");
		nota1 = entrada.nextDouble();
		System.out.println("Nota 2: ");
		nota2 = entrada.nextDouble();
		
		//chamada calculo media
		double media=media(nota1,nota2);
		System.out.println("Média: "+media);
	}
	//FUNÇÃO
	public static double media(double nota1,double nota2) {
		
		System.out.println("Função Média");
		
		double media=0;
		media=(nota1+nota2)/2;
		
		
		//Chamada Analise
		analise(media);
		
		return media;
		
		
	}
	
	//PROCEDIMENTO
	public static void analise(double media) {
		
		System.out.println("Procedimento analise");
		
		if(media>=6){
			System.out.println(nome+" - Aprovado");
		}else {
			System.out.println(nome+" - Reprovado");
		}
	}
}
