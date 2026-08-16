import java.io.Console;
import java.util.Arrays;

public class MultEachElemntBy10 {
    static int[] getNewArray(int[] arr){
        int newarr[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            newarr[i] = arr[i]*10;
        }
        return newarr;
    }
    public static void main(String[] args) {
        Console c = System.console();

        int sizeOfArray = Integer.parseInt(c.readLine("Enter the size of the array : "));
        int[] arr = new int[sizeOfArray];
        
        for(int i=0; i<sizeOfArray;i++){
            arr[i] = Integer.parseInt(c.readLine("Enter the Elements : "));
        }
        System.out.println("The new array be like  : "+ Arrays.toString(getNewArray(arr)));
    }
}
