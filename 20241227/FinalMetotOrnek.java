package javaDersleri;

public class FinalMetotOrnek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CocukSinif cs = new CocukSinif();
		cs.mesajYaz();
		cs.selamla();
	}

}


class AnaSinif {
	public final void mesajYaz()
	{
		System.out.println("Bu bir final metottur. Override edilemez.");
	}
	
	public void selamla()
	{
		System.out.println("Merhaba");
	}
}

class CocukSinif extends AnaSinif
{
	//@Override
	public void selamla()
	{
		System.out.println("Merhaba 2025");
	}
	
//	public void mesajYaz()
//	{
//		System.out.println("MEsaj içeriği dğeişti");
//	}
	
	
}