import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class findEven{
    static void main(){
        List<Integer> numbers= Arrays.asList(1,2,4,88,21);
        List<Integer> evens=numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println((evens));
    }
}