package Javiosa;

import java.util.Scanner;

public class funcao_01 {

	static Scanner entrada = new Scanner (System.in);
	
	//variavel global
	static String nome;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double salario = 0;
		int tempo = 0;
		double reajuste=0, novoSalario=0;
		
		System.out.println("Digite o nome: ");
		nome = entrada.next();
		System.out.println("Digite o tempo de empresa: ");
		tempo = entrada.nextInt();
		System.out.println("Digite o salario: ");
		salario = entrada.nextDouble();
		
		//chamada função
		reajuste=verifica(tempo,salario);
		
		//chamada função calculo
		novoSalario=calculo(reajuste, salario);
		System.out.println("Salario: "+salario+" - Salario Reajustado: "+novoSalario);
		}//main
	
	public static double verifica(int tempo, double salario) {
		
		double reajuste=0;
		
		if(salario<500 && tempo>10) {
			reajuste=0.20;
		}else{
			reajuste=0.10;
		}
		
		return reajuste;
		
	}
	
	public static double calculo(double reajuste, double salario) {
		double novoSalario=0;
		
		novoSalario=salario+(salario*reajuste);
		
		return novoSalario;
	}
}
