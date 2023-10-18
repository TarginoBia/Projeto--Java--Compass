package gestaoDeCalculoDeSalario.exception;


/**
 * Exceção personalizada para erros relacionados ao cálculo de salário.
 * 
 * Esta exceção pode ser lançada quando ocorrerem erros específicos durante o
 * cálculo de salário de um funcionário.
 * 
 * @author Maria Beatriz
 */
public class CalculoSalarioException extends Exception {

	/**
	 * Cria uma instância de CalculoSalarioException com uma mensagem de erro
	 * específica.
	 * 
	 * @param mensagem a mensagem de erro
	 */
	public CalculoSalarioException(String mensagem) {
		super(mensagem);
	}

	/**
	 * Cria uma instância de CalculoSalarioException com uma mensagem de erro e uma
	 * causa raiz.
	 * 
	 * @param mensagem
	 * @param causa 
	 */
	public CalculoSalarioException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
}

