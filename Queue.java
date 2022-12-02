public class Queue implements IStackQueue{


    private int[] array;
    private int SIZE;
    private int head;
    private int tail;
    Queue(int size){
        SIZE = size;
        array = new int[SIZE];
        head = tail = -1;
    }

    @Override
    public boolean push(int value) {
        // TODO Auto-generated method stub
        if(!isFull()){
            if(isEmty()){
                head++;
            }
            tail++;
            array[tail] = value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        // TODO Auto-generated method stub
        int value = -1;
        if(!isEmty()){
            value = array[head];
            head++;
            if(head > tail){
                head = tail = -1;
            }
        }
        return value;
    }

    @Override
    public boolean isEmty() {
        // TODO Auto-generated method stub
        return head == -1 && tail ==-1;
    }

    @Override
    public boolean isFull() {
        // TODO Auto-generated method stub
        return tail == SIZE - 1;
    }

    // public int count(){
    //     if(isEmty()){
    //         return 0;
    //     }
    //     return tail - head +1;
    // }

    @Override
    public void show() {
        // TODO Auto-generated method stub
        if(isEmty()){
            System.out.println("Stack is Empty");
        }else{
            for(int i = head; i <= tail; i++ ){
                System.out.print(array[i]+" ");

            }
            System.out.println();
        }
        
    }
    
}
