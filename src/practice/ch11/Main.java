package practice.ch11;

public class Main {
    public static void main(String[] args) {
        // 디렉터리 트리를 만든다
        // Entry root = new Directory("root"); // 업 캐스팅(Directory 형이 Entry 형으로 반환됨) => 자동으로 변환됨.

        Directory root = new Directory("root");
        Directory bin = new Directory("bin");
        Directory tmp = new Directory("tmp");
        Directory usr = new Directory("usr");
        
        //((Directory)root).add(bin); // 형변환(타입 캐스팅) => 다운캐스팅, .연산자가 형변환 연산자보다 우선순위가 높음
        
        root.add(bin);
        root.add(tmp);
        root.add(usr);

        bin.add(new File("vi", 10000));
        bin.add(new File("latex", 20000));

        // 경로 출력
        root.printList();
    }
}
