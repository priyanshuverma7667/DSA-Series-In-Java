import java.io.Console;

public class InsertionSort {

    public static void afterInsertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j] > key ){
                    arr[j+1] = arr[j];
                    j--;
            }
            arr[j+1] = key;
        }
        for(int elmnt : arr){
            System.out.print(elmnt+" ");
        }
    }
    public static void main(String[] args) {
        Console c = System.console();
        int size = Integer.parseInt(c.readLine("Enter the size of the array : "));
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(c.readLine("Enter the elements of the array at index " + i + " : "));
        }

        System.out.println("----------------------------");
        System.out.print("Array before Sorting : ");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n----------------------------");
        System.out.print("Array After Sorting : ");

        afterInsertionSort(arr);
    }
}
