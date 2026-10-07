import java.util.Random;

public class randomNum {
    static void main() {
        Random random=new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println(random.nextInt(100));
        }
    }
}
