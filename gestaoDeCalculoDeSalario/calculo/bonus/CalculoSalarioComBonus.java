package gestaoDeCalculoDeSalario.calculo.bonus;

import gestaoDeCalculoDeSalario.calculo.CalculoSalario;
import gestaoDeCalculoDeSalario.model.Funcionario;

/**
 * 
 * @author Maria Beatriz
 *
 *esta � uma classe que representa a estrategia de calculo do salario com bonus
 *A classe implementa a interface CalculoSalario e implementa o metodo calcularSalario
 *conforme a estrategia (com bonus).
 */
public class CalculoSalarioComBonus implements CalculoSalario{

	/**
	 * Calcula o sal�rio do funcion�rio com b�nus ou desconto, dependendo do valor do
     * sal�rio original.
	 * 
	 * @param funcionario
	 * @return salario do funcionario com ajustes de bonus ou desconto.
	 */
	public float calcularSalario(Funcionario funcionario) {
		float salario = funcionario.getSalario();

		// Verifica se o sal�rio � negativo e trata como uma situa��o excepcional
		if(salario < 0) {
			throw new IllegalArgumentException("O sal�rio n�o pode ser negativo.");
		}
		
		 // Calcula o sal�rio com base na estrat�gia de b�nus
		if (salario <= 1000) {
			return salario + salario * 0.2f; // 20% de bonus
		} else if (salario <= 2000) {
			return salario + salario * 0.1f; // 10% de bonus
		} else {
			return salario + salario * 0.1f * -1; // 10% de desconto
		}
	}
}
