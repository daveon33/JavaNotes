package interfaceStack;

public class DinamicStack implements IntStack {

    private int[] myStack;
    private int index;

    DinamicStack(int size) {
        myStack = new int[size];
        index = -1;
    }

    public void push(int item) {
        if(index == myStack.length - 1) {
            int[] temp = new int[myStack.length * 2];
            for(int i = 0; i < myStack.length; i++) {
                temp[i] = myStack[i];
            }

            myStack = temp;
        }

        myStack[++index] = item;
    }

    public int pop() {
        if(index < 0) {
            System.out.println("Stack underflow");
            return 0;
        }

        return myStack[index--];
    }


}
