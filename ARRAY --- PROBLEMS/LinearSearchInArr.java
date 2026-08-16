import java.io.Console;
// import java.util.Arrays;

public class LinearSearchInArr {
    static int findElement(int[] arr,int target){
        // int indx = 0;
        for(int i=0; i<arr.length;i++){
            if(arr[i] == target){
             return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Console c = System.console();

        int sizeOfArray = Integer.parseInt(c.readLine("Enter the size of the array : "));

        int[] arr = new int[sizeOfArray];
        
        for(int i=0; i<sizeOfArray;i++){
            arr[i] = Integer.parseInt(c.readLine("Enter the Elements of index "+i+" : "));
        }

        int target = Integer.parseInt(c.readLine("Enter the Element to find index of : "));
        System.out.println("The Index of elemnt in array is : "+ findElement(arr , target));
    }
}
