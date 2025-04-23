package com.pramod.java.java8.multithreading.producerconsumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class BlockingQueue <E>{

    private Queue<E> queue;
    int queueSize = 10;
    private ReentrantLock reentrantLock = new ReentrantLock(true);

    public BlockingQueue(){
        Queue<E> queue = new LinkedList<>();
    }
    public BlockingQueue(int queueSize){
        this.queueSize=queueSize;
        Queue<E> queue = new LinkedList<>();
    }

    public void put(E e){

        reentrantLock.lock();
         Condition full = reentrantLock.newCondition();
        try{
            if(queue.size()==queueSize){
                full.await();
            }
            queue.add(e);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        } finally {
            reentrantLock.unlock();
        }

    }
    public void consume(){
        reentrantLock.lock();
        Condition notFull  = reentrantLock.newCondition();

        try{
            if(queue.size()==0)
                notFull.await();
            queue.remove();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            reentrantLock.unlock();
        }

    }
}
