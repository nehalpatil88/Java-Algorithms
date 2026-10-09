import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class stringGrouping {
    static void main(){
        List<String> strings=Arrays.asList("john","bob","n");
        Map<Integer,List<String>> grouped=strings.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(grouped);
    }
}
