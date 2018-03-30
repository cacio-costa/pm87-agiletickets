package br.com.caelum.agiletickets.models;

import java.math.BigDecimal;

public class PrecoSemAcrescimo implements CalculoDeAcrescimoParaEspetaculo {

	public BigDecimal calculaPreco(Sessao sessao) {
		return sessao.getPreco();
	}

}
