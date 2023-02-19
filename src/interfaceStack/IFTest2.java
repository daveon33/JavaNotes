package interfaceStack;

public class IFTest2 {
    public static void main(String[] args) {
        DinamicStack myStackOne = new DinamicStack(5);
        DinamicStack myStackTwo = new DinamicStack(8);

        for(int i = 0; i < 12; i++) myStackOne.push(i);
        for(int i = 0; i < 20; i++) myStackTwo.push(i);

        System.out.println("My stack one: ");
        for(int i = 0; i < 12; i++) {
            System.out.println(myStackOne.pop());
        }

        System.out.println("My stack two: ");
        for(int i = 0; i < 20; i++) {
            System.out.println(myStackTwo.pop());
        }
    }
}
