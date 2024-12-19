package javaDersleri;

import java.util.ArrayList;

public class ArrayListOrnek {

	public static void main(String[] args) {
		 
		ArrayList<String> meyveler = new ArrayList<>();
		
		meyveler.add("Elma");
		meyveler.add("Erik");
		meyveler.add("Muz");
		meyveler.add("Kivi");
		System.out.println("Meyveler (" + meyveler.size() + ") :" + meyveler); //Meyveler: [Elma, Erik, Muz, Kivi]
		
		meyveler.add("Karpuz");
		System.out.println("Meyveler (" + meyveler.size() + ") :" + meyveler); //Meyveler: [Elma, Erik, Muz, Kivi, Karpuz]

		meyveler.add(2,"Kavun");
		System.out.println("Meyveler (" + meyveler.size() + ") :" + meyveler); //Meyveler: [Elma, Erik, Kavun, Muz, Kivi, Karpuz]
		
		System.out.println("3. sıradaki meyve: " + meyveler.get(2)); //3. sıradaki meyve: Kavun
		
		meyveler.set(1,"Kayısı");
		System.out.println("Meyveler (" + meyveler.size() + ") :" + meyveler); //Meyveler: [Elma, Kayısı, Kavun, Muz, Kivi, Karpuz]

		System.out.println("*********************************");
		for(int i = 0; i < meyveler.size();i++)
		{
			System.out.println(meyveler.get(i));
			
		}
		
		System.out.println("*********************************");

		for(String meyve : meyveler)
		{
			System.out.println(meyve);
			
		}

		System.out.println("*********************************");
		
		meyveler.remove(0);
		System.out.println("Meyveler (" + meyveler.size() + ") :" + meyveler); //Meyveler: [Kayısı, Kavun, Muz, Kivi, Karpuz]
		
		meyveler.remove("Muz");
		System.out.println("Meyveler (" + meyveler.size() + ") :" + meyveler); //Meyveler: [Kayısı, Kavun, Kivi, Karpuz]
		
		meyveler.clear();
		System.out.println("Meyveler (" + meyveler.size() + ") :" + meyveler); //Meyveler: []
		
		
		  
	}

}
