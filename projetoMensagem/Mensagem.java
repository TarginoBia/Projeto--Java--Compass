package projetoMensagem;

/**
 * 
 * @author Maria Beatriz Targino
 * 
 * Esta classe ser� usada para imprimir uma mensagem e retornar� se os emoticons usados nessa mensagem s�o do tipo
 * divertido, irritado ou neutro. Nesta classe, temos duas vari�veis que ir�o contar a quantidade de emojis divertidos e 
 * irritados. Al�m disso, um m�todo para comparar e retornar uma mensagem de acordo com a quantidade de emoticons.
 *
 */
public class Mensagem {
	
	// variaveis para contabilizar emoticons divertido e irritado
	int qtdDivertido = 0;
	int qtdIrritado = 0;
	
	/**
	 * metodo para comparar a quantidade de emoticons e retornar uma mensagem
	 * @return neutral caso a quantidade de emoticons divertido e irritado sejam iguais;
	 * @return fun casos a quantidade de emoticons seja maior que a quantidade de emoticons irritado
	 * @return upset caso n�o seja nenhum dos casos acima.
	 */
	public String mensagem() {		
		if (qtdDivertido == qtdIrritado) {
			return "neutral";
		} else if (qtdDivertido > qtdIrritado) {
			return "fun";
		} else {
			return "upset";
		}
	}

}
