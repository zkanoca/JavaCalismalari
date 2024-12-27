package javaDersleri;

class ParentClass {
    public  void displayMessage() {
        System.out.println("Bu bir final metot. Override edilemez.");
    }
}

class ChildClass extends ParentClass {
    // Hata: Final metodu override etmeye çalışırsan hata alırsın.
    // @Override
     public void displayMessage() {
         System.out.println("Override edildi!");
     }
}

public class FinalOrnek2 {
    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        child.displayMessage();
    }
}


