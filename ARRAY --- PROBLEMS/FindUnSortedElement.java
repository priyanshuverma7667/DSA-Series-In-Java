import java.io.Console;

public class FindUnSortedElement {
    static int getUnsortedElement(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i+1] <= arr[i]){
                return arr[i+1];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Console c = System.console();
        int n = Integer.parseInt(c.readLine("Enter the size of Array : "));

        int arr[] = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(c.readLine("Enter the index "+i+" elements is : "));
        }
        System.out.println("the unsorted element is = "+ getUnsortedElement(arr));
    }
}
