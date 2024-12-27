package javaDersleri;

import javax.swing.JOptionPane;

public class JOPSelectOrnek {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] courses = { "Java", "Python", "C++", "JavaScript" };
		String selectedCourse = (String) JOptionPane.showInputDialog(null,
				"Hangi programlama dilini öğrenmek istiyorsunuz?", "Kurs Seçimi", JOptionPane.QUESTION_MESSAGE, null,
				courses, courses[0]);

		// Kullanıcının seçimini göster
		if (selectedCourse != null) {
			JOptionPane.showMessageDialog(null, selectedCourse + " harika bir seçim!", "Seçim Sonucu",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Herhangi bir seçim yapmadınız.", "Uyarı", JOptionPane.WARNING_MESSAGE);
		}

	}

}
