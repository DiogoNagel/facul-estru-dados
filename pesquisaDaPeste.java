import javax.swing.JOptionPane;

public class pesquisaDaPeste {
	public static void main(String[] args) {
		int canal4 = 0, canal5 = 0, canal7 = 0, canal12 = 0;
		
		int cana1 = 0, npessoas = 0, totalPessoas = 0;	
		cana1 = Integer.parseInt(JOptionPane.showInputDialog("Qual o canal? "));
		npessoas = Integer.parseInt(JOptionPane.showInputDialog("Quanto de pessoas na casa? "));
		while(cana1 != 0){
			if (cana1 == 4) {
				canal4 += npessoas;
			}
			if (cana1 == 5) {
				canal5 += npessoas;
			}
			if (cana1 == 7) {
				canal7 += npessoas;
			}
			if (cana1 == 12) {
				canal12 += npessoas;
			}
			
			totalPessoas += npessoas;
			
			cana1 = Integer.parseInt(JOptionPane.showInputDialog("Qual o canal? "));
			npessoas = Integer.parseInt(JOptionPane.showInputDialog("Quanto de pessoas na casa? "));
		}
		double pcCana14 = canal4*100/totalPessoas;
		double pcCanal5 = canal5*100/totalPessoas;
		double pcCanal7 = canal7*100/totalPessoas;
		double pcCanal12 = canal12*100/totalPessoas;
		
		System.out.println("Canal 4 - "+pcCana14+"%");
		System.out.println("Canal 5 - "+pcCanal5+"%");
		System.out.println("Canal 7 - "+pcCanal7+"%");
		System.out.println("Canal 12 - "+pcCanal12+"%");
	}
}
