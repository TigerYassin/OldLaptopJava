package Datastructers;


public class Node {
    public Object data;
    public Node next = null;



   public Node(Object data) {
        this.data = data;
    }

    public void printMine(){
       System.out.println(data);
       System.out.println(next);
    }
}

class myLinkedList{
    public Node head = null;
    public Node end = null;



    void insert(Object data) {
        if(head == null) {
            head = new Node(data);
            end = head;
        } else {
            end.next = new Node(data);
            end = end.next;
        }
    }
    public void printAll() {
//        System.out.println(end.printMine());
    }
}



