package javaDersleri;

public class PrintfOrnek {

	public static void main(String args[])
	{

		String isim = "Cemalettin";
		int yas = 35;
		double boy = 1.80;
		boolean ogrenciMi = true;
		
		System.out.printf("Kişinin adı: %s, Yaşı: %d, Boyu: %.2f, Öğrenci mi?: %b", isim, yas, boy, ogrenciMi);
		
		System.out.println();
		
		int sayi1 = 5, sayi2 = 123, sayi3 = 2025;
		System.out.printf("Sayılar: %05d, %05d, %05d\n", sayi1, sayi2, sayi3);
		
		double piSayisi = Math.PI;
		System.out.printf("Pi Sayısı (2 duyarlık): %.2f\n", piSayisi);
		System.out.printf("Pi Sayısı (3 duyarlık): %.3f\n", piSayisi);
		System.out.printf("Pi Sayısı (4 duyarlık): %.4f\n", piSayisi);
		
		double tamamlanma = .85;
		System.out.printf("Tamamlanma oranı: %%%.1f%n\n", tamamlanma * 100);
		
		System.out.printf("%-10s %-4s %-10s\n", "Adı", "Yaşı", "Boyu");
		System.out.printf("%-10s %4s %-10s\n", "Ahmet", 23, 1.78);
		System.out.printf("%-10s %4s %-10s\n", "Mehmet", 24, 1.67);
		System.out.printf("%-10s %4s %-10s\n", "Fatma", 43, 1.59);
			
	}
}
