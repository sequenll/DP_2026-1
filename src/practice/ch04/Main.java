package practice.ch04;

// import practice.ch04.idcard.IDCard;
import practice.ch04.idcard.IDCardFactory;
import practice.ch04.framework.Product;

public class Main {
    public static void main(String[] args) {
        // (1) IDCard를 직접 만들어보자
        // IDCard c = new IDCard("전민서");
        // c.use();

        // (2) 공장을 통해서 id카드 만들어 보자
        IDCardFactory f = new IDCardFactory();
        Product c = f.create("전민서");
        c.use();
    }
}
