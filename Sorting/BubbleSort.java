import java.io.Console;

public class BubbleSort {
    public static void afterBubbleSort(int arr[]){
        int temp =0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1])
                    {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Console c = System.console();
        int size = Integer.parseInt(c.readLine("Enter the size of the array : "));
        int arr[] = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = Integer.parseInt(c.readLine("Enter the elements of the array at index "+i+" : "));
        }

        System.out.println("----------------------------");
        System.out.print("Array before Sorting : ");

        for(int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
        }

        
        System.out.println("\n----------------------------");
        System.out.print("Array After Sorting : ");

        afterBubbleSort(arr);
    }
}
