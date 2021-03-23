package br.com.devinhouse.folhapagamento.funcionarios;

import br.com.devinhouse.utils.Utilitario;

public class FuncionarioHorista extends Funcionario {
	private double salarioHora;
	private int horaTrabalhada;
	
	public FuncionarioHorista(String nome, String sobreNome, double salarioHora, int horaTrabalhada) {
		super(nome, sobreNome);
		this.salarioHora = Utilitario.validarValorPositivo(salarioHora);
		this.horaTrabalhada = (int) Utilitario.validarValorPositivo(horaTrabalhada);
	}
	
	public double getSalarioHora() {
		return salarioHora;
	}

	public void setSalarioHora(double salarioHora) {
		this.salarioHora = Utilitario.validarValorPositivo(salarioHora);
	}

	public int getHoraTrabalhada() {
		return horaTrabalhada;
	}

	public void setHoraTrabalhada(int horaTrabalhada) {
		this.horaTrabalhada = (int) Utilitario.validarValorPositivo(horaTrabalhada);
	}

	@Override
	public double calcularSalarioMensal() {
		return this.salarioHora * this.horaTrabalhada;
	}
	
	@Override
	public String toString() {
		return String.format("%s%nHoras trabalhadas: R$%d%n"
				+ "Valor da hora: R$%.2f%n"
				+ "Salário mês: R$%.2f%n", 
				super.toString(), this.horaTrabalhada, this.salarioHora, this.calcularSalarioMensal());
	}
}
