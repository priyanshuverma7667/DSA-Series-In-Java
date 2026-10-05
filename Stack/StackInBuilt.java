package Stack;
import java.util.Stack;

public class StackInBuilt {
    public static void main(String args[]){

    Stack stck = new Stack();
    stck.push(10);
    stck.push(20);
    stck.push(30);
    stck.push(40);
    stck.push(50);

    stck.pop();
    stck.peek();

    
    System.out.println(stck);
    
    }
}
