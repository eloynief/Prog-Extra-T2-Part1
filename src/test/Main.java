package test;

import java.util.Scanner;

public class Main {

	
	
	
	public static void main(String[] args) {
		

		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		int num;

		// nos pide que escribamos un numero en pantalla
		System.out.println("ESCRIBE UN NUMERO");

		// escritura del numero
		num = sc.nextInt();

		
		
		while (num>10) num++;
		
		for(int i=0;i<10;i++) System.out.println(i);
		
		//cierre de scanner
		sc.close();
		
	}

}
