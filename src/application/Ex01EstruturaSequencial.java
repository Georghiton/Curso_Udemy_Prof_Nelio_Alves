package application;

import java.util.Scanner;

public class Ex01EstruturaSequencial {
	
	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
				
		int a, b;
		
		System.out.print("Digite o primeiro numero: ");
		a = tc.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		b = tc.nextInt();
		
		System.out.printf("O resultado de %d + %d = %d", a, b, a + b);
		
		tc.close();
	}

}
