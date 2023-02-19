package interfaces;

public class Client implements Callback {

    @Override
    public void callback(int data) {
        System.out.println("My callback with: " + data);
    }

    void unrelatedMethod() {
        System.out.println("This method is not required by the interface");
    }
}
