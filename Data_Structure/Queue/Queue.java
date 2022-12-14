package Data_Structure.Queue;
import Data_Structure.Interface.IStackQueue;

public class Queue implements IStackQueue {

    private class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    Node headNode,tailNode;

    Queue(){
        tailNode = headNode = null;
    };

    @Override
    public boolean push(int value) {

        Node node = new Node(value);
        if(isEmty()){
           headNode = tailNode = node;   
        }else{
            tailNode.next = node;
            tailNode = node;
        }   
        return false;
    }

    @Override
    public int pop() {
        if(isEmty()){
            System.out.println("Stack empty");
            return 0;
        }
            int value = headNode.value;
            headNode = headNode.next;
        return value;
    }

    @Override
    public boolean isEmty() {

        return headNode == null && tailNode == null;
    }

    @Override
    public boolean isFull() {

        return false;
    }

    @Override
    public void show() {

        if(isEmty()){
            System.out.println("Stack empty");
            return;
        }else{
            Node temp = headNode;
            while(temp!=null){
                System.out.println(temp.value + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Queue mqueue = new Queue();

       for(int i=0;i<5;i++){
        mqueue.push(i);
       }
       mqueue.show();

       for(int i=0;i<5;i++){
        mqueue.pop();
        mqueue.show();
       }
    }
    
}
