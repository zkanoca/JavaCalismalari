package javaDersleri;

import javax.swing.JOptionPane;

public class DialogOrnek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String isim = JOptionPane.showInputDialog(null, "Adınız nedir?");
		String yasStr = JOptionPane.showInputDialog(null, "Kaç yaşınızdasınız?");
		
		int yasInt = Integer.parseInt(yasStr);
		
		
		String mesaj = "Merhaba " + isim + ",\n" +
					   "Yaşınız: " + yasInt + " olarak kaydedildi";	
		
		JOptionPane.showMessageDialog(null, mesaj, "Bilgilendirme", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, mesaj, "Bilgilendirme", JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(null, mesaj, "Bilgilendirme", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, mesaj, "Bilgilendirme", JOptionPane.PLAIN_MESSAGE);

	}

}
