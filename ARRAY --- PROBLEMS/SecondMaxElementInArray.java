import java.io.Console;

public class SecondMaxElementInArray{

    // public static int max1;
    // private static int max2;
    public static void secondMaxElement(int[] arr){
        int len = arr.length;
        int max1,max2;
        if(arr[0] > arr[1]){
        max1 = arr[0];
        max2 = arr[1];
        }
        else{
        max1 = arr[1];
        max2 = arr[0];  
        }

        for(int i=2;i<len;i++){
            if(arr[i] > max1){
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i] > max2){
                max2 = arr[i];
            }
        }
        System.out.println("The 1 Maximum number is : "+max1);
        System.out.println("The 2 Maximum number is : "+max2);

    }
    public static void main(String args[]){
        Console c = System.console();

        int n = Integer.parseInt(c.readLine("Enter the size of the array : "));

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(c.readLine("Element at the index of "+i+" : "));
        }
        secondMaxElement(arr);
    }

}