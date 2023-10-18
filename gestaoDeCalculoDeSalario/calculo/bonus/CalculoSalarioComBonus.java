package gestaoDeCalculoDeSalario.calculo.bonus;

import gestaoDeCalculoDeSalario.calculo.CalculoSalario;
import gestaoDeCalculoDeSalario.model.Funcionario;

/**
 * 
 * @author Maria Beatriz
 *
 *esta é uma classe que representa a estrategia de calculo do salario com bonus
 *A classe implementa a interface CalculoSalario e implementa o metodo calcularSalario
 *conforme a estrategia (com bonus).
 */
public class CalculoSalarioComBonus implements CalculoSalario{

	/**
	 * Calcula o salário do funcionário com bônus ou desconto, dependendo do valor do
     * salário original.
	 * 
	 * @param funcionario
	 * @return salario do funcionario com ajustes de bonus ou desconto.
	 */
	public float calcularSalario(Funcionario funcionario) {
		float salario = funcionario.getSalario();

		// Verifica se o salário é negativo e trata como uma situação excepcional
		if(salario < 0) {
			throw new IllegalArgumentException("O salário não pode ser negativo.");
		}
		
		 // Calcula o salário com base na estratégia de bônus
		if (salario <= 1000) {
			return salario + salario * 0.2f; // 20% de bonus
		} else if (salario <= 2000) {
			return salario + salario * 0.1f; // 10% de bonus
		} else {
			return salario + salario * 0.1f * -1; // 10% de desconto
		}
	}
}
