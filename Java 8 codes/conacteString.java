import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class conacteString {
    static void main(){
      List<String> ma=Arrays.asList("John","is","Nice");
      String sentence=ma.stream().collect(Collectors.joining(""));
        System.out.println(sentence);
    }
}
