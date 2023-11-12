import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lottery {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(100);
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        System.out.println(numbers);

        for (int i = 0; i < 10; i++) {
            System.out.println(numbers.get(i));
        }
    }
}
