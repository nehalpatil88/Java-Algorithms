public class fibonacciSeries {
    static void main() {
        int n=10,n1=0,n2=1;
        System.out.println("Fibonaaci Series:" +n1+n2);
        for (int i = 2; i <n ; i++) {
            int num3=n1+n2;

            System.out.println("," +num3);
            n1=n2;
            n2=num3;
        }

    }
    }

