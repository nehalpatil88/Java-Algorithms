public class sumofDigits {
    static void main() {
        int num=12345,sum=0;
        while (num!=0){
            sum+=num%10;
            num/=10;
        }
        System.out.println(sum);
    }


}
