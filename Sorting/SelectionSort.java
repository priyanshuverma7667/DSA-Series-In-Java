// import java.io.Console;

// public class SelectionSort {

//     public static void afterSelectionSort(int[] arr) {
//         for (int i = 0; i < arr.length - 1; i++) {
//             int minIndex = i;
//             for (int j = i+1; j < arr.length; j++) {
//                 if (arr[minIndex] > arr[j]) {
//                     minIndex = j;
//                 }
                
//             }
//             int temp = arr[minIndex];
//             arr[minIndex] = arr[i];
//             arr[i] = temp;

//         }
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }

//     public static void main(String[] args) {
//         Console c = System.console();
//         int size = Integer.parseInt(c.readLine("Enter the size of the array : "));
//         int arr[] = new int[size];

//         for (int i = 0; i < size; i++) {
//             arr[i] = Integer.parseInt(c.readLine("Enter the elements of the array at index " + i + " : "));
//         }

//         System.out.println("----------------------------");
//         System.out.print("Array before Sorting : ");

//         for (int i = 0; i < size; i++) {
//             System.out.print(arr[i] + " ");
//         }

//         System.out.println("\n----------------------------");
//         System.out.print("Array After Sorting : ");

//         afterSelectionSort(arr);
//     }

// }

import java.io.Console;

public class SelectionSort {

    public static void afterSelectionSort(int[] arr) {
        for (int i = arr.length-1;i>0; i--) {
            int maxIndex = 0;
            for (int j = 1; j <= i ; j++) {
                if (arr[maxIndex] < arr[j]) {
                    maxIndex = j;
                }
                
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
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

        afterSelectionSort(arr);
    }

}
