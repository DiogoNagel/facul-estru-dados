import java.util.Scanner;

public class parOuImpar {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner entrada;
		int numero;
		String tipo;

		entrada = new Scanner (System.in);

		System.out.println("Informe o numero a ser testado:");
		numero = entrada.nextInt();

		if(numero % 2 == 0){

			if(numero >= 0){
				tipo = "par";
				System.out.printf("O numero eh %s", tipo);
			}
			else{
				if(numero < 0){
					tipo = "par";
					System.out.printf("O numero eh %s", tipo);
				}
			}
		}
		else{
			if(numero >= 0){
				tipo = "impar";
				System.out.printf("O numero eh %s", tipo);
			}
			else{
				if(numero < 0){
					tipo = "impar";
					System.out.printf("O numero eh %s", tipo);
				}
			}
		}
	}
}