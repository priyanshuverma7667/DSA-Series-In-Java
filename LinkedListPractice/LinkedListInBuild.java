package LinkedListPractice;

import java.util.LinkedList;

public class LinkedListInBuild{
    public static void main(String args[]){
        LinkedList<Integer> nums = new LinkedList<>();

        nums.add(5);
        nums.add(6);
        // nums.peek();

        System.out.println("First element (peek): " + nums.peek()); 
        nums.addFirst(8);
        System.out.println(nums);
    }
}