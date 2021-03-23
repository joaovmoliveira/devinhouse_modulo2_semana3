package br.com.devinhouse.folhapagamento.funcionarios;

import br.com.devinhouse.utils.Utilitario;

public class FuncionarioAssalariado extends Funcionario {
	private double salario;
	
	public FuncionarioAssalariado(String nome, String sobreNome, double salario) {
		super(nome, sobreNome);
		this.salario = Utilitario.validarValorPositivo(salario);
	}

	public void setSalario(double salario) {
		this.salario = Utilitario.validarValorPositivo(salario);
	}

	@Override
	public double calcularSalarioMensal() {
		return this.salario;
	}
	
	@Override
	public String toString() {
		return String.format("%s%n%s: R$%.2f", super.toString(), "Salário mensal", this.salario);
	}
	
}
