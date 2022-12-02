public class main {
    public static void main(String[] args) {
        // StackuseLinkedlist myStack = new StackuseLinkedlist();

        // for(int i =1 ; i<=4;i++ ){
        // myStack.push(i);
        // }

        // myStack.show();
        // for(int i=1 ; i<4;i++ ){
        // myStack.pop();
        // myStack.show();
        // }

        // QueueLinkedlist myQueue = new QueueLinkedlist();

        // for(int i =1 ; i<=4;i++ ){
        // myQueue.push(i);
        // }
        // myQueue.show();

        // for(int i =1 ; i<=4;i++ ){
        // myQueue.pop();
        // myQueue.show();
        // }

        RecusiveStack myRERecusiveStack = new RecusiveStack();
        for (int i = 1; i <= 4; i++) {
            myRERecusiveStack.push(i);
        }
        myRERecusiveStack.show();

        myRERecusiveStack.pop();
        myRERecusiveStack.show();

    }
}
