package interfaceStack;

public class IFTest {

    public static void main(String[] args) {

        FixedStack myStackOne = new FixedStack(5);
        FixedStack myStackTwo = new FixedStack(8);

        for(int i = 0; i < 5; i++) myStackOne.push(i);
        for(int i = 0; i < 8; i++) myStackTwo.push(i);

        System.out.println("My stack one: ");
        for(int i = 0; i < 5; i++) {
            System.out.println(myStackOne.pop());
        }

        System.out.println("My stack two: ");
        for(int i = 0; i < 8; i++) {
            System.out.println(myStackTwo.pop());
        }
    }
}
