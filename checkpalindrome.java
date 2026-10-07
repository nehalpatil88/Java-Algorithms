public class checkpalindrome {
    static void main(){
        String str="madam";
        String reversed=new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(reversed));
    }

}
