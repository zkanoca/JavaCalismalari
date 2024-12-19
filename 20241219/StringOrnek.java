package javaDersleri;

import java.util.Locale;
import java.util.Scanner;

public class StringOrnek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Bir kelime yazınız: ");
		String kelime = scanner.nextLine();

		boolean bosMu = kelime.isEmpty();

		if (!bosMu)
			System.out.println("Girdiğiniz kelime: " + kelime);

		else
		{
			System.out.println("Girdiğiniz kelime boş");
			return;
		}

		System.out.println("Girdiğiniz kelimenin harf sayısı: " + kelime.length());
		System.out.println("Girdiğiniz kelimenin ilk harfi: " + kelime.charAt(0));
		System.out.println("Girdiğiniz kelimenin son harfi: " + kelime.charAt(kelime.length() - 1));
		System.out.println("Girdiğiniz kelimenin büyük harfle yazılışı: " + kelime.toUpperCase());
		// System.out.println("Girdiğiniz kelimenin büyük harfle yazılışı (lokal): " +
		// kelime.toUpperCase(new Locale("tr", "TR")));
		System.out.println("Girdiğiniz kelimenin küçük harfle yazılışı: " + kelime.toLowerCase());
		// System.out.println("Girdiğiniz kelimenin küçük harfle yazılışı (lokal): " +
		// kelime.toLowerCase(new Locale("tr", "TR")));

		System.out.println("Sıra numarasını bulacağımız harfi yazınız: ");

		char arananKarakter = scanner.next().charAt(0);

		int charIndex = kelime.indexOf(arananKarakter);

		if (charIndex == -1) {
			System.out.println("Aradığınız '" + arananKarakter + "' bulunamadı.");
		} else {
			System.out.println("Aradığınız '" + arananKarakter + "' " + (int) (charIndex + 1) + ". sırada bulundu.");
		}

		System.out.println("Girdiğiniz kelimenin kırpılmış hali: " + kelime.trim());

		System.out.println("Değiştirilecek karakter: ");
		char eskiKarakter = scanner.next().charAt(0);

		System.out.println("Yerine konacak karakter: ");
		char yeniKarakter = scanner.next().charAt(0);

		System.out.println("Girdiğiniz kelimenin değiştirilmiş hali: " + kelime.replace(eskiKarakter, yeniKarakter));

		String tersKelime = new StringBuilder(kelime).reverse().toString();
		System.out.println("Girdiğiniz kelimenin tersten yazılışı: " + tersKelime);

		scanner.nextLine();
		
		System.out.println("Bir başka kelime yazınız: ");
		String digerKelime = scanner.nextLine();
		
		System.out.println("Girdiğiniz iki kelime aynı mı (büyük-küçük harf duyarlı): " + kelime.equals(digerKelime));
		System.out.println("Girdiğiniz iki kelime aynı mı (büyük-küçük harf duyarsız): " + kelime.equalsIgnoreCase(digerKelime));
		
		System.out.println("Kelimenin ortadaki 3. harften 5. harfe kadar olan kısmı: " + kelime.substring(3,5));
	}

}
