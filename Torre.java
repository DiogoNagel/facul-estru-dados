package quinta.estrutura.dados;

import javax.swing.JOptionPane;

public class Torre {

	public static void main(String[] args) {

		int[] pilha1 = new int[]{3, 2, 1};
		int[] pilha2 = new int[]{0, 0, 0};
		int[] pilha3 = new int[]{0, 0, 0};

		JOptionPane.showMessageDialog(null,
				"       O objetivo do jogo é mover, um por um,\n        "
						+ "     os 3 números da pilha 1 à pilha 3,\n            "
						+ "     tendo em consideração que um número \n          "
						+ "     nunca pode vir depois que outro \n              "
						+ "     número menor que ele mesmo.", "Torre de Hanói   ",
						JOptionPane.INFORMATION_MESSAGE);

		escolhasDasPilhas(pilha1, pilha2, pilha3);

		if (isGanho(pilha3)) {
			JOptionPane.showMessageDialog(null, "Parabéns você conseguiu jovem!");
		}
	}

	private static void escolhasDasPilhas(int[] pilha1, int[] pilha2, int[] pilha3) {
		int escolha;
		do {
			Object[] opcoes = {"Pilha 1", "Pilha 2", "Pilha 3", "Reiniciar", "Sair"};

			String mensagem;
			boolean continuar = false;
			int numeroMovido = 0;

			do {
				mensagem = String.format("%s\n"
						+ "Retirar número de qual pilha?", imprimePilhas(pilha1, pilha2, pilha3));

				escolha = JOptionPane.showOptionDialog(null, mensagem, "Torre de Hanói",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
						null, opcoes, opcoes[0]);

				switch (escolha) {
				case 0:
					if (!isVazia(pilha1)) {
						numeroMovido = guardarUltimo(pilha1);
						removeUltimo(pilha1);
						continuar = true;
					} else {
						JOptionPane.showMessageDialog(null, "A pilha está vazia!", "Erro", JOptionPane.ERROR_MESSAGE);
					}
					break;
				case 1:
					if (!isVazia(pilha2)) {
						numeroMovido = guardarUltimo(pilha2);
						removeUltimo(pilha2);
						continuar = true;
					} else {
						JOptionPane.showMessageDialog(null, "A pilha está vazia!", "Erro", JOptionPane.ERROR_MESSAGE);
					}
					break;
				case 2:
					if (!isVazia(pilha3)) {
						numeroMovido = guardarUltimo(pilha3);
						removeUltimo(pilha3);
						continuar = true;
					} else {
						JOptionPane.showMessageDialog(null, "A pilha está vazia!", "Erro", JOptionPane.ERROR_MESSAGE);
					}
					break;
				case 3:
					resetar(pilha1, 3, 2, 1);
					resetar(pilha2, 0, 0, 0);
					resetar(pilha3, 0, 0, 0);
					JOptionPane.showMessageDialog(null, "Reiniciado");
					break;
				case 4:
					JOptionPane.showMessageDialog(null, "Desistiu? Seu fraco!");
					break;
				}
			} while (!continuar && escolha != 4);

			continuar = false;

			while (!continuar && escolha != 4) {
				mensagem = String.format("%s\n"
						+ "Número removido: %d\n\n"
						+ "Adicionar número a qual pilha?", imprimePilhas(pilha1, pilha2, pilha3), numeroMovido);

				escolha = JOptionPane.showOptionDialog(null, mensagem, "Torre de Hanói",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
						null, opcoes, opcoes[0]);

				switch (escolha) {
				case 0:
					if (numeroMovido < guardarUltimo(pilha1) || isVazia(pilha1)) {
						adicionaPilha(numeroMovido, pilha1);
						continuar = true;
					} else {
						JOptionPane.showMessageDialog(null, "Número na pilha é menor!", "Erro", JOptionPane.ERROR_MESSAGE);
					}
					break;
				case 1:
					if (numeroMovido < guardarUltimo(pilha2) || guardarUltimo(pilha2) == 0) {
						adicionaPilha(numeroMovido, pilha2);
						continuar = true;
					} else {
						JOptionPane.showMessageDialog(null, "Número na pilha é menor!", "Erro", JOptionPane.ERROR_MESSAGE);
					}
					break;
				case 2:
					if (numeroMovido < guardarUltimo(pilha3) || guardarUltimo(pilha3) == 0) {
						adicionaPilha(numeroMovido, pilha3);
						continuar = true;
					} else {
						JOptionPane.showMessageDialog(null, "Número na pilha é menor!", "Erro", JOptionPane.ERROR_MESSAGE);
					}
					break;
				case 3:
					resetar(pilha1, 3, 2, 1);
					resetar(pilha2, 0, 0, 0);
					resetar(pilha3, 0, 0, 0);
					JOptionPane.showMessageDialog(null, "Reiniciando");
					continuar = true;
					break;
				case 4:
					JOptionPane.showMessageDialog(null, "Saindo");
					break;
				}
			}

		} while (!isGanho(pilha3) && escolha != 4);
	}

	private static boolean isGanho(int[] pilha3) {
		return (pilha3[0] == 3 && pilha3[1] == 2 && pilha3[2] == 1);
	}

	private static int[] adicionaPilha(int valor, int[] pilha) {
		if (!isCheia(pilha)) {
			int contador = 0;
			while (pilha[contador] != 0) {
				contador++;
			}
			pilha[contador] = valor;
		}
		return pilha;
	}

	private static int[] removeUltimo(int[] pilha) {
		for (int i = pilha.length - 1; i >= 0; i--) {
			if (pilha[i] != 0) {
				pilha[i] = 0;
				break;
			}
		}
		return pilha;
	}

	private static int guardarUltimo(int[] pilha) {
		int ultimo = 0;
		for (int i = pilha.length - 1; i >= 0; i--) {
			if (pilha[i] != 0) {
				ultimo = pilha[i];
				break;
			}
		}
		return ultimo;
	}

	private static String imprimePilha(int[] pilha) {
		StringBuilder sb = new StringBuilder("");

		sb.append("[");
		for (int i = 0; i < pilha.length; i++) {
			sb.append(pilha[i]);
			if (i + 1 != pilha.length) {
				sb.append(", ");
			}
		}

		sb.append("]");

		return sb.toString();
	}

	private static String imprimePilhas(int[] pilha1, int[] pilha2, int[] pilha3) {
		StringBuilder sb = new StringBuilder("");

		sb.append("Pilha 1:\n");
		sb.append(imprimePilha(pilha1)).append("\n");
		sb.append("Pilha 2:\n");
		sb.append(imprimePilha(pilha2)).append("\n");
		sb.append("Pilha 3:\n");
		sb.append(imprimePilha(pilha3)).append("\n");

		return sb.toString();
	}

	private static boolean isVazia(int[] pilha) {
		return (pilha[0] == 0);
	}

	private static boolean isCheia(int[] pilha) {
		return (pilha[pilha.length - 1] != 0);
	}

	private static int[] resetar(int[] pilha, int valor1, int valor2, int valor3) {
		while (!isVazia(pilha)) {
			removeUltimo(pilha);
		}
		if (valor1 != 0) {
			adicionaPilha(valor1, pilha);
			if (valor2 != 0) {
				adicionaPilha(valor2, pilha);
				if (valor3 != 0) {
					adicionaPilha(valor3, pilha);
				}
			}
		}

		return pilha;
	}
}
