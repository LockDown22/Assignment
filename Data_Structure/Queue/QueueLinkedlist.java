package Data_Structure.Queue;
import Interface.IStackQueue;

public class QueueLinkedlist implements IStackQueue {

    private class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    Node headNode,tailNode;

    QueueLinkedlist(){
        tailNode = headNode = null;
    };

    @Override
    public boolean push(int value) {
        // TODO Auto-generated method stub
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
        }

        // if(headNode.next == null){
        //         headNode =null;
        // }else{
            int value = headNode.value;
            headNode = headNode.next;
            // pop();
        // }

        return value;
    }

    @Override
    public boolean isEmty() {
        // TODO Auto-generated method stub
        return headNode == null && tailNode == null;
    }

    @Override
    public boolean isFull() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void show() {
        // TODO Auto-generated method stub
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
        QueueLinkedlist mqueue = new QueueLinkedlist();

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
