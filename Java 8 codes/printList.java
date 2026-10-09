import java.util.Arrays;
import java.util.List;

public class printList{
    static void main(){
        List<String> names= Arrays.asList("Bob","John","Alice");
        names.forEach(name->System.out.println(names));
    }
}