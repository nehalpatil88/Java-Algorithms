public class largestNum {

    static void main() {
       int arr[]={1,3,5,7,10};
int largest=arr[0];
       for (int num:arr){
if(num>largest){
    largest=num;
}
       }

        System.out.println(largest);
    }
}
