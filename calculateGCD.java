public class calculateGCD {
    static void main() {
       int a=60,b=48;

       while (b!=0){
           int temp=b;
           b=a%b;
           a=temp;
       }
        System.out.println(a);
    }

}
