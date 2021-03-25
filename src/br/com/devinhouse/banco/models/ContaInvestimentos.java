package br.com.devinhouse.banco.models;

import br.com.devinhouse.banco.interfaces.Tributavel;

public class ContaInvestimentos extends Conta implements Tributavel {
	// ...
	
	public ContaInvestimentos(String nomeTitular, String sobrenomeTitular, String cpfTitular) {
		super(nomeTitular, sobrenomeTitular, cpfTitular);
	}
	
	// ...
	
	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.02;
	}

}
