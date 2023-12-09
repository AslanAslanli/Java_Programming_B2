package day42_maps.collection;

import java.util.PriorityQueue;

public class QueueObject {
    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(2);
        queue.offer(10);
        queue.add(8);
        queue.offer(1);
        queue.add(1);
        try {
            queue.add(null);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(queue);
        //queue.get(2);

        queue.remove(3);
        System.out.println(queue.remove(3));
        queue.remove(1); // it removes the first matching one
        System.out.println(queue);

        queue.poll(); // it removes the elements from beginning
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.remove());

        System.out.println(new PriorityQueue<>().remove());


    }
}
