package practice.ch03;

public class Main {
    public static void main(String[] args) {
        // CharDisplay d1 = new CharDisplay('H'); // 'H'는 char, "H"는 문자열
        AbstractDisplay d1 = new CharDisplay('H'); // 부모타입으로 선언함.
        d1.display();

        // StringDisplay d2 = new StringDisplay("Hello, world.");
        AbstractDisplay d2 = new StringDisplay("Hello, world.");
        d2.display();

        // AbstractDisplay d3 = new AbstractDisplay(); // 오류
    }
}
