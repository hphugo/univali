package Exercicio4.delegate;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.ufsc.ine.leb.sistemaBancario.Agencia;
import br.ufsc.ine.leb.sistemaBancario.Banco;
import br.ufsc.ine.leb.sistemaBancario.experimento.etapa1.delegate.Auxiliar;

public class TesteAgencia {

	@Test
	public void caixaEconomicaTrindade() throws Exception {
		Agencia caixaEconomicaTrindade = Auxiliar.criarCaixaEconomicaTrindade();
		
		assertEquals("001", caixaEconomicaTrindade.obterIdentificador());
		assertEquals("Trindade", caixaEconomicaTrindade.obterNome());
		assertEquals(caixaEconomica, caixaEconomicaTrindade.obterBanco());
	}

}
