/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_1;

/**
 *
 * @author xhu
 */
public class Stack <E extends Comparable>{
    LinkedList<E> test = new LinkedList();
    
    public void push(E data){
        test.add(data);
    }
    
    public E pop(){
        E out = test.getData(0);
        return out;
    }
    
    public void printStack(){

    }
    
    public int getSize(){
        return 0;
    }

    public boolean isEmpty(){
        if(test == null){
            return true;
        }else{
                return false;
            }
    }
}
