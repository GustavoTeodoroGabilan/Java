import java.util.Scanner;

public class B_GustavoGabilan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int idade=0, expServ=0, contador=0, semExp=0, comExp=0, contM=0, contS=0, contP=0, contT=0, contD=0, mascExp=0;
		char sexo=0, escol=0, cad=0; 
		double porcCom=0, porcSem=0;
		
		while (contador < 5){
			
			System.out.println("Digite sua idade: ");
			idade = entrada.nextInt();
			System.out.println("Digite seu genero: ");
			sexo = entrada.next().toUpperCase().charAt(0);
			System.out.println("Digite seu nivel de escolaridade: ");
			escol = entrada.next().toUpperCase().charAt(0);
			System.out.println("Possui experiencia no servi�o?");
			expServ = entrada.nextInt();
			
			contador++;
			
			//B)
			if (expServ == 1){
				comExp = expServ + 1;				
			}else{
				if(expServ == 2){
					semExp = expServ + 1;
				}else{
					System.out.println("Experiencia invalida!");
				}//fim else
				
			}//fim else
			
			//C)
			switch (escol){
			case 'M':
				 contM++;
			break;
			case 'S':
				 contS++;
			break;
			case 'P':
				 contP++;
			break;
			case 'T':
				 contT++;
			break;
			case 'D':
				 contD++;
			break;
			default:
				System.out.println("Digito de escolaridade invalido!");
				contador--;
			}//fim escolha
			
			if (sexo == 'M' && expServ == 1){
				mascExp++;
				
			}
			
			
			
		}//fim while
		
		(double)comExp/=contador;
		(double)semExp/=contador;
		
		
		
		System.out.println("A porcentagem de candidatos com experi�ncia no servi�o:" + comExp + "%");
		System.out.println("A porcentagem de candidatos sem experi�ncia no servi�o:" + semExp + "%");
		System.out.println("O numero de candidatos com a escolaridade Medio �: " + contM);
		System.out.println("O numero de candidatos com a escolaridade Superior �: " + contS);
		System.out.println("O numero de candidatos com a escolaridade Pos-gradua��o �: " + contP);
		System.out.println("O numero de candidatos com a escolaridade Mestrado �: " + contT);
		System.out.println("O numero de candidatos com a escolaridade Doutorado �: " + contD);
		
		if(mascExp == 0){
			System.out.println("media de idade � 0");
		}else{
			System.out.println("Media de idade � " + mascExp / idade);
		}
		
		System.out.println("Deseja cadastrar esse usuario?");
		cad = entrada.next().toUpperCase().charAt(0);
		
		if (cad == 'S') {
			System.out.println("Parabens, cadastro feito");
		}else{
			if (cad == 'N'){
				System.out.println("Ok, este ususario n�o sera cadastrado");
			}else{
				System.out.println("Op��o invalida!");
			}
		}
		
		
	}

}
