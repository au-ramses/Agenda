package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Agenda_package.Pessoa;

public class AgendaTest {

	
	@Test
	public void testGetNome() {
		Pessoa umaPessoa = new Pessoa("Ana");
		assertEquals("Ana", umaPessoa.getNome());
	}

}
