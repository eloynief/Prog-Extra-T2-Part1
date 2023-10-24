package ejercicios;

import java.util.Scanner;

public class Ej100 {

	public static void main(String[] args) {
		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		int num,divide,centena,decena,millar,unidad;
		
		// nos pide que escribamos un numero en pantalla
		System.out.println("ESCRIBE UN NUMERO");

		// escritura del numero
		num = sc.nextInt();

		//guardamos los valores del millar,centena y decena del numero
		millar=num&10000;

		centena=num&1000;
		
		decena=num&100;
		
		unidad=num&10;
		
		while(decena>9) {
			decena=decena&10;
		}
		while(centena>9) {
			centena=centena&10;
		}
		
		if(num>=0&&num<=9999) {
			
		}
		else {
			System.out.println("El numero no es valido");
		}
		
		//cierre de scanner
		sc.close();


	}

}
