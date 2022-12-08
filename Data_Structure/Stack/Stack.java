package Data_Structure.Stack;
import Data_Structure.Interface.IStackQueue;

public class Stack implements IStackQueue {

    private class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    Node topNode;

    Stack(){
        topNode = null;
    }

    @Override
    public boolean push(int value) {
        if(!isFull()){
            Node node = new Node(value);
            node.next = topNode;
            topNode = node;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {

        if(isEmty()){
            return -1;
        }
        int value = topNode.value;
        topNode = topNode.next;
        return value;
    }

    @Override
    public boolean isEmty() {

        return topNode == null;
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
            Node temp = topNode;
            while(temp!=null){
                System.out.println(temp.value + " ");
                temp = temp.next;
            }
        }
        
    }

    public static void main(String[] args) {
        Stack mStack = new Stack();
    
        
    }
    
}
