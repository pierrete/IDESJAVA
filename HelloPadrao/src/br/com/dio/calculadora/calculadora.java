package br.com.dio.calculadora;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		
		//scanner vai pegar o input do usuario e atribuir para uma variável (ele precisa importar o pacote java.util para funcionar)
		
		Scanner scan = new Scanner(System.in);
		
		int a,b;
		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		
		//soma(a,b); recebe as duas variáveis nos parametros
		//atribua a função a uma variavel para retornar o resultado.
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		int multiplicacao = multiplicacao(a,b);
		float divisao = divisao(a,b);
		
		System.out.println("Soma  " + soma);
		System.out.println("Subtração  " + subtracao);
		System.out.println("Multiplicação  " + multiplicacao);
		System.out.println("Divisão  " + divisao);
		
		
}


	
	
	
	//método soma / função soma
	public static int soma(int a,int b) 
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
	
	
	
	
	
	
}
