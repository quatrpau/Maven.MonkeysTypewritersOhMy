package io.zipcoder;

import java.util.stream.Stream;

/**
 * Modify the run function so that the monkeys each grab the next word and write it to the copy.
 */
//make this as corrupt as possible
//
public class UnsafeCopier extends Copier {

    public UnsafeCopier(String toCopy) {
        super(toCopy);
    }

    public void run() {
        while(stringIterator.hasNext() /**!Thread.currentThread().isInterrupted()*/){
            //multiple Math.tan calls
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(factorial(51));
            copied = copied + stringIterator.next();
        }
    }
    private int factorial(int start){
        if(start == 1){
            return start;
        }
        else{
            return start * factorial(start - 1);
        }
    }
    public String getCopy(){
        return copied;
    }
}
