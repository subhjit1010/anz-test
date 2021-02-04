package com.java.example1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Producer implements Runnable{
    private List<Integer> sharedQueue;
    private int maxSize = 2;

    public Producer(List<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        for(int i = 1; i<=10; i++){
            try {
                    produce(i);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    private void produce(int i) throws InterruptedException{
        synchronized (sharedQueue){
            while(sharedQueue.size()==maxSize){
                System.out.println("Queue is full, producerThread is waiting for "
                        + "consumerThread to consume, sharedQueue's size= "+maxSize);
                sharedQueue.wait();
            }
        }

        synchronized (sharedQueue){
            System.out.println("Produced :"+i);
            sharedQueue.add(i);
            Thread.sleep((long)(Math.random() * 1000));
            sharedQueue.notify();
        }
    }
}

class Consumer implements Runnable{
    private List<Integer>sharedQueue;

    public Consumer(List<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        while (true){
            try {
                consume();
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }

    }
    private void consume() throws InterruptedException{
        synchronized (sharedQueue){
            while(sharedQueue.size()==0){
                System.out.println("Queue is empty, consumerThread is waiting for "
                        + "producerThread to produce, sharedQueue's size= 0");
                sharedQueue.wait();
            }
        }

        synchronized (sharedQueue){
            Thread.sleep((long)(Math.random() * 2000));
            System.out.println("Consumed :"+sharedQueue.remove(0));
            sharedQueue.notify();
        }
    }
}
public class ProducerConsumerWaitNotify {
    public static void main(String[] args) {
        List<Integer> sharedQueue = new LinkedList<Integer>();
        Producer producer = new Producer(sharedQueue);
        Consumer consumer = new Consumer(sharedQueue);

        Thread producerThread = new Thread(producer, "ProducerThread");
        Thread consumerThread = new Thread(consumer, "ConsumerThread");
        producerThread.start();
        consumerThread.start();
    }
}
