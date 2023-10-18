package gestaoDeCalculoDeSalario.calculo.semBonus;

import gestaoDeCalculoDeSalario.calculo.CalculoSalario;
import gestaoDeCalculoDeSalario.model.Funcionario;

/**
 * 
 * @author Maria Beatriz
 *
 *esta classe serve para o calculo de salario sem bonus. A classe implementa a interface 
 *CalculoSalario
 */
public class CalculoSalarioSemBonus implements CalculoSalario{

	/**
	 * metodo calcularSalario que retorna um valor float e calcula
	 * o salario do funcionario, sem bonus.
	 * 
	 * @param funcionario
	 * @return salario
	 */
	public float calcularSalario(Funcionario funcionario){
		return funcionario.getSalario();
	}

}