import java.util.Scanner;

public class KeyboardSource implements INumberSource {
    Scanner sc;

    public KeyboardSource() {
        sc = new Scanner(System.in);
    }

    @Override
    public int loadNumber() {
        return sc.nextInt();
    }
}