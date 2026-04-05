package practice.ch05.ex;

public class Main extends Thread {
    public static void main(String[] args) {
        // 스레드를 2개 만듦
        Thread a = new Main("Thread A");
        Thread b = new Main("Thread B");
        Thread c = new Main("Thread C");

        // 스레드를 시작함
        a.start();
        b.start();
        c.start();
    }
    
    @Override
    // Thread의 run() 메서드를 오버라이드함
    // 이 스레드가 실행할 코드
    public void run() {
        Singleton s = Singleton.getInstance(); // 싱글톤 인스턴스를 얻음
        System.out.println(getName() + ": " + s); // 인스턴스의 참조값을 출력
    }

    public Main(String name) {
        super(name); // Thread 클래스의 생성자에 이름을 전달
    }
}
