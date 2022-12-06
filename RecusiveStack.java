public class RecusiveStack implements IStackQueue{

    private class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    Node topNode;

    RecusiveStack(){
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
        int value = topNode.value;
        topNode = topNode.next;
        return value;
    }

    public int remove(){
        if(isEmty()){
            System.out.println("Stack is empty");
            return 0;
        }
        pop();
        return remove();
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
        RecusiveStack mstack = new RecusiveStack();

        for(int i = 0; i<=5;i++){
            mstack.push(i);
        }
        mstack.show();

        mstack.remove();

    }
    
}
