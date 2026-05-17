package hw.ch17;

public class EvenNumberGenerator extends NumberGenerator {
    private int number;	    // 현재 수 
    private int end;        // 종료값(이 값은 포함하지 않는다)

    public EvenNumberGenerator(int start, int end) {
        if (start % 2 != 0) {
            throw new IllegalArgumentException("Start must be even.");
        }
        this.number = start;
        this.end = end;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        while (number < end) {
            notifyObservers();
            number += 2;
        }
    }
}
