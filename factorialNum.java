public class factorialNum {

    static void main() {
        int num=5,factorial=1;

        for (int i = 1; i <=num ; i++) {
            factorial *= i;
        }

        System.out.println(factorial);
    }
}
