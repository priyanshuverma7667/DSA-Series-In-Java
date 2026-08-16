// import java.io.Console;

// public class AvgOfArrayElements{
//     public static void main(String args[]){
//         Console c = System.console();

//         int sizeOfArray = Integer.parseInt(c.readLine("Enter the size of the array : "));

//         int[] arr = new int[sizeOfArray];
        
//         for(int i=0; i<sizeOfArray;i++){
//             arr[i] = Integer.parseInt(c.readLine("Enter the Elements : "));
//         }

//         int sum = 0;

//         for(int i=0; i<sizeOfArray;i++){
//             sum += arr[i];
//         }

//         int avg = sum/sizeOfArray;

//         System.out.println("Average = "+avg);
        
//     }
// }


import java.io.Console;

public class AvgOfArrayElements{

    static double getAvg(int[] arr){
        int sum =0;
        int len = arr.length;
        for(int i=0;i<len;i++){
            sum += arr[i];
        }
        double avg = sum / len;
        return avg;
    }
    public static void main(String args[]){
        Console c = System.console();

        int sizeOfArray = Integer.parseInt(c.readLine("Enter the size of the array : "));

        int[] arr = new int[sizeOfArray];
        
        for(int i=0; i<sizeOfArray;i++){
            arr[i] = Integer.parseInt(c.readLine("Enter the Elements : "));
        }
        System.out.println("The Average of elements of Array is : "+ getAvg(arr));
    }
}
