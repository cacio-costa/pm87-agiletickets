package br.com.caelum.agiletickets.models;

import java.math.BigDecimal;

public interface CalculoDeAcrescimoParaEspetaculo {

	BigDecimal calculaPreco(Sessao sessao);

}