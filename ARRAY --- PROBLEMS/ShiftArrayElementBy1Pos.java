import java.io.Console;

public class ShiftArrayElementBy1Pos {
    static void shiftedArray(int[] arr){
        int len = arr.length;
        int temp = arr[len-1];
        for(int i=len-1;i>0;i--){
            arr[i] = arr[i-1];
        }
            arr[0] = temp;
            for(int k=0;k<len;k++){
            System.out.print(arr[k]+" ");
            }
        }

    public static void main(String[] args) {
        Console c = System.console();
        int n = Integer.parseInt(c.readLine("Enter the size of Array : "));

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(c.readLine("Enter the index " + i + " elements is : "));
        }

        System.out.println("The Actual array is : ");
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }

        System.out.println("\nThe Shifted array is : ");
        shiftedArray(arr);
    }
}
