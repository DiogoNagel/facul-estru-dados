import javax.swing.JOptionPane;

public class valorif {
	public static void main(String args[]){
		float pequenoNumero=0,medioNumero=0,grandeNumero=0;
		float primeiroNumero= Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro n��mero"));
		float segundoNumero= Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo n��mero"));
		float terceiroNumero= Float.parseFloat(JOptionPane.showInputDialog("Digite o terceiro n��mero"));
		if(primeiroNumero>segundoNumero){
			grandeNumero=primeiroNumero;
			pequenoNumero=segundoNumero;
		}
		else{
			grandeNumero=segundoNumero;
			pequenoNumero=primeiroNumero;
		}
		if(grandeNumero>terceiroNumero&&pequenoNumero<terceiroNumero){
			medioNumero=terceiroNumero;
		}
		else{
			if(grandeNumero<terceiroNumero)
			{
				medioNumero=grandeNumero;
				grandeNumero=terceiroNumero;
			}
			else{
				medioNumero=pequenoNumero;
				pequenoNumero=terceiroNumero;
			}
		}

		JOptionPane.showMessageDialog(null, "A sequencia ��: " +pequenoNumero+", " +medioNumero+" e " + grandeNumero);
	}
}
