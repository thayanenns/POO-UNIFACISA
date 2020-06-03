package q2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class GoogleAgendaTest {

	GoogleAgenda ga;
	Reuniao seg;
	Reuniao ter;

	@Before
	public void setup() {
		seg = new Reuniao(new Data((short) 4, (short) 5, (short) 2020, (short) 10, (short) 12));
		seg.participantes.add("Maria");
		
		ter = new Reuniao(new Data((short) 5, (short) 5, (short) 2020, (short) 8, (short) 12));
		ter.participantes.add("José");
		ter.participantes.add("João");
		ga = new GoogleAgenda();
		ga.adicionarReuniao(seg);
		ga.adicionarReuniao(ter);
	}

	@Test
	public void testGoogleAgenda() {
		Assert.assertNotNull(ga.tamanho);
		Assert.assertNull(ga.reunioes[2]);
		Assert.assertEquals(10, ga.reunioes.length);
	}

	@Test
	public void testAdicionarReuniao() {
		Assert.assertEquals(2, ga.tamanho);
		ga.adicionarReuniao(seg);
		Assert.assertEquals(3, ga.tamanho);
		Assert.assertNotNull(ga.reunioes[2]);
		Assert.assertNull(ga.reunioes[3]);
	}

	@Test
	public void testAdicionarReuniao2() {
		Assert.assertEquals(2, ga.tamanho);
		ga.adicionarReuniao(new Data((short) 4, (short) 5, (short) 2020, (short) 10, (short) 12), new ArrayList<String>());
		Assert.assertEquals(3, ga.tamanho);
		for (int i = 0; i < 10; i++) {
			ga.adicionarReuniao(ter);
		}
		Assert.assertEquals(13, ga.tamanho);
	}

	@Test
	public void testDuplicaReunioes() {
		for (int i = 1; i <= 8; i++) {
			ga.adicionarReuniao(ter);
		}
		Assert.assertEquals(10, ga.reunioes.length);
		ga.adicionarReuniao(ter);
		Assert.assertEquals(20, ga.reunioes.length);
	}

	@Test
	public void testRemoverParticipante() {
			Assert.assertEquals(true, ter.getParticipantes().contains("José"));
			ga.removerParticipante("José");
			Assert.assertEquals(false, ter.getParticipantes().contains("José"));
	}
	
	@Test
	public void testGetDuracao() {
		Assert.assertNotNull(ga.getDuracao(seg));
		Assert.assertEquals(2,ga.getDuracao(seg));
		
	}
	
	@Test
	public void testGetReuniaoMaisLonga() {
		Assert.assertNotNull(ga.getDuracao(seg));
		Assert.assertNotNull(ga.getDuracao(ter));
		Assert.assertEquals(seg, ga.getReuniaoMaisLonga());
		Assert.assertNotEquals(ter, ga.getReuniaoMaisLonga());

	}
	
	
}
