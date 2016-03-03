import java.util.Scanner;

public class salario { 

	private static Scanner input;

	public static void main(String args[]) { 

		input = new Scanner(System.in); 
		double C, F; 
		System.out.print("Digite o seu salario atual: "); 

		C = input.nextInt(); 
		F = C * (23.75 / 100) ; 
		System.out.printf("Seu salario atual ��: %s  >  e foi para %s ." ,C,F+C); 

	} 

} 
