package javaDersleri;

import javax.swing.JOptionPane;

public class DialogDortIslem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sayi1 = JOptionPane.showInputDialog(null, "Birinci Sayı?");
		String sayi2 = JOptionPane.showInputDialog(null, "İkinci Sayı?");
		String[] islem = { "+", "-", "/", "*" };

		int secim = JOptionPane.showOptionDialog(null, "Hangi işlemi yapmak istiyorsunuz?", "İşlem Seçin",
				JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, islem, islem[0]);

		Double sayi1Dbl = Double.parseDouble(sayi1);
		Double sayi2Dbl = Double.parseDouble(sayi2);
		Double sonuc = null;

		switch (secim) {
		case 0:
			sonuc = sayi1Dbl + sayi2Dbl;
			break;
		case 1:
			sonuc = sayi1Dbl - sayi2Dbl;
			break;
		case 2:
			sonuc = sayi1Dbl / sayi2Dbl;
			break;
		case 3:
			sonuc = sayi1Dbl * sayi2Dbl;
			break;
		default:
			JOptionPane.showMessageDialog(null, "Hatalı giriş yapıldı.", "Hata", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}

		String mesaj = sayi1Dbl + " " + islem[secim] + " " + sayi2Dbl + " = " + sonuc;

		JOptionPane.showMessageDialog(null, mesaj, "Bilgilendirme", JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null, mesaj, "Bilgilendirme", JOptionPane.ERROR_MESSAGE);
//		JOptionPane.showMessageDialog(null, mesaj, "Bilgilendirme", JOptionPane.WARNING_MESSAGE);
//		JOptionPane.showMessageDialog(null, mesaj, "Bilgilendirme", JOptionPane.PLAIN_MESSAGE);
	}

}
