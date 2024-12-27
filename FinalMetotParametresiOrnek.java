package javaDersleri;

public class FinalMetotParametresiOrnek {

	public static final double PI = 3.14159;

	public static void main(String[] args) {

		FinalMetotParametresiOrnek ornek = new FinalMetotParametresiOrnek();

		ornek.sayıyıGöster(45);
		
//		PI = 3.14;
		System.out.println("Pi Sayısı: " + PI);
	}

 
	public void sayıyıGöster(final int sayı) {
		System.out.println("Girilen Sayı: " + sayı);

//		sayı = 10;
	}

	
	
	
}
