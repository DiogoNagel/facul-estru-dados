import javax.swing.JOptionPane;
public class idadeIdade {

	public static void main(String[] args) {        
		int Faixa1a15=0,Conta1a15=0;       
		int Faixa16a30=0,Conta16a30=0;
		int Faixa31a45=0,Conta31a45=0;
		int Faixa46a60=0,Conta46a60=0;       
		int ContaMaiorQ60=0,FaixaMaiorQ60=0;

		for (int i = 0; i < 15; i++) {

			String EntradaIdade = JOptionPane.showInputDialog("Qual é sua Idade?: "); 
			int IdadeRecebida = Integer.parseInt(EntradaIdade);

			if (IdadeRecebida >=1 && IdadeRecebida <=15){
				Conta1a15++;
			}

			if (IdadeRecebida >=16 && IdadeRecebida <=30){
				Conta16a30++;
			}

			if (IdadeRecebida >=31 && IdadeRecebida <=45){
				Conta31a45++;
			}

			if (IdadeRecebida >=46 && IdadeRecebida <=60){
				Conta46a60++;
			}

			if (IdadeRecebida >=61){
				ContaMaiorQ60++;
			}

		}

		Faixa1a15 = (Conta1a15*100)/15;       
		Faixa16a30 = (Conta16a30*100)/15;
		Faixa31a45 = (Conta31a45*100)/15;
		Faixa46a60 = (Conta46a60*100)/15;       
		FaixaMaiorQ60 = (ContaMaiorQ60*100)/15;               

		JOptionPane.showMessageDialog(null, "De 1 a 15: " + Conta1a15 +"\nDe 16 a 30: " + Conta16a30 + "\nDe 31 a 46: " + Conta31a45 + "\nDe 46 a 60: " + Conta46a60 +  "\nMaior  que 60: " + ContaMaiorQ60 +"\n\nFaixa 1 a 15: " +Faixa1a15 + " %" + "\nFaixa 16 a 30: " +Faixa16a30 + " %" + "\nFaixa 31 a 45: "+Faixa31a45 + " %" + "\nFaixa 46 a 60: " +Faixa46a60 + " %" + "\nAcima de 61: "+FaixaMaiorQ60 +" %", "Faixa Etária",
				JOptionPane.INFORMATION_MESSAGE );


	}
}