package javaDersleri;

import java.util.Scanner;

public class ScannerOrnek {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bir sayı yazınız: ");
		
		int x = scanner.nextInt();
		
		
		System.out.println("Bir meyve yazınız: ");
		
		scanner.nextLine();
		
		String meyve = scanner.nextLine();
		
		System.out.println(x);
		System.out.println(meyve);
		
		scanner.close();
		
	}

}
