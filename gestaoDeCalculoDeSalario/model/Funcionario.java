package gestaoDeCalculoDeSalario.model;

import gestaoDeCalculoDeSalario.calculo.CalculoSalario;
import gestaoDeCalculoDeSalario.exception.CalculoSalarioException;

/**
 * Classe que representa um funcionário com atributos como nome, salário e estratégia de cálculo de salário.
 * 
 * @author Maria Beatriz Targino
 */
public class Funcionario {

	private String nome;
	private float salario;
	private CalculoSalario estrategiaCalculo;

	/**
	 * Obtém o nome do funcionário.
	 * 
	 * @return o nome do funcionário
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Define o nome do funcionário.
	 * 
	 * @param nome o nome do funcionário
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Obtém o salário do funcionário.
	 * 
	 * @return o salário do funcionário
	 */
	public float getSalario() {
		return salario;
	}

	/**
	 * Define o salário do funcionário. Retorna true se o salário for válido e false
	 * caso contrário.
	 * 
	 * @param salario o salário do funcionário
	 * @return true se o salário for válido, false caso contrário
	 */
	public boolean setSalario(float salario) {
		if (salario < 0) {
			System.err.println("Erro: O salário não pode ser negativo.");
			return false;
		}
		this.salario = salario;
		return true;
	}

	/**
	 * Define a estratégia de cálculo de salário do funcionário. A estratégia não pode
	 * ser nula.
	 * 
	 * @param estrategiaCalculo a estratégia de cálculo de salário
	 */
	public void setEstrategiaCalculo(CalculoSalario estrategiaCalculo) {
		if (estrategiaCalculo != null) {
			this.estrategiaCalculo = estrategiaCalculo;
		} else {
			throw new IllegalArgumentException("A estratégia de cálculo não pode ser nula.");
		}
	}

	/**
	 * Calcula o salário do funcionário de acordo com a estratégia de cálculo
	 * definida.
	 * 
	 * @return o salário calculado ou 0.0f se nenhuma estratégia estiver definida
	 */
	public float calcularSalario() {
		if (estrategiaCalculo != null) {
			try {
				return estrategiaCalculo.calcularSalario(this);
			} catch (CalculoSalarioException e) {
				e.printStackTrace();
			}
		}
		return 0.0f;
	}
}

