import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class sortStrings {
    static void main(){
        List<String> list= Arrays.asList("Bob","Alice","John");
//        List<String> solution=list.stream()
//                .sorted()
//                .collect(Collectors.toList());
//        System.out.println(solution);


        List<String> solution=list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(solution);
    }
}
