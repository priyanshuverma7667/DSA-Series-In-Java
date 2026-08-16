import java.io.Console;
import java.util.Arrays;

public class SwapAlternateElements {
    static int[] getNewArr(int[] arr) {

        int len = arr.length;
        int ans[] = new int[arr.length];

        for (int i = 0; i < len - 1; i += 2) {
            ans[i + 1] = arr[i];
            ans[i] = arr[i + 1];

        }
        if (len % 2 != 0) {
            ans[len - 1] = arr[len - 1];
        }
        return ans;
    }

    public static void main(String[] args) {
        Console c = System.console();
        int n = Integer.parseInt(c.readLine("Enter the size of Array : "));

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(c.readLine("Enter the index " + i + " elements is : "));
        }
        System.out.println("the unsorted element is = " + Arrays.toString(getNewArr(arr)));
    }
}