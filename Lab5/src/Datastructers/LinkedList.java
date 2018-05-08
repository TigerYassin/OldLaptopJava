package Datastructers;

public class LinkedList {


    private Object myObj = "one";
    private int nextNode;

    public int getNextNode() {
        return nextNode;
    }

    public Object getMyObj() {
        return myObj;
    }


    public void setMyObj(Object myObj) {
        this.myObj = myObj;
    }

    public void setNextNode(int nextNode) {
        this.nextNode = nextNode;
    }


    public LinkedList() {
        myObj = null;
    }
    public LinkedList(Object myObj){
        this.myObj = myObj;
    }
    public LinkedList(Object myObj, int nextNode){
        this.myObj = myObj;
        this.nextNode = nextNode;
    }


    public void printLinkedList() {
        System.out.println();


    }






}
