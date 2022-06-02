package tr.edu.medipol.yazilim.islemler;

import static org.junit.Assert.*;

import org.junit.Test;

public class HesaplamaOrnegiTest {
	private HesaplamaOrnegi testEdilenSinif = new HesaplamaOrnegi();
	@Test
	public void testToplama() {
		int s1=19;
		int s2=30;
		int beklenenSonuc = 49;
		int sonuc = testEdilenSinif.toplama(s1, s2);
		assertEquals(beklenenSonuc, sonuc);
	}
	@Test
	public void testCikarma() {
		int s1=20;
		int s2=10;
		int beklenenSonuc = 10;
		int sonuc = testEdilenSinif.cikarma(s1, s2);
		assertEquals(beklenenSonuc, sonuc);
	}
	@Test
	public void testCarpma() {
		int s1=2;
		int s2=1;
		int beklenenSonuc = 2;
		int sonuc = testEdilenSinif.carpma(s1, s2);
		assertEquals(beklenenSonuc, sonuc);
	}
	@Test
	public void testBolme() {
		int s1=20;
		int s2=2;
		int beklenenSonuc = 10;
		int sonuc = testEdilenSinif.bolme(s1, s2);
		assertEquals(beklenenSonuc, sonuc);
	}
}
