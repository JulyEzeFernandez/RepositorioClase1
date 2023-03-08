package claseUnoEjercicioUno;

//Hola profe, realice todo el ejercicio 1 en un solo codigo
//Lo que hice fue mediante if y else ir descartando y dejando al usuario elegir
//Tanto el valor de las variables como que ejercicio realizar
//Los separe mediante lineas de texto para que no se mezclen
//Y en cada caso esta contemplada la posibilidad de que el valor "A" sea el mayor
//asi como que "B" sea mayor que "A"

import java.util.Scanner;

public class EjercicioUno {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a, b, c, d, operacion, par;
		
		System.out.println("Ingrese Primer Numero:");
		a = in.nextInt();
		
		System.out.println("Ingrese Segundo Numero:");
		b = in.nextInt();
		
		System.out.println("Que operacion desea realizar?");
		System.out.println("Presione 1 para mostrar la secuencia entre ellos.");
		System.out.println("Presione 2 para mostrar solo los numeros pares de la secuencia.");
		System.out.println("Presione 3 para elegir entre pares o impares.");
		System.out.println("Presione 4 para mostrar la secuencia invertida.");
		
		operacion = in.nextInt();
		
		//ejercicio "a"
		
		if(operacion == 1){ 
		
		if(a < b) {
			System.out.println("La secuencia entre ambos numeros es:");
		while(a <= b) {
			
		System.out.println(a);
		
		a++;
		}
		}
		else {
			System.out.println("La secuencia entre ambos numeros es:");
		while(b <= a) {
			
		System.out.println(b);
		
		b++;
	}
		}
}
		
		//ejercicio "b"
		
else if(operacion == 2){
	if(a <= b) {
	if(a % 2 == 0) {

		System.out.println("Los numeros pares de la secuencia son:");
		while(a<=b) {
			System.out.println(a);
			a = a + 2;
		}}
		else {
			a = a + 1;
			System.out.println("Los numeros pares de la secuencia son:");
			while(a<=b) {
				System.out.println(a);
				a = a + 2;
			}
		}
	}
	else{
		if(b % 2 == 0) {

			System.out.println("Los numeros pares de la secuencia son:");
			while(b<=a) {
				System.out.println(b);
				b = b + 2;
			}}
			else {
				b = b + 1;
				System.out.println("Los numeros pares de la secuencia son:");
				while(b<=a) {
					System.out.println(b);
					b = b + 2;
				}
			}
		}}
		
		//ejercicio "c"
		
		else if(operacion == 3) {
	if(a<b) {
	System.out.println("Seleccione 1 para numeros pares o 2 para impares:");
	par = in.nextInt();
	if(par == 1) {
		if(a % 2 == 0) {

			System.out.println("Los numeros pares de la secuencia son:");
			while(a<=b) {
				System.out.println(a);
				a = a + 2;
			}}
		else {
			a = a + 1;
			System.out.println("Los numeros pares de la secuencia son:");
			while(a<=b) {
				System.out.println(a);
				a = a + 2;
			}
		}}
	else {
		System.out.println("Seleccione 1 para numeros pares o 2 para impares:");
		par = in.nextInt();
		if(par == 1) {
		System.out.println("Los numeros impares de la secuencia son:");
		if(a % 2 == 1) {
			while(a<=b) {
				System.out.println(a);
				a = a + 2;
			}}
		else {
			a = a + 1;
			System.out.println("Los numeros impares de la secuencia son:");
			while(a<=b) {
				System.out.println(a);
				a = a + 2;
			}
		}}
	}
	}
	else {
		System.out.println("Seleccione 1 para numeros pares o 2 para impares:");
		par = in.nextInt();
		if(par == 1) {
			if(b % 2 == 0) {

				System.out.println("Los numeros pares de la secuencia son:");
				while(b<=a) {
					System.out.println(b);
					b = b + 2;
				}}
			else {
				b = b + 1;
				System.out.println("Los numeros pares de la secuencia son:");
				while(b<=a) {
					System.out.println(b);
					b = b + 2;
				}
			}}
		else {
			System.out.println("Los numeros impares de la secuencia son:");
			if(b % 2 == 1) {
				while(b<=a) {
					System.out.println(b);
					b = b + 2;
				}
				}
			else {
				b = b +1;
				System.out.println("Los numeros impares de la secuencia son:");
				while(b<=a) {
					System.out.println(b);
					b = b +2;
				}
			}
			}
			}
		
}
		
		//Ejercicio "D"
		
		else {
			if(a>b) {
				if(a % 2 == 0) {

					System.out.println("Los numeros pares de la secuencia en forma decreciente son:");
					for(c = a; c>=b; c = c - 2) {
							System.out.println(c);
						}}
					
				else {
					System.out.println("Los numeros pares de la secuencia en forma decreciente son:");
					for(c = a - 1; c>=b; c = c - 2) {
							System.out.println(a);
							}
						}
						}
			else {

				if(b % 2 == 0) {

					System.out.println("Los numeros pares de la secuencia en forma decreciente son:");
					for(d = b; d>=a; d = d - 2) {
							System.out.println(d);
						}}
					
				else {
					System.out.println("Los numeros pares de la secuencia en forma decreciente son:");
					for(d = b - 1; d>=a; d = d - 2) {
							System.out.println(d);
							}
						}
						
			}
				}
			}
			
	}