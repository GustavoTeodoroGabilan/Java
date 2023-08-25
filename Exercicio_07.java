package javanado;

import java.util.Scanner;

public class Exercicio_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		double distancias[][] = new double [5][5];
		String [] cidade = new String[] {"Campinas","Bauru","Sorocaba","Atibaia","Santos"};
		
		double consumoVeiculo=0,qtdCombustivel=0;
		
		
		//Distancia entre cidades
		for(int l=0;l<5;l++) {
			for(int c=0;c<5;c++) {
				//diagonal
				if(l==c) {
					distancias[l][c]=0;
				}else {
					System.out.println("Informe a distância entre a cidade ("+cidade[l]+") e ("+cidade[c]+"):");
					distancias[l][c]=entrada.nextDouble();
				}
				
			}
		}
		System.out.println("");
		System.out.println("Consumo de combustível");
		System.out.println("Informe o consumo do veiculo: ");
		consumoVeiculo=entrada.nextDouble();
		
		
		System.out.println("");
		System.out.println("PERCURSOS INFERIORES A 250 KM");
		
		
		for(int l=0;l<5;l++) {
			for(int c=0;c<5;c++) {
				
				if(distancias[l][c]<=250) {
					System.out.println("Distancia: "+ distancias[l][c]+"\t km - entre cidade ("+cidade[l]+") a ("+cidade[c]+")");
				}
				
			}
		}
		
	}

}
