package javanado;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		DecimalFormat numF = new DecimalFormat("#,##0.00");

		String[] prod = new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L" };
		String[] loja = new String[] { "V", "W", "X", "Y", "Z" };
		double[][] preco = new double[12][5];
		double valorMaior = 0, valorMenor = 0 ;
		int	produtoMaior = 0, produtoMenor = 0, lojaMaior = 0, lojaMenor = 0;
		
		
		
		
		
		
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 5; j++) {
				preco[i][j] = (double) (Math.random() * 200);
				
				
				if(i==0 && j==0) {
					
					valorMaior=preco[i][j];
					produtoMaior=i;
					lojaMaior=j;
					
					
					valorMenor=preco[i][j];
					produtoMenor=i;
					lojaMenor=j;
					
				}else {
					if(preco[i][j]>valorMaior) {
						valorMaior=preco[i][j];
						produtoMaior=i;
						lojaMaior=j;
					}
					if(preco[i][j]<valorMenor) {
						valorMenor=preco[i][j];
						produtoMenor=i;
						lojaMenor=j;
						
					}
				}
			}
		}
		System.out.println("");
		System.out.println("MATRIZ PREÇOS");
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println(numF.format(preco[i][j]) + "\t");
			}
			System.out.println("");
	}
	System.out.println("");	
	System.out.println("Maior e Menor Valor");
	System.out.println("--------------------------------");
	System.out.println("Produto mais barato:"+prod[produtoMenor]);
	System.out.println("Loja:"+loja[lojaMenor]);
	System.out.println("Preço:"+numF.format(valorMenor));
	System.out.println("--------------------------------");
	System.out.println("Produto mais caro:"+prod[produtoMaior]);
	System.out.println("Loja:"+loja[lojaMaior]);
	System.out.println("Preço:"+numF.format(valorMaior));
	}

}
