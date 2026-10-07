public class FactorialRecursion {
    static void main() {
        int num=5;
        System.out.println(factorial(num));
    }
    static  int factorial(int n){
       if(n==0) return 1;
       return n*factorial(n-1);
    }
}
