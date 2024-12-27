package javaDersleri;

import javax.swing.JOptionPane;

public class DialogOnayOrnek {

	public static void main(String args[])
	{
		int onay = JOptionPane.showConfirmDialog(null, "Bugün hava yağmurlu mu?", "Onay", JOptionPane.YES_NO_OPTION);
		
		if (onay == JOptionPane.YES_OPTION)
		{
			JOptionPane.showMessageDialog(null, "Çıkarken şemsiye al.","Hava Yağmurlu", JOptionPane.WARNING_MESSAGE);
		}
		else if (onay == JOptionPane.NO_OPTION)
		{
			JOptionPane.showMessageDialog(null, "Şemsiye almana gerek yok.","Havada Yağış Yok", JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
}
