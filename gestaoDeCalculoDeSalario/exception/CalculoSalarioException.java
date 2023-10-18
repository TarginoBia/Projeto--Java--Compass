package gestaoDeCalculoDeSalario.exception;


/**
 * Exce��o personalizada para erros relacionados ao c�lculo de sal�rio.
 * 
 * Esta exce��o pode ser lan�ada quando ocorrerem erros espec�ficos durante o
 * c�lculo de sal�rio de um funcion�rio.
 * 
 * @author Maria Beatriz
 */
public class CalculoSalarioException extends Exception {

	/**
	 * Cria uma inst�ncia de CalculoSalarioException com uma mensagem de erro
	 * espec�fica.
	 * 
	 * @param mensagem a mensagem de erro
	 */
	public CalculoSalarioException(String mensagem) {
		super(mensagem);
	}

	/**
	 * Cria uma inst�ncia de CalculoSalarioException com uma mensagem de erro e uma
	 * causa raiz.
	 * 
	 * @param mensagem
	 * @param causa 
	 */
	public CalculoSalarioException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
}

