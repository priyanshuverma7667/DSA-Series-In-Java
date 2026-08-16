import java.io.Console;
// import java.util.Arrays;

public class SumNegPosValue {

    static int[] sumOfPosNeg(int[] arr){
        int sumPosVal =0,sumNegVal=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i] >= 0){
             sumPosVal += arr[i];
            }
            else{
                sumNegVal += arr[i];
            }
        }
        int ans[] = {sumPosVal,sumNegVal};
        return ans;
    }

    public static void main(String[] args) {
        Console c = System.console();

        int sizeOfArray = Integer.parseInt(c.readLine("Enter the size of the array : "));

        int[] arr = new int[sizeOfArray];
        for(int i=0; i<sizeOfArray;i++){
            arr[i] = Integer.parseInt(c.readLine("Enter the Elements of index "+i+" : "));
        }
        int[] ans = sumOfPosNeg(arr);
        System.out.println("The Sum of Positive elements of the array is : "+ ans[0]);
        System.out.println("The Sum of Negative elements of the array is : "+ ans[1]);
        // System.out.println("The sum of Positive and Negative: Values are : "+ Arrays.toString(sumOfPosNeg(arr)));
    }
}