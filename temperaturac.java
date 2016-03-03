import java.util.Scanner;

public class temperaturac { 

	private static Scanner input;

	public static void main(String args[]) { 

		input = new Scanner(System.in); 
		int C, F; 
		System.out.print("Digite o graus em Celsius: "); 
		
		C = input.nextInt(); 
		F = ( 9 * C + 160 ) / 5; 
		System.out.printf("Valor de Celsius %s  >  para Fahrenheit %s ." ,C,F); 

	} 

} 
