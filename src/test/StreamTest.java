package test;

import org.junit.Assert;
import org.junit.Test;

import main.Stream;
import main.StreamImpl;
import main.StreamMain;

public class StreamTest {
	
	@Test
	public void deveRetornarPrimeiraVogalQueNaoRepeteAposConsoanteAntecedenteDeVogal() {
		//Streams para teste
		Stream stream1 = new StreamImpl("aAbBABacafe");
		Stream stream2 = new StreamImpl("aAbBABacafersyeVixyz");
		Stream stream3 = new StreamImpl("abadceferpliyipl");
		Stream stream4 = new StreamImpl("ndisaASD32ekofsad0NJFDIS09ISu4klfsdo");
		
		//Testar se char retornado corresponde ao esperado
		Assert.assertEquals("e", StreamMain.firstChar(stream1));
		Assert.assertEquals("i", StreamMain.firstChar(stream2));
		Assert.assertEquals("a", StreamMain.firstChar(stream3));
		Assert.assertEquals("u", StreamMain.firstChar(stream4));
	}

}
