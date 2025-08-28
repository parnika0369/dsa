package JavaCollections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueprac{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(12);
        pq.offer(13);
        pq.offer(89);
        pq.offer(9);
        pq.offer(2);
        pq.offer(45);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);

    }
}

