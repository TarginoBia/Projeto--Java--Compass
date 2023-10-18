package gestaoDeCalculoDeSalario.calculo;

import gestaoDeCalculoDeSalario.exception.CalculoSalarioException;
import gestaoDeCalculoDeSalario.model.Funcionario;

/**
 * 
 * @author Maria Beatriz
 *
 *Interface que define o contrato para o cálculo de salário de um funcionário.
 * As classes que implementarem esta interface devem sobrescrever o método
 * calcularSalario.
 */

public interface CalculoSalario {
	/**
	 * Calcula o salário de um funcionário de acordo com a estratégia específica
     * implementada.
     * 
     * @param funcionario
     * @return o salário calculado 
     * @throws CalculoSalarioException se ocorrer um erro durante o cálculo do
     *                                salário 
	 */
	float calcularSalario(Funcionario funcionario) throws CalculoSalarioException;
}


