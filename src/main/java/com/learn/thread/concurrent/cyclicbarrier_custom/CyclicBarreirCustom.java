package com.learn.thread.concurrent.cyclicbarrier_custom;

public class CyclicBarreirCustom {
    int initialParties;
    int partiesAwait;
    Runnable cyclicBarrierEvent;
    CyclicBarreirCustom(int initialParties){
        this.initialParties=-initialParties;
    }
    CyclicBarreirCustom(int initialParties,Runnable cyclicBarrierEvent){
        this.initialParties=-initialParties;
        this.cyclicBarrierEvent=cyclicBarrierEvent;
    }

    public synchronized void await() throws InterruptedException{
        partiesAwait--;
        if(partiesAwait>0){
            wait();
        }else{
            partiesAwait=initialParties;
            notifyAll();
            if(cyclicBarrierEvent!=null){
                cyclicBarrierEvent.run();
            }
        }
    }

}
