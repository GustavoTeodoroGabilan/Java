package Javiosa;

import java.util.Scanner;

public class metodos {
	
	 static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Chamada do procedimento
		operacao();
		
		
	}//fecha main
	
	//metodoso
	
	//PROCEDIMENTO NÃO TEM RETORNO
	public static void operacao() {
		
		
		
		//variavel local, so pode ser usada dentro do metodo
		int num=0;
		System.out.println("Digite um número:");
		num = entrada.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Par");
		}else {
			System.out.println("Impar");
		}
	}
}
