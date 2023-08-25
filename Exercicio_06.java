package javanado;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat moeda = new DecimalFormat("#,##0.00");
		
		String[] produtos = new String[] {"Camisa","Blusa","Calça","Vestido","Meia"};
		double custo [] = new double[] { 10,15,20,10,5};
		
		
		double[][] precos = new double [5][4];
		double[][] impostos = new double [5][4];
		
		double precoFinal = 0;
		
		
		for(int l=0;l<5;l++) {
			System.out.println("Informe o preço do produto: "+produtos[l]);
			for(int c=0;c<4;c++) {
				System.out.print("Preço do produto na loja "+(c+1)+":");
				precos[l][c]=entrada.nextDouble();
				
				//VERIFICAR IMPOSTO (ENCADEADA)
				if(precos[l][c]<=50) {
					impostos[l][c]=precos[l][c]*0.05;
				}else 
					if((precos[l][c]>50)&&(precos[l][c]<=100)){
						impostos[l][c]=precos[l][c]*0.10;
					}else {
						impostos[l][c]=precos[l][c]*0.20;
					}
			}	
			
			}	//for	
		System.out.println("");
		System.out.println("-------------Relatorio Final--------------");
		//Relatorio
		for(int l=0;l<5;l++) {
			System.out.println("Nome do produto: "+ produtos[l]+" - Custo Transp: "+custo[l]);
			for(int c=0;c<4;c++) {
				System.out.println("Loja: "+(c+1));
				System.out.println("Imposto: "+moeda.format(impostos[l][c]));
				System.out.println("Preço: "+moeda.format(precos[l][c]));
				precoFinal = precos[l][c]+impostos[l][c]+custo[l];
				System.out.println("Preço Final: "+ moeda.format(precoFinal));
				System.out.println("------------------------------------");
			}
		}
	}
}	