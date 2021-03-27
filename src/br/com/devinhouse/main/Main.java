package br.com.devinhouse.main;

import br.com.devinhouse.banco.interfaces.Tributavel;
import br.com.devinhouse.banco.models.ContaCorrente;
import br.com.devinhouse.banco.models.ContaInvestimentos;
import br.com.devinhouse.banco.models.ContaPoupanca;
import br.com.devinhouse.banco.models.ManipuladorDeTributaveis;
import br.com.devinhouse.banco.models.SeguroDeVida;
import br.com.devinhouse.carro.interfaces.Automovel;
import br.com.devinhouse.carro.models.Carro;
import br.com.devinhouse.carro.models.MecanismoAceleracaoCarro;
import br.com.devinhouse.carro.models.MecanismoAceleracaoMoto;
import br.com.devinhouse.carro.models.Moto;

public class Main {

	public static void main(String[] args) {
		// exemplo da aula
		Automovel moto = new Moto("Yamaha XPTO", new MecanismoAceleracaoMoto());
		Automovel carro = new Carro("Honda Fit", new MecanismoAceleracaoCarro(), "prata", 4);

		Automovel[] listaAutomoveis = new Automovel[2];

		listaAutomoveis[0] = moto;
		listaAutomoveis[1] = carro;

		for (Automovel automovel : listaAutomoveis) {
			automovel.acelerar();
			automovel.acenderFarol();
		}

		// exercicio 8 da lista, feito no tira-dúvidas
		ContaPoupanca cp = new ContaPoupanca("João", "Mendes", "1", 10);

		System.out.println(cp.getTipo());
	}

}
