package projetoMensagem;
import java.util.Scanner;

/**
 * 
 * @author Maria Beatriz Targino
 * 
 * classe main para receber e imprimir uma mensagem e retornar um resultado a partir da quantidade de emoticons usado.
 *
 */
public class MensagemPersonalizada {

	// metodo main
	public static void main(String[] args) {
		//entrada de dados
		Scanner scan = new Scanner(System.in);

		//saida de dados
		System.out.println("Digite uma mensagem: ");
		String mensagem = scan.nextLine();
		scan.close();
		
		// instancia��o da classe Mensagem
		Mensagem message = new Mensagem();

		// Chamando m�todo para contar e exibir o n�mero total de emoticons
		int totalEmoticons = contarEmoticons(mensagem);
		System.out.println("Total de emoticons na mensagem: " + totalEmoticons);

		// Chamando m�todo para contar e exibir o n�mero de emoticons divertidos e irritados
		int qtdDivertido = contarEmoticonsDivertidos(mensagem);
		int qtdIrritado = contarEmoticonsIrritados(mensagem);
		System.out.println("Emoticons divertidos: " + qtdDivertido);
		System.out.println("Emoticons irritados: " + qtdIrritado);

		System.out.println(message.mensagem());
	}

	// M�todo para contar o n�mero total de emoticons na mensagem
	private static int contarEmoticons(String mensagem) {
		int count = 0;
		for (int i = 0; i < mensagem.length() - 1; i++) {
			if (mensagem.charAt(i) == ':' && (mensagem.charAt(i + 1) == '-' || mensagem.charAt(i + 1) == ')')) {
				count++;
			}
		}
		return count;
	}

	// M�todo para contar o n�mero de emoticons divertidos na mensagem
	private static int contarEmoticonsDivertidos(String mensagem) {
		int count = 0;
		for (int i = 0; i < mensagem.length() - 1; i++) {
			if (mensagem.charAt(i) == ':' && mensagem.charAt(i + 1) == ')') {
				count++;
			}
		}
		return count;
	}

	// M�todo para contar o n�mero de emoticons irritados na mensagem
	private static int contarEmoticonsIrritados(String mensagem) {
		int count = 0;
		for (int i = 0; i < mensagem.length() - 1; i++) {
			if (mensagem.charAt(i) == ':' && mensagem.charAt(i + 1) == '(') {
				count++;
			}
		}
		return count;
	}
	
}

