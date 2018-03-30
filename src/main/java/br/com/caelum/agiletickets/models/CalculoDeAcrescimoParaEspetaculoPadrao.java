package br.com.caelum.agiletickets.models;

import java.math.BigDecimal;

public class CalculoDeAcrescimoParaEspetaculoPadrao implements CalculoDeAcrescimoParaEspetaculo {

	private static final double CINCO_POR_CENTO = 0.05;
	private static final BigDecimal DEZ_POR_CENTO = BigDecimal.valueOf(0.10);

	public BigDecimal calculaPreco(Sessao sessao) {
		BigDecimal preco = sessao.getPreco();

		//quando estiver acabando os ingressos... 
		if(sessao.getPercentualDeIngressosRestantes() <= CINCO_POR_CENTO) { 
			preco = preco.add(sessao.calculaAcrescimoDe(DEZ_POR_CENTO));
		}
		
		return preco;
		
	}

}
