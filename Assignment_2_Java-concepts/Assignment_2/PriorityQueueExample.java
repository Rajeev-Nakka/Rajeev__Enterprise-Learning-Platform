import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(50);
        pq.add(20);
        pq.add(70);
        pq.add(10);

        while(!pq.isEmpty()) {

            System.out.println(pq.poll());   //poll removes first element 
// System.out.println(pq.peek());  //only shows first element
        }

    }

}