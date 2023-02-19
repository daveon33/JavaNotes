package interfaceStack;

public class IFTest3 {
    public static void main(String[] args) {
        IntStack myStack;
        DinamicStack ds = new DinamicStack(5);
        FixedStack fs = new FixedStack(8);

        myStack = ds;
        for(int i = 0; i < 12; i++) myStack.push(i);

        myStack = fs;
        for(int i = 0; i < 8; i++) myStack.push(i);

        myStack = ds;
        System.out.println("My dynamic stack: ");
        for(int i = 0; i < 12; i++) {
            System.out.println(myStack.pop());
        }

        myStack = fs;
        System.out.println("My fixed stack: ");
        for(int i = 0; i < 8; i++) {
            System.out.println(myStack.pop());
        }
    }
}
