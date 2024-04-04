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
public class Node <E extends Comparable> {
    public E data;
    public Node <E> next;
    public Node(E data){
        this.data = data;
        this.next = null;
    }
    
    public boolean equals(Node node){
        return false;
    }
    
    public int compareTo(Node node){
        if (node == null) {
            throw new NullPointerException("Cannot compare with a null node.");
        }

        return this.data.compareTo(node.data);
    }
}
