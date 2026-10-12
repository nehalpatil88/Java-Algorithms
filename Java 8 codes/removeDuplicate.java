import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class removeDuplicate {
    static void main() {
      List<Integer> numbers=Arrays.asList(1,2,4,2,60);
      List<Integer> distinctNum=numbers.stream()
              .distinct()
              .collect(Collectors.toList());
        System.out.println(distinctNum);

    }
}
