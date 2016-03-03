import java.util.Scanner;

public class salarioProfessora { 

	private static Scanner input;

	public static void main(String args[]) { 

		input = new Scanner(System.in); 
		double C, F, E, W, Q; 

		System.out.print("Digite o numero de horas trabalhada: "); 
		C = input.nextInt(); 

		System.out.print("Digite o valor das horas trabalhada: "); 
		F = input.nextInt(); 
		
		System.out.print("Digite o valor do INSS em PORCENTAGEM: "); 
		E = input.nextInt(); 
		
		W = C * F ; 
		Q = W - (W * (E / 100.0));
		
		System.out.printf("Seu salario liquido é: %s  >  Você trabalhou: %s horas >  seu valor por hora: %s >  e seu INSS: %s " ,Q ,C, F, E); 

	} 

} 
