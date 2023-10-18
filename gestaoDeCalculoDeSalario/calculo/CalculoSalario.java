package gestaoDeCalculoDeSalario.calculo;

import gestaoDeCalculoDeSalario.exception.CalculoSalarioException;
import gestaoDeCalculoDeSalario.model.Funcionario;

/**
 * 
 * @author Maria Beatriz
 *
 *Interface que define o contrato para o c�lculo de sal�rio de um funcion�rio.
 * As classes que implementarem esta interface devem sobrescrever o m�todo
 * calcularSalario.
 */

public interface CalculoSalario {
	/**
	 * Calcula o sal�rio de um funcion�rio de acordo com a estrat�gia espec�fica
     * implementada.
     * 
     * @param funcionario
     * @return o sal�rio calculado 
     * @throws CalculoSalarioException se ocorrer um erro durante o c�lculo do
     *                                sal�rio 
	 */
	float calcularSalario(Funcionario funcionario) throws CalculoSalarioException;
}


