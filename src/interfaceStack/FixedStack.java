package interfaceStack;

public class FixedStack implements IntStack {
    private int[] myStack;
    private int index;

    FixedStack(int size) {
        myStack = new int[size];
        index = -1;
    }

    public void push(int item) {
        if(index == myStack.length - 1) {
            System.out.println("The stack is full");
        } else {
            myStack[++index] = item;
        }
    }

    public int pop() {
        if(index < 0) {
            System.out.println("Stack underflow");
            return 0;
        } else {
            return myStack[index--];
        }
    }
}
