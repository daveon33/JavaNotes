package interfaces;

public class AnotherClient implements Callback {
    @Override
    public void callback(int data) {
        System.out.println("Each class has the autonomy for the construction of the methods");
        System.out.println("P squared is " + (data * data));
    }


}
