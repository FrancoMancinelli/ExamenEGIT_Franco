package paquete;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {

		
		int n1;
		int n2;
		
		System.out.print("Introduce un número");
		Scanner sc = new Scanner (System.in);
		n1 = sc.nextInt();
		System.out.print("\nIntroduce otro número");
		n2 = sc.nextInt();
		
		sumar(n1, n2);
		restar(n1, n2);
		
		sc.close();
	}

	
	public static void sumar(int n1, int n2) {
		int res = n1+n2;
		System.out.println("La suma de ambos números es: "+res);
	}
	
	public static void restar(int n1, int n2) {
		int res = n1-n2;
		System.out.println("La resta de los numeros es: " +res);
	}
}
