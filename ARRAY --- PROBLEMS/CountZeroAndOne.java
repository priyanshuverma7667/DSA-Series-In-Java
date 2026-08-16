import java.io.Console;

public class CountZeroAndOne {

    static int[] countZeroAndOnes(int[] arr){
        int cntZero = 0,cntOne = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                cntZero +=1;
            }
            else if(arr[i] == 1){
                cntOne +=1;
            }
        }
        int ans[] = {cntZero,cntOne};
        return ans;
    }
    public static void main(String args[]){
        Console c = System.console();
        int n = Integer.parseInt(c.readLine("Enter the size of Array : "));

        int arr[] = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(c.readLine("Enter the index "+i+" elements is : "));
        }

        int[] ans = countZeroAndOnes(arr);
        
        System.out.println("the numbers of zeros = "+ans[0]);
        System.out.println("the numbers of ones = "+ans[1]);
    }
}
