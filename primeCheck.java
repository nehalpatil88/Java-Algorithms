public class primeCheck {

    static void main() {
        int num=11;

        boolean  isPrime=true;

        for (int i = 2; i <=num ; i++) {
            if (num %2==0){
                isPrime=false;
            }
        }
        System.out.println(isPrime);
    }
}
