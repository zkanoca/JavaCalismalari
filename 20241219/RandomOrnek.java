package javaDersleri;

import java.util.Random;

public class RandomOrnek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();

		int zar = ran.nextInt(6) + 1;
		System.out.println("Zar atıldı: " + zar);

		double rasgeleDouble = ran.nextDouble();
		System.out.println("rasgeleDouble değeri: " + rasgeleDouble);

		boolean rasgeleBoolean = ran.nextBoolean();
		System.out.println("rasgeleBoolean değeri: " + rasgeleBoolean);

		int araliktaSayi = ran.nextInt(101) + 50;
		System.out.println("50-100 arası rasgele bir değer: " + araliktaSayi);

		char rasgeleHarf = (char) (ran.nextInt(26) + 'A');
		System.out.println("Rasgele bir harf: " + rasgeleHarf);

	}

}
