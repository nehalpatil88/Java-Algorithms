import java.util.HashSet;

public class CommonElements {
    static void main() {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {4, 8, 55, 6};

        HashSet<Integer> set = new HashSet<>();
        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {
            if (set.contains(num)) {
                System.out.println(num);
            }
        }
    }

}
