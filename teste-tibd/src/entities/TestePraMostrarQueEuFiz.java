package entities;
import java.util.Scanner;
public class TestePraMostrarQueEuFiz {
	public static void seila() {
		System.out.println("Como eu ja usei o eclipse foi bem tranquilo de fazer, obrigado nelio alves");
	}
	public static void main(String[] args) {
		//declaracao de variaveis
		Scanner sc = new Scanner(System.in);
		int num1, num2, soma; 
		//leituras
		System.out.println("Digite um numero");
		num1 = sc.nextInt();
		System.out.println("Digite outro numero");
		num2 = sc.nextInt();
		//somar
		soma = num1 + num2;
		//mostrar na tela
		System.out.println("Soma:" + soma);
		
		sc.close();
	}
}
