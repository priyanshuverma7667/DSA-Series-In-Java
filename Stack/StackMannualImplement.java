package Stack;

public class StackMannualImplement {
    public static void main(String args[]){

    Stack stck = new Stack();
    stck.push(10);
    stck.push(20);
    stck.push(30);
    stck.push(40);
    stck.push(50); 
    // stck.push(56);
    
    System.out.println(stck.pop());

    // stck.peek();

    
    stck.printStack();
    }
}
