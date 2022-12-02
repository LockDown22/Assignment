public class Stack implements IStackQueue {
    private int[] array;
    private int SIZE;
    private int top;
    Stack(int size){
        SIZE = size;
        array = new int[SIZE];
        top = -1;
    }

    @Override
    public boolean push(int value) {
        // TODO Auto-generated method stub
        if(!isFull()){
            top++;
            array[top] = value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        // TODO Auto-generated method stub
        if(!isEmty()){
            int value = array[top];
            top--;
            return value;
        }
        return -1;
    }

    @Override
    public boolean isEmty() {
        // TODO Auto-generated method stub
        return top < 0;
    }

    @Override
    public boolean isFull() {
        // TODO Auto-generated method stub
        return top == SIZE -1;
    }

    @Override
    public void show() {
        // TODO Auto-generated method stub
        if(isEmty()){
            System.out.println("Stack is empty");
        }else{
            for(int i =0; i<=top;i++){
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
        
    }
    
}
