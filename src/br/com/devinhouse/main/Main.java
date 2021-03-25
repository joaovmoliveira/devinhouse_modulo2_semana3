package br.com.devinhouse.main;

import br.com.devinhouse.banco.interfaces.Tributavel;
import br.com.devinhouse.banco.models.ContaCorrente;
import br.com.devinhouse.banco.models.ContaInvestimentos;
import br.com.devinhouse.banco.models.ManipuladorDeTributaveis;
import br.com.devinhouse.banco.models.SeguroDeVida;

public class Main {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente("João", "Oliveira", "1", 100);
		cc.depositar(200);
		ContaInvestimentos ci = new ContaInvestimentos("Milena", "Vieira", "2");
		ci.depositar(500);
		SeguroDeVida sv = new SeguroDeVida("Mauricio", "Sampaio", "3", 500);
		
		Tributavel[] bensTributaveis = new Tributavel[3];
		
		bensTributaveis[0] = cc;
		bensTributaveis[1] = ci;
		bensTributaveis[2] = sv;
		
		ManipuladorDeTributaveis manipulaTributaveis = new ManipuladorDeTributaveis();
		
		manipulaTributaveis.calculaImpostos(bensTributaveis);
		
		System.out.println("Total de tributos dos nossos clientes: " + 
				manipulaTributaveis.getTotal());
	}

}
