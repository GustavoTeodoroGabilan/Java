package javanado;

import java.util.Scanner;

public class Exemplo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int num[][] = new int [5][2];
		double val[][] = new double [5][2];
		double totalGeral = 0;
		
		
		for (int i=0;i<5;i++) {
			System.out.println("Digite o codigo:");
			num[i][0]=entrada.nextInt();
			
			System.out.println("Digite o preço: ");
			val[i][0]=entrada.nextDouble();
			
			System.out.println("Digite a qtd: ");
			num[i][1]=entrada.nextInt();
			
			val[i][1]=val[i][0]*num[i][1];
			totalGeral+=val[i][1];
		}
		System.out.println();
		for(int i=0;i<5;i++) {
			System.out.println(num[i][0]+" - "+val[i][0]+" - "+num[i][1]+" - "+val[i][1]);
		}
		System.out.println("Total Geral: "+totalGeral);
	}

}
