import java.io.Console;

public class ShiftArrayElementByKthPos {
    static void shiftedArray(int[] arr,int shiftpos){
        int len = arr.length;
        int shftpos = shiftpos;
        int temp[] = new int[shftpos];


        for(int i=0;i<shftpos;i++){
            temp[i] = arr[len-shiftpos+i];
        }

        for(int i=len-1;i >= shftpos;i--){
            arr[i] = arr[i-shftpos];
        }

        for(int k=0;k<shftpos;k++){
            arr[k] = temp[k];
            }   
        
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

        int shiftpos = Integer.parseInt(c.readLine("Enter the Shifting position : "));

        System.out.println("\nThe Shifted array is : ");
        shiftedArray(arr,shiftpos);
    }
}
