package tr.edu.medipol.yazilim.islemler;

public class HesaplamaOrnegi {
	static int cikarma(int s1, int s2) {
		return s1-s2;
	}
	static int toplama(int s1, int s2) {
		return s1 + s2;
	}
	static int carpma(int s1, int s2) {
		return s1*s2;
	}
	static int bolme(int s1, int s2) {
		return s1/s2;
	}
	public static void main(String[] args) {
		int sonuc = toplama(255, 600);
		System.out.println("255 + 600 = "+sonuc);	
	}

}
