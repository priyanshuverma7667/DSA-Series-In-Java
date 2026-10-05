package LinkedListPractice;

public class LinkedListMannual{
    public static void main(String args[]){
        
        LinkedList nums = new LinkedList();

        nums.add(5);
        nums.add(6);
        nums.add(2);
       

        System.out.println("Before addFirst & delete call : ");
        nums.printValue();

        
        nums.addFirst(9);
        nums.delete(2);
        nums.printValue();
    }
}