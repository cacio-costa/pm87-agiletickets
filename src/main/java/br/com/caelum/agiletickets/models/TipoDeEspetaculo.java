package br.com.caelum.agiletickets.models;

import java.math.BigDecimal;

public enum TipoDeEspetaculo {
	
	CINEMA(new CalculoDeAcrescimoParaEspetaculoPadrao()), 
	SHOW(new CalculoDeAcrescimoParaEspetaculoPadrao()), 
	TEATRO(new PrecoSemAcrescimo()), 
	BALLET(new CalculoDeAcrescimoParaEspetaculoPremium()), 
	ORQUESTRA(new CalculoDeAcrescimoParaEspetaculoPremium());
	
	private CalculoDeAcrescimoParaEspetaculo calculo;
	
	private TipoDeEspetaculo(CalculoDeAcrescimoParaEspetaculo calculo) {
		this.calculo = calculo;
	}

	public BigDecimal calculaPreco(Sessao sessao) {
		return calculo.calculaPreco(sessao);
	}
	
}
