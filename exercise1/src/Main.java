import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {16, 17, 4, 3, 5, 2};
        int[] arr2 = {1, 2, 3, 4, 5, 2};
        System.out.println(findLeaders(arr1));  // Output: [17, 5, 2]
        System.out.println(findLeaders(arr2));  // Output: [5, 2]
    }

    public static List<Integer> findLeaders(int[] arr) {
        List<Integer> result = new ArrayList<>();
        int n = arr.length;
        int max_element = arr[n-1];
        result.add(max_element);
        for (int i = n-2; i >= 0; i--) {
            if (arr[i] > max_element) {
                result.add(arr[i]);
                max_element = arr[i];
            }
        }
        Collections.reverse(result);
        return result;
    }
}