package Threads_Concepts_WithExamples.Interview_Examples.Producer_Consumer_Explaination;

import java.util.LinkedList;
import java.util.Queue;

public class ProduceConsumer {

    public static void main(String[] args) {
        Object lock = new Object();
        Queue<Integer> q = new LinkedList<>(); // momo plate  ===> to understand this see Restaurant example in same package
        int size = 10;

        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                int count = 0;
                while (true) {
                    synchronized (lock) {
                        while (q.size() == size) {
                            try {
                                lock.wait(); // Wait if the queue is full
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        q.offer(count++);
                        System.out.println("Produced :: " + (count));
                        lock.notifyAll(); // Notify consumers that new item is available
                        try {
                            Thread.sleep(1000); // Simulate time taken to produce
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        Thread consumer = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (lock) {
                        while (q.size() == 0) {
                            try {
                                lock.wait(); // Wait if the queue is empty
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        int value = q.poll();
                        System.out.println("Consumed :: " + value);
                        lock.notifyAll(); // Notify producers that space is available
                        try {
                            Thread.sleep(800); // Simulate time taken to consume
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        producer.start();
        consumer.start();
    }
}

