package br.com.devinhouse.folhapagamento.funcionarios;

public abstract class Funcionario {
	private String nome;
	private String sobreNome;
	private static int totalDeFuncionarios;
	
	public Funcionario(String nome, String sobreNome) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		totalDeFuncionarios++;
	}
	
	public static int getTotalDeFuncionarios() {
		return totalDeFuncionarios;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	
	public abstract double calcularSalarioMensal();
	
	
	@Override
	public String toString() {
		return String.format("%s: %s %s", "Nome", this.nome, this.sobreNome);
	}
}
