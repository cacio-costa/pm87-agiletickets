package br.com.caelum.agiletickets.models;

import java.math.BigDecimal;

public class CalculoDeAcrescimoParaEspetaculoPremium implements CalculoDeAcrescimoParaEspetaculo {

	private static final int UMA_HORA = 60;
	private static final BigDecimal DEZ_POR_CENTO = BigDecimal.valueOf(0.10);
	private static final BigDecimal VINTE_POR_CENTO = BigDecimal.valueOf(0.20);
	private static final double CINQUENTA_POR_CENTO = 0.50;

	public BigDecimal calculaPreco(Sessao sessao) {
		BigDecimal preco = sessao.getPreco();
		
		if(sessao.getPercentualDeIngressosRestantes() <= CINQUENTA_POR_CENTO) { 
			preco = sessao.getPreco().add(sessao.calculaAcrescimoDe(VINTE_POR_CENTO));
		}
		
		if(sessao.getDuracaoEmMinutos() > UMA_HORA){
			preco = preco.add(sessao.calculaAcrescimoDe(DEZ_POR_CENTO));
		}
		
		return preco;
	}

}
