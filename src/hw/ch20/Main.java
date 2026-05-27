package hw.ch20;

public class Main {
    static final String RED     = "\u001B[31m"; 
    static final String GREEN   = "\u001B[32m"; 
    static final String YELLOW  = "\u001B[33m"; 
    static final String BLUE    = "\u001B[34m"; 
    static final String MAGENTA = "\u001B[35m"; 
    static final String CYAN    = "\u001B[36m"; 
    static final String RESET   = "\u001B[0m";
    
    public static void main(String[] args) {
        System.out.println("학번: 20240770, 이름: 전민서");
        
        if (args.length == 0) {
            System.out.println("Usage: java Main digits");
            System.out.println("Example: java Main 1212123");
            System.exit(0);
        }

        BigString bs = new BigString(args[0]);

        String[] colors = new String[args[0].length()];
        for (int i = 0; i < args[0].length(); i++) {
            char c = args[0].charAt(i);
            switch (c) {
                case '1':
                    // 위치에 따라 다른 색상 지정
                    if (i == 0) colors[i] = RED;
                    else if (i == 2) colors[i] = GREEN;
                    else if (i == 4) colors[i] = CYAN;
                    else colors[i] = RED; // 기본값
                    break;
                case '2':
                    if (i == 1) colors[i] = BLUE;
                    else if (i == 3) colors[i] = MAGENTA;
                    else if (i == 5) colors[i] = YELLOW;
                    else colors[i] = BLUE; // 기본값
                    break;
                case '3':
                    colors[i] = BLUE;
                    break;
                default:
                    colors[i] = RESET;
            }
        }

        // 색상 출력
        bs.print(colors);
    }
}
