import java.util.Scanner;

public class Calculator {
    static void main(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your first number: ");
        double num1=scanner.nextDouble();
        System.out.println("Enter your Second  Number: ");
        double num2=scanner.nextDouble();
        System.out.println("Select your operations(+,-,*,/)");
        char operations=scanner.next().charAt(0);
        double result;
        switch(operations){
            case '+':

                result=num1+num2;

                break;

            case '-':
                result=num1-num2;
                break;

            case '*':
                result=num1*num2;
                break;

            case '/':
                result=num1/num2;
                break;

            default:throw new IllegalArgumentException("Invalid Operations");

        }

        System.out.println(result);
    }

}
