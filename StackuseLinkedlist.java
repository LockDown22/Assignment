public class StackuseLinkedlist implements IStackQueue {

    private class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    Node topNode;

    StackuseLinkedlist(){
        topNode = null;
    }

    @Override
    public boolean push(int value) {
        // TODO Auto-generated method stub
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
        // TODO Auto-generated method stub
        if(isEmty()){
            return -1;
        }
        int value = topNode.value;
        topNode = topNode.next;
        return value;
    }

    @Override
    public boolean isEmty() {
        // TODO Auto-generated method stub
        return topNode == null;
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
            Node temp = topNode;
            while(temp!=null){
                System.out.println(temp.value + " ");
                temp = temp.next;
            }
        }
        
    }

    public static void main(String[] args) {
        StackuseLinkedlist mStack = new StackuseLinkedlist();
    
        
    }
    
}
