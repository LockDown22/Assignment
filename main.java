public class main {
    public static void main(String[] args) {
        Stack myStack = new Stack(3);

        for(int i = 1 ; i< 4 ;i++ ){
            myStack.push(i);
        }
        myStack.show();

        for(int i = 1 ; i<4 ;i++){
            myStack.pop();
            myStack.show();
        }


        Queue mQueue = new Queue(3);
        for(int i = 1 ; i<4 ;i++ ){
            mQueue.push(i);
        }
        mQueue.show();

        mQueue.pop();
        mQueue.show();
        mQueue.pop();
        mQueue.show();
        mQueue.pop();
        mQueue.show();
        mQueue.pop();
        mQueue.show();
    }
}
