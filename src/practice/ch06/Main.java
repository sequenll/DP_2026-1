package practice.ch06;

import practice.ch06.framework.Manager;

public class Main {
    public static void main(String[] args) {
        
        // // 원본을 이용
        // MessageBox mbox1 = new MessageBox('*');
        // mbox1.use("Hello, world.");

        // UnderlinePen upen1 = new UnderlinePen('-');
        // upen1.use("Hello, world.");

        // // 복제 객체를 이용
        // mbox1.createCopy().use("Hello, world.");
        // upen1.createCopy().use("Hello, world.");

        //Manger를 이용

        // 준비
        Manager managr = new Manager();

        //d 원본 객체 생성 및 등록
        MessageBox mbox1 = new MessageBox('*');
        managr.register("star box", mbox1);

        UnderlinePen upen1 = new UnderlinePen('-');
        managr.register("underline pen", upen1);

        MessageBox mbox2 = new MessageBox('/');
        managr.register("slash box", mbox2);

        // 복제 객체를 얻어와서 사용
        managr.create("star box").use("Hello, world.");
        managr.create("underline pen").use("Hello, world.");
        managr.create("slash box").use("Hello, world.");
    }
}
