package javaDersleri;

import java.util.ArrayList;

public class ArrayList2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList< ArrayList<String> > gidaMaddeleri = new ArrayList();
		
		ArrayList<String> yiyecekler = new ArrayList();
		ArrayList<String> icecekler = new ArrayList();
		
		yiyecekler.add("Ekmek");
		yiyecekler.add("Pilav");
		yiyecekler.add("Makarna");
		
		icecekler.add("Su");
		icecekler.add("Çay");
		icecekler.add("Gazoz");
		icecekler.add("Ayran");
		
		System.out.println("Yiyecekler");
		System.out.println(yiyecekler);

		System.out.println("İçecekler");
		System.out.println(icecekler);
		
	
		
		gidaMaddeleri.add(icecekler);
		gidaMaddeleri.add(yiyecekler);
	
		
		System.out.println("Gıda Maddeleri");
		System.out.println(gidaMaddeleri);
		
		System.out.println(gidaMaddeleri.get(0).get(1)); //Çay
		
		
	}

}
