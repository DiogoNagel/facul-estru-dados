import javax.swing.JOptionPane;

public class idadeAltura {
	public static void main(String[] args) {

		double media=0;
		double mediaI=0;
		double DigitaIdade=0;
		double DigiteAltura=0;
		double SomaIdade50=0;
		double SomaAltura50=0;
		double ContaIdade=0;
		double ContaAltura=0;

		do{  
			DigitaIdade = Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade"));
			if(DigitaIdade >= 50){
				SomaIdade50+=DigitaIdade;
				ContaIdade++; 
			}
			DigiteAltura = Integer.parseInt(JOptionPane.showInputDialog("Digite a Altura"));


			if(DigitaIdade >= 50){
				SomaAltura50+=DigiteAltura;
				ContaAltura++;
			}
		}while(DigitaIdade != 0);
		mediaI = (SomaAltura50/ContaAltura);
		media = (SomaIdade50/ContaIdade);

		JOptionPane.showMessageDialog(null,"\nSoma das Idades "+SomaIdade50 + "\nQTD digitados "+ContaIdade + "\nMedia das Idades..: "+ media,"Media das Idades >50 = ",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null,"\nSoma das Altura "+SomaAltura50 + "\nQTD digitados "+ContaAltura + "\nMedia das Altura..: "+ mediaI,"Media das Altura >50 = ",JOptionPane.INFORMATION_MESSAGE);
	}
}