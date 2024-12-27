package javaDersleri;

import javax.swing.JOptionPane;

public class DialogDortIslem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sayi1 = JOptionPane.showInputDialog(null, "Birinci Sayı?");
		String sayi2 = JOptionPane.showInputDialog(null, "İkinci Sayı?");
		String islem = JOptionPane.showInputDialog(null, "İşlem? [+,-,/,*]");

		Double sayi1Dbl = Double.parseDouble(sayi1);
		Double sayi2Dbl = Double.parseDouble(sayi2);
		Double sonuc = null;

		switch (islem) {
		case "+":
			sonuc = sayi1Dbl + sayi2Dbl;
			break;
		case "-":
			sonuc = sayi1Dbl - sayi2Dbl;
			break;
		case "/":
			sonuc = sayi1Dbl / sayi2Dbl;
			break;
		case "*":
			sonuc = sayi1Dbl * sayi2Dbl;
			break;
		default:
			JOptionPane.showMessageDialog(null, "Hatalı giriş yapıldı.", "Hata", JOptionPane.ERROR_MESSAGE);			
			System.exit(0);
		}

		String mesaj = "İşlem sonucu: " + sonuc;
		
		JOptionPane.showMessageDialog(null, mesaj, "Bilgilendirme", JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null, mesaj, "Bilgilendirme", JOptionPane.ERROR_MESSAGE);
//		JOptionPane.showMessageDialog(null, mesaj, "Bilgilendirme", JOptionPane.WARNING_MESSAGE);
//		JOptionPane.showMessageDialog(null, mesaj, "Bilgilendirme", JOptionPane.PLAIN_MESSAGE);
	}

}
