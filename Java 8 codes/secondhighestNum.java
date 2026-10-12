import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class secondhighestNum {
    static void main(){
        List<Integer> numbers= Arrays.asList(1020,1080,60,30);
    int highest=numbers.stream()
            .sorted(Comparator.reverseOrder())
            .skip(1)
            .findFirst()
            .orElseThrow(()->new RuntimeException("Value not found"));
        System.out.println(highest);
    }
}
