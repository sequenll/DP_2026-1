package hw.ch03;

public class Main {
    public static void main(String[] args) {
      
        System.out.println("학번: 20240770, 이름: 전민서");
        
        AbstractDisplay d1 = new CharDisplay('H'); // 기본 5회
        AbstractDisplay d2 = new StringDisplay("Hello"); // 기본 5회
        d1.display();
        d2.display();

        AbstractDisplay d3 = new CharDisplay('X', 3); // 3회
        AbstractDisplay d4 = new StringDisplay("Test", 7); // 7회 
        d3.display(); 
        d4.display();

        // NumberDisplay 
        AbstractDisplay num = new NumberDisplay(42, 4); 
        num.display();
    }
}
