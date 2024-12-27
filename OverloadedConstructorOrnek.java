package javaDersleri;

public class OverloadedConstructorOrnek 
{
    public static void main(String[] args) {
        // Farklı yapıcılarla nesne oluşturma
        Student student1 = new Student(); // Parametresiz yapıcı
        Student student2 = new Student("Alice"); // Tek parametreli yapıcı
        Student student3 = new Student("Bob", 20); // İki parametreli yapıcı
        Student student4 = new Student("Charlie", 22, "Computer Science"); // Üç parametreli yapıcı

        // Nesne bilgilerini yazdırma
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
        student4.displayInfo();
    }
}

