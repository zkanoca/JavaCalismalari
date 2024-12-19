package javaDersleri;

public class Degisken {

	public static void main(String[] args) {
		
		//primitive datatypes
//		int tamsayi;
//		double ondalikli;
//		float kayanNoktali;
//		char karakter;
//		boolean evetHayir;
		
		//Reference
//		Integer tamSayiWrapper;
//		Double ondalikliWrapper;
//		Float kayanNoktaliWrapper;
//		Character karakterWrapper;
//		
//		String metinWrapper;
		
		int yas = 25; //initialization
		
//		int yas2; //declaration
//		yas2 = 23; //assignment
		
		double boy = 1.78;
		
		String isim = "Mehmet";
		
		System.out.println("Mehmet " + yas + " yaşında ve " + boy + " m boyundadır."); //sysout Ctrl + space
		
		
		double x = 1.7345;
		
		int y = (int) x; 
		
		System.out.println("x: " + x); 
		System.out.println("y (x'in yuvarlanmış hali): " + y); 
		
		
		
		
		//Takas
		
		int a = 10;
		int b = 20;
		
		System.out.println("Takastan önce ");
		System.out.println("a: " + a + " b: " + b);
		
		//3. bir değişken kullanmadan takas
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("Takastan sonra ");
		System.out.println("a: " + a + " b: " + b);
	}

}
