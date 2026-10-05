package QUeue;

public class QueueMannual {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(40);
        queue.enqueue(90);
        queue.enqueue(60);
        System.out.println("Dequeue element : "+queue.dequeue());
        queue.show();
        
    }
}
