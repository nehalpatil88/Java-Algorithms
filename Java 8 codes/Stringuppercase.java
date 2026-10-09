import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stringuppercase {
    static void main(){
        List<String> strings= Arrays.asList("bob","john");
        List<String> uppercase=strings.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(uppercase);
    }
}
