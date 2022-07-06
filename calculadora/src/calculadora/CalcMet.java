package calculadora;

import java.util.Scanner;

public class CalcMet {
	//Objetivo dos exerc�cios � CRIAR M�TODOS para o programa.
	public static void main(String[] args) 
	
	{
		//Declarar as vari�veis
		int a,b,soma,subtracao,multiplicacao;
		float divisao;

		//Receber os valores das vari�veis A e B
		System.out.println("Insira o valor de A:		");
		Scanner s1 = new Scanner(System.in);
		a = s1.nextInt();//Converter o valor recebido
		
		System.out.println("Insira o valor de B:		");
		Scanner s2 = new Scanner(System.in);
		b = s2.nextInt();
		
		//Antes de declarar os m�todos,eu preciso atribuir eles � uma vari�vel de mesmo nome
		soma = soma(a,b);
		//Os m�todos usados ficam FORA do m�todo MAIN.
		subtracao = subtracao(a,b);
		multiplicacao = multiplicacao(a,b);
		divisao = divisao(a,b);
		
		
		//Imprimir os resultados usando a vari�vel que cont�m o m�todo a ser chamado.
		//Usei printf e n�o println porque exibe valores concatenados.
		System.out.println("String"+soma+13);
		System.out.printf("String"+soma+"\n"+a);
		System.out.print("String"+soma+"\n");
		System.out.printf("%d%s%d%s",a," e ",b,"\n");
		System.out.printf("%s%d%s","A soma de A e B �	",soma,"\n");
		System.out.printf("%s%d%s","A subtra��o de A e B �	",subtracao,"\n");
		System.out.printf("%s%d%s","A multiplica��o de A e B �	",multiplicacao,"\n");
		System.out.printf("%s%.1f","A divis�o de A e B �	",divisao);
		
		
	}//Fim do Main
	
	//Declarar os m�todos das opera��es Fora da Main
			//M�todos == Fun��es 
	
			private static int soma(int a, int b) 
			{
				return a+b;	
			}
			
			public static int subtracao(int a,int b)
			{
				return a-b;
			}
			
			public static int multiplicacao(int a,int b)
			{
				return a*b;
			}
			
			public static float divisao(float a,float b)
			{
				return a/b;
			}

}//Fim da classe CalcMet
