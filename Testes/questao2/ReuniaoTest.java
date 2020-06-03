package q2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReuniaoTest {
	
	List<String> participantes = new ArrayList<String>();
	Data data = new Data((short)4,(short)5,(short)2020,(short)10,(short)12);
	Reuniao seg = new Reuniao(data, participantes);
	
	
	@Before
	public void setup() {	
	participantes.clear();
	participantes.add("Maria");
	}
	
	@Test
	public void testReuniao() {
		Assert.assertNotNull(seg);
		Assert.assertNotNull(participantes);
		Assert.assertNotNull(data);
		Assert.assertEquals("Maria", seg.getParticipantes().get(0));
		Assert.assertEquals(data,seg.getData());	
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testException() {
		participantes.get(2);
	}
	
	@Test
	public void testToString() {
		String output = "";
		output += "Dia: 4/5/2020"+"\n";
		output += "Horário: 10 até 12"+"\n";
		output += "Participantes: \n";
		for(String participante : participantes) 
			output += participante+"\n";
		
		Assert.assertEquals(output, seg.toString());
	}
}

