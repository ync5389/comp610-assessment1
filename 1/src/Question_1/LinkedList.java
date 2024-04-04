/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_1;

/**
 *
 * @author xhu
 * @param <E>
 */
public class LinkedList <E extends Comparable>{
    public int size = 0;
    public Node<E> head;
    
    public void addHead(E data) {
 
    }
    
    public Node getHead() {
        return null;
    }

    public void add(E data) {
        Node<E> temp = new Node<>(data);

        if (head == null) {
            head = temp;
        } else {
            Node<E> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = temp;
        }
        size++;
    }
    
    private void add(Node head, Node node) {
     
    }
    
    public void printLinkedList() {
        // Node temp = head;
        // while(temp != null){
        //     System.out.println("data" + temp.data);
        //     temp = temp.next;
        // }
        // int size = 0;

        Node<E> current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
            // size++;
        }
        // System.out.println(size + "size");
    }
    
    private void printLinkedList(Node node) {

    }
    
    public boolean contains(E data) {
        // Node<E> current = new Node<> (data);

        // if (head != null){
        //     while(current.data != data 
        //     && current.data != data.toUpperCase()){
        //         current = current.next;
        //     }
        //     return true;
        // }


        // return false;

        Node<E> current = head;

        while (current != null) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    private boolean contains(Node head, Node node) {
        return false;
    }
    
    public void remove(E data) {
        Node<E> current = head;
        Node<E> prev = null;

        while (current != null) {
            if (current.data.equals(data)) {
                // Found the node to remove
                if (prev != null) {
                    // Update the previous node's next pointer
                    prev.next = current.next;
                } else {


                    // If the node to remove is the head, update the head
                    head.data = current.next.data;
                    head.next = current.next.next;
                }
                break; // Exit the loop after removal
            }
            prev = current;
            current = current.next;
        }
    }
    
    public void remove(int index) {
        // Node temp = head;
        // int index = 0;
        //     while(temp != null && temp.next != null){
        //         System.out.println("xxx");
        //         if(index + 1 == position){
        //             temp = temp.next.next;
        //         } else {
        //             temp = temp.next;
        //         }
        //         index++;
        //     }
            
        //     head = temp;

        if (index < 0) {
            throw new IllegalArgumentException("Index cannot be negative.");
        }

        Node<E> current = head;
        Node<E> prev = null;
        int currentIndex = 0;

        while (current != null) {
            if (currentIndex == index) {
                // Found the node to remove
                if (prev != null) {
                    // Update the previous node's next pointer
                    prev.next = current.next;
                } else {
                    // If the node to remove is the head, update the head
                    head.data = current.next.data;
                    head.next = current.next.next;
                }
                break; // Exit the loop after removal
            }
            prev = current;
            current = current.next;
            currentIndex++;
        }

        if (current == null) {
            throw new IndexOutOfBoundsException("Index out of bounds.");
        }

    }
    
    private void removeByIndex(Node head, int position) {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        if (position == 0) {
            head = head.next;
            return;
        }

        Node current = head;
        Node prev = null;
        int count = 0;

        while (current != null) {
            if (count == position) {
                prev.next = current.next;
                return;
            }
            prev = current;
            current = current.next;
            count++;
        }
    }
    
    private void removeFromBody(Node head, Node node) {

    }
    
    public Node removeFromHead() {

        if (head.next == null) {
            return null;
        }

        Node<E> removedNode = head.next;
        head.data = removedNode.data;
        head.next = removedNode.next;

        return removedNode;
    }
    
    public Node removeFromTail() {
        Node<E> current = head;
        Node<E> prev = null;

        while (current.next != null) {
            prev = current;
            current = current.next;
        }

        if (prev != null) {
            prev.next = null;
        } else {
            head.data = null;
            head.next = null;
        }

        return null;
    }
    
    private Node removeFromTail(Node node) {
        return null;
    }
    
    public void addInOrder(E data) {
        // Node <E> newNode = new Node<>(data);

        // if (head == null) {
        //     head = new Node<>(data);
        // } 

        // if (head.next == null || head.data.compareTo(data) >= 0) {
        //     newNode.next = head.next;
        //     head.next = newNode;
        //     return;
        // }

        // Node <E> current = head.next;
        // Node <E> prev = head;

        // while (current != null && current.data.compareTo(data) < 0) {
        //     prev = current;
        //     current = current.next;
        // }

        // prev.next = newNode;
        // newNode.next = current;
        
        // this.removeByIndex( head, 0);

        Node<E> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
            return;
        }

        if (data.compareTo(head.data) < 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node<E> current = head;
        while (current.next != null && data.compareTo(current.next.data) >= 0) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;

    }
    
    private void addInOrder(Node currentNode, Node newNode) {
        // if (currentNode == null || newNode == null) {
        //     throw new IllegalArgumentException("Current node and new node cannot be null.");
        // }

        // while (currentNode.next != null && currentNode.next.data.compareTo(newNode.data) < 0) {
        //     currentNode = currentNode.next;
        // }

        // newNode.next = currentNode.next;
        // currentNode.next = newNode;
    }
    
    public Node getNode(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("Index cannot be negative.");
        }

        Node <E> current = head;
        int currentIndex = 0;

        while (current != null) {
            if (currentIndex == index) {
                return current;
            }
            current = current.next;
            currentIndex++;
        }

        return null;

    }
    
    private Node getNode(int index, Node head) {
        return null;
    }
    
    public E getData(int index) {
        // return head.data;

        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty.");
        }
        Node<E> current = head;
        int count = 0;
        while (current != null) {
            if (count == index) {
                return current.data; 
            }
            current = current.next;
            count++;
        }
        throw new IndexOutOfBoundsException("Index out of bounds.");
    }
    
    private E getData(int index, Node head) {
        return null;
    }

    public String get(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }    
}
