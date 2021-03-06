package Exercicio5.inline;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.ufsc.ine.leb.sistemaBancario.Agencia;
import br.ufsc.ine.leb.sistemaBancario.Banco;
import br.ufsc.ine.leb.sistemaBancario.Conta;
import br.ufsc.ine.leb.sistemaBancario.Moeda;
import br.ufsc.ine.leb.sistemaBancario.SistemaBancario;

public class TesteConta {

	@Test
	public void joaoCaixaEconomicaTrindade() throws Exception {
		SistemaBancario sistemaBancario = new SistemaBancario();
		Banco bancoDoBrasil = sistemaBancario.criarBanco("Banco do Brasil", Moeda.BRL);
		Agencia bancoDoBrasiCentro = bancoDoBrasil.criarAgencia("Centro");
		Conta mariaBancoDoBrasilCentro = bancoDoBrasilCentro.criarConta("Maria");
		
		assertEquals("0001-5", bancoDoBrasilCentro.obterIdentificador());
		assertEquals("Maria", bancoDoBrasilCentro.obterTitular());
		assertTrue(bancoDoBrasilCentro.calcularSaldo().zero());
		assertEquals(bancoDoBrasilCentro, mariaBancoDoBrasilCentro.obterAgencia());
	}

}
