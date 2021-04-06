package application;

import java.util.Scanner;

public class Ex01EstruturaCondicional {
	
	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		int num = tc.nextInt();
		
		if(num < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NAO NEGATIVO");			
		}
		
		tc.close();
	}
}
