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
		
		// instanciação da classe Mensagem
		Mensagem message = new Mensagem();

		// Chamando método para contar e exibir o número total de emoticons
		int totalEmoticons = contarEmoticons(mensagem);
		System.out.println("Total de emoticons na mensagem: " + totalEmoticons);

		// Chamando método para contar e exibir o número de emoticons divertidos e irritados
		int qtdDivertido = contarEmoticonsDivertidos(mensagem);
		int qtdIrritado = contarEmoticonsIrritados(mensagem);
		System.out.println("Emoticons divertidos: " + qtdDivertido);
		System.out.println("Emoticons irritados: " + qtdIrritado);

		System.out.println(message.mensagem());
	}

	// Método para contar o número total de emoticons na mensagem
	private static int contarEmoticons(String mensagem) {
		int count = 0;
		for (int i = 0; i < mensagem.length() - 1; i++) {
			if (mensagem.charAt(i) == ':' && (mensagem.charAt(i + 1) == '-' || mensagem.charAt(i + 1) == ')')) {
				count++;
			}
		}
		return count;
	}

	// Método para contar o número de emoticons divertidos na mensagem
	private static int contarEmoticonsDivertidos(String mensagem) {
		int count = 0;
		for (int i = 0; i < mensagem.length() - 1; i++) {
			if (mensagem.charAt(i) == ':' && mensagem.charAt(i + 1) == ')') {
				count++;
			}
		}
		return count;
	}

	// Método para contar o número de emoticons irritados na mensagem
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

