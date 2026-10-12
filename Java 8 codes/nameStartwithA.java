import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class nameStartwithA {
    static void main(){
        List<String> numbers= Arrays.asList("Alice","Bob","Abhishek");
        List<String> filtering=numbers.stream()
                .filter(n->n.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(filtering);

    }
}
