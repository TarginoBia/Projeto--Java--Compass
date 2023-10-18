package gestaoDeCalculoDeSalario.model;

import gestaoDeCalculoDeSalario.calculo.CalculoSalario;
import gestaoDeCalculoDeSalario.exception.CalculoSalarioException;

/**
 * Classe que representa um funcion�rio com atributos como nome, sal�rio e estrat�gia de c�lculo de sal�rio.
 * 
 * @author Maria Beatriz Targino
 */
public class Funcionario {

	private String nome;
	private float salario;
	private CalculoSalario estrategiaCalculo;

	/**
	 * Obt�m o nome do funcion�rio.
	 * 
	 * @return o nome do funcion�rio
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Define o nome do funcion�rio.
	 * 
	 * @param nome o nome do funcion�rio
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Obt�m o sal�rio do funcion�rio.
	 * 
	 * @return o sal�rio do funcion�rio
	 */
	public float getSalario() {
		return salario;
	}

	/**
	 * Define o sal�rio do funcion�rio. Retorna true se o sal�rio for v�lido e false
	 * caso contr�rio.
	 * 
	 * @param salario o sal�rio do funcion�rio
	 * @return true se o sal�rio for v�lido, false caso contr�rio
	 */
	public boolean setSalario(float salario) {
		if (salario < 0) {
			System.err.println("Erro: O sal�rio n�o pode ser negativo.");
			return false;
		}
		this.salario = salario;
		return true;
	}

	/**
	 * Define a estrat�gia de c�lculo de sal�rio do funcion�rio. A estrat�gia n�o pode
	 * ser nula.
	 * 
	 * @param estrategiaCalculo a estrat�gia de c�lculo de sal�rio
	 */
	public void setEstrategiaCalculo(CalculoSalario estrategiaCalculo) {
		if (estrategiaCalculo != null) {
			this.estrategiaCalculo = estrategiaCalculo;
		} else {
			throw new IllegalArgumentException("A estrat�gia de c�lculo n�o pode ser nula.");
		}
	}

	/**
	 * Calcula o sal�rio do funcion�rio de acordo com a estrat�gia de c�lculo
	 * definida.
	 * 
	 * @return o sal�rio calculado ou 0.0f se nenhuma estrat�gia estiver definida
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

