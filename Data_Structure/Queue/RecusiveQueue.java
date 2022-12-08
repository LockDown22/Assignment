package Data_Structure.Queue;


public class RecusiveQueue{
    
     private class Node{
        int value;
        Node next;
        Node pre;
        public Node(int value,Node node){
            this.value = value;
            this.pre = node;
        }
    }

    Node headNode,tailNode;

    // public Node node = null;

    RecusiveQueue(){
        tailNode = headNode = null;
    };

  
    public boolean push(int value) {

        Node fnode = new Node(value,tailNode);
        if(isEmty()){
           headNode = tailNode = fnode;   
        }else{
            tailNode.next = fnode;
            tailNode = fnode;
        }   
        return false;
    }


    public int pop() {
        if(isEmty()){
            System.out.println("Stack empty");
            return 0;
        }
        if(tailNode.pre == null){
            int value = headNode.value;
            headNode = headNode.next;
            return value;
        }
           
        return pop();
    }


    public boolean isEmty() {

        return headNode == null && tailNode == null;
    }

    public boolean isFull() {

        return false;
    }


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

    //    for(int i=0;i<5;i++){
        mqueue.pop();
        mqueue.show();
    //    }
    }
}
