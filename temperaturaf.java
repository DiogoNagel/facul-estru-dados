import java.io.*;
import java.io.InputStreamReader;

public class temperaturaf {
	public static void main (String args []) {
		BufferedReader entrada;
		System.out.println("Informe o Valor em Fahrenheit");
		entrada = new BufferedReader (new InputStreamReader(System.in));
		try {
			float F = Float.parseFloat(entrada.readLine());
			float C = (float) ((F - 32) / 1.8);
			System.out.println("Valor em Celsius: " + C);
		} catch (NumberFormatException e) {
			System.err.println("Número digitado é inválido.");
		} catch (IOException ex) {
			System.err.println("Erro ao ler o valor digitado.");
		}
	}
} 