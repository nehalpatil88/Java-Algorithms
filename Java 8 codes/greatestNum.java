import java.util.Arrays;
import java.util.List;

public class greatestNum{
    static void main(){
        List<Integer> numbers= Arrays.asList(10,20,30,40,88);
        int max=numbers.stream().max(Integer::compare).orElse(0);
        System.out.println(max);
    }
}