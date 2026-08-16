import java.io.Console;

public class ReverseArrayTwoPointer{

     static void reverseArray(int arr[]){
        int n = arr.length;
        int i = 0,j=n-1;

        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
    }
    public static void main(String args[]){
        Console c = System.console();

        int n = Integer.parseInt(c.readLine("Enter the size of the Array : "));
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(c.readLine("Enter the element of index "+ i + " : "));
        }

        System.out.println("The Actual array is : ");
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }

        System.out.println("\nThe Reverse of the array is : ");
        reverseArray(arr);
    }
}
