package calculadora;

import java.util.Scanner;

public class CalcMet {
	//Objetivo dos exercícios é CRIAR MÉTODOS para o programa.
	public static void main(String[] args) 
	
	{
		//Declarar as variáveis
		int a,b,soma,subtracao,multiplicacao;
		float divisao;

		//Receber os valores das variáveis A e B
		System.out.println("Insira o valor de A:		");
		Scanner s1 = new Scanner(System.in);
		a = s1.nextInt();//Converter o valor recebido
		
		System.out.println("Insira o valor de B:		");
		Scanner s2 = new Scanner(System.in);
		b = s2.nextInt();
		
		//Antes de declarar os métodos,eu preciso atribuir eles á uma variável de mesmo nome
		soma = soma(a,b);
		//Os métodos usados ficam FORA do método MAIN.
		subtracao = subtracao(a,b);
		multiplicacao = multiplicacao(a,b);
		divisao = divisao(a,b);
		
		
		//Imprimir os resultados usando a variável que contém o método a ser chamado.
		//Usei printf e não println porque exibe valores concatenados.
		System.out.println("String"+soma+13);
		System.out.printf("String"+soma+"\n"+a);
		System.out.print("String"+soma+"\n");
		System.out.printf("%d%s%d%s",a," e ",b,"\n");
		System.out.printf("%s%d%s","A soma de A e B é	",soma,"\n");
		System.out.printf("%s%d%s","A subtração de A e B é	",subtracao,"\n");
		System.out.printf("%s%d%s","A multiplicação de A e B é	",multiplicacao,"\n");
		System.out.printf("%s%.1f","A divisão de A e B é	",divisao);
		
		
	}//Fim do Main
	
	//Declarar os métodos das operações Fora da Main
			//Métodos == Funções 
	
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
