import java.io.Console;

public class ExtremeElementAtAlternateManner {

    static void extremeElements(int[] arr){
        int i=0;int j=arr.length -1;

        while(i<j){
            System.out.print(arr[i] + " " +arr[j] + " ");
            i++;
            j--;
            if(i==j){
                System.out.print(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        Console c = System.console();

        int n = Integer.parseInt(c.readLine("Enter Array's Size: "));
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(c.readLine("Enter the element at index "+i+" : "));
        }

        System.out.println("The Extreme elements at alternate manners are : ");
        extremeElements(arr);
    }
}
