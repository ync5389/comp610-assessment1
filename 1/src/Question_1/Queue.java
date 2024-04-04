/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_1;

/**
 *
 * @author xhu
 * 
 */


public class Queue <E extends Comparable>{
    private LinkedList<E> test = new LinkedList();


    public void enqueue(E data){
        test.add(data);
    }
    
    public E dequeue(int index){
        E out;
        if(index != 0){
            out=null;
            test.removeFromHead();
        }
        
        out = test.getData(0);
        return out;
    }
    
    public void printQueue(){
        test.printLinkedList();
    }
    
    public int getSize(){
        return 0;
    }
}
