package javaDersleri;

public class MetotOrnek1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		merhaba();		
//		merhaba("Selamlar!");
//		merhaba(213);
//		
//	}
//	
//	static void merhaba()
//	{
//		System.out.println("Merhaba!");
//	}
//	
//	static void merhaba(String mesaj)
//	{
//		System.out.println(mesaj);
//	}
//	
//	static void merhaba(int sayi)
//	{
//		System.out.println(sayi);
//		
//	}
//	

		System.out.println("Dairenin yarıçapı (yarıçap 6):" + alanHesapla(6));
		System.out.println("Dairenin yarıçapı (yarıçap 6, pi=3,14):" + alanHesapla(6, 3.14));
	}

	static double alanHesapla(int yaricap) {
		return Math.pow(yaricap, 2) * Math.PI;
	}

	static double alanHesapla(int yaricap, double piSayisi) {
		return Math.pow(yaricap, 2) * piSayisi;

	}

}
