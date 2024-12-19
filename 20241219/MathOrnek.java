package javaDersleri;

import java.util.Scanner;

public class MathOrnek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

//		double x, y;

		System.out.println("Bir double sayı yazınız: ");
		double x = scanner.nextDouble();

		// scanner.next();

		System.out.println("Bir double sayı daha yazınız: ");
		double y = scanner.nextDouble();

		System.out.println("Girdiğiniz iki sayıdan büyük olanı: " + Math.max(x, y));

		System.out.println("Girdiğiniz iki sayıdan küçük olanı: " + Math.min(x, y));

		System.out.println("Girdiğiniz sayıların mutlak değerleri : " + Math.abs(x) + " ve " + Math.abs(y));

		System.out.println("Girdiğiniz sayıların karekök değerleri : " + Math.sqrt(x) + " ve " + Math.sqrt(y));

		System.out.println("Girdiğiniz sayıların yuvarlanmış değerleri : " + Math.round(x) + " ve " + Math.round(y));

		System.out
				.println("Girdiğiniz sayıların yukarı yuvarlanmış değerleri : " + Math.ceil(x) + " ve " + Math.ceil(y));

		System.out.println(
				"Girdiğiniz sayıların aşağı yuvarlanmış değerleri : " + Math.floor(x) + " ve " + Math.floor(y));

		System.out.println("Girdiğiniz x^y değeri : " + Math.pow(x, y));

	}

}
