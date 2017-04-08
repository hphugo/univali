package Exercicio5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.ufsc.ine.leb.sistemaBancario.Banco;
import br.ufsc.ine.leb.sistemaBancario.Moeda;
import br.ufsc.ine.leb.sistemaBancario.SistemaBancario;

public class TesteBanco {

	@Test
	public void bancoDoBrasil() throws Exception {
		Banco bancoDoBrasil = new SistemaBancario().criarBanco("Banco do Brasil", Moeda.BRL);
		assertEquals("Banco do Brasila", bancoDoBrasil.obterNome());
		assertEquals(Moeda.BRL, bancoDoBrasil.obterMoeda());
	}

}
