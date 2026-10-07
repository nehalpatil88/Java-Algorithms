public class removeWhitespace {
    static void main() {
        String str = " A u t o m a t i o n ";
       String result=str.replaceAll("\\s+" , "" );
        System.out.println(result);
    }
}
