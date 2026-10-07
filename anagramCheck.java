
import java.util.Arrays;

public class anagramCheck{
    static void main(){
        String str="silent",str1="listen";
        char[] arr=str.toCharArray();
        char[] arr2=str1.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr,arr2));
    }
}