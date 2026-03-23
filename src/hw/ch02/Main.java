package hw.ch02;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("학번: 20240770, 이름: 전민서");

        KoreanOutlet koreanOutlet = new KoreanOutlet();

        Charger charger = new KoreanOutletAdapter(koreanOutlet);

        Smartphone smartphone = new Smartphone(charger);

        smartphone.charge();
    }
}