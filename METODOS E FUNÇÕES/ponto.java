package Javiosa;

import java.util.Scanner;

public class ponto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		String [] produto = new String [] {"Notebook", "Computadores", "Tablets", "Servidores"};
		int quant [][] = new int [7][4];
		int melhorLinha=0, piorLinha=0;
		
		for(int c=0;c<4;c++) {
			System.out.println("Linha de Produtos: " + produto[c]);
			for(int l=0;l<4;l++) {
				System.out.print("Vendas "+(l+1)+"° TRI: ");
				quant [c][l] = entrada.nextInt();
			}
		}
		//A)
		System.out.println("-----------------------------------------");
		System.out.println("Quantidade de Produtos vendidos por linha");
		for(int c=0;c<4;c++) {
			for(int l=0;l<4;l++) {
				quant[4][c] += quant[c][l];
				
			}
			System.out.println("Produto: "+produto[c]+": "+quant[4][c]);
			
		}
		System.out.println("-----------------------------------------");
		
		//B)
		System.out.println("-----------------------------------------");
		System.out.println("Quantidade de Produtos vendidos por Trimestre");
		for(int l=0;l<4;l++) {
			for(int c=0;c<4;c++) {
				quant[5][l] += quant[c][l];
			}
			System.out.println("Produto "+produto[l]+": "+quant[5][l]);
			
		}
		
		//C)
		System.out.println("-----------------------------------------");
		System.out.println("Melhor e pior linha de produtos");
		for(int i=0;i<4;i++) {
			if(melhorLinha == 0) {
				melhorLinha = quant[4][i];
			}else {
				if(quant[4][i]>melhorLinha) {
					melhorLinha = quant[4][i];
				}
			}
		}
	}

}
