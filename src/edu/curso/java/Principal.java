package edu.curso.java;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inicio del programa");
		Calculadora calculadora = new Calculadora();
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese primer número: ");
		
		try {
			System.out.println("Inicio del Try");
			
			Double num1 = teclado.nextDouble();
			
			System.out.println("Ingrese segundo número: ");
			Double num2 = teclado.nextDouble();
			
			Double totalSuma = 0.0;		
			totalSuma = calculadora.sumar(num1, num2);
			System.out.println("La suma es: " + totalSuma);
			
			Double totalResta = 0.0;		
			totalResta = calculadora.restar(num1, num2);
			System.out.println("La resta es: " + totalResta);
			
			Double totalMultiplicacion = 0.0;		
			totalMultiplicacion = calculadora.multiplicar(num1, num2);
			System.out.println("La multiplicación es: " + totalMultiplicacion);
			
			Double totalDivision = 0.0;		
			totalDivision = calculadora.dividir(num1, num2);
			System.out.println("La división es: " + totalDivision);
			
			System.out.println("Fin del Try");
			
		} catch (Exception e) {
			System.out.println("Hay un error general...." + e.getMessage());
			e.printStackTrace();
			
		}finally {
			System.out.println("Listo terminamos");
		}
		
		
		
	}
	
	

}
