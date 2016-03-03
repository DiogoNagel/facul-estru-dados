import java.util.Scanner;

public class aTabuada{
	private static int numeroTabuada = 0;
	private static int tabuadaNumero = 0;

	@SuppressWarnings("resource")
	public static void main(String[] args){
		do {
			Scanner entrada;
			entrada = new Scanner (System.in);

			System.out.println("Digite o numero da tabuada:");
			tabuadaNumero = entrada.nextInt();
			System.out.println("Digite o numero At�� onde a tabuada deve ser multiplicada:");
			numeroTabuada = entrada.nextInt();
			
			for (int i=1;i<=numeroTabuada;i++){
				System.out.println(tabuadaNumero + " x " + i + " = " + tabuadaNumero*i);
			}
		} while (tabuadaNumero < tabuadaNumero);
	}
}
