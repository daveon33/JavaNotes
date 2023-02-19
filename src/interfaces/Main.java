package interfaces;

public class Main {
    public static void main(String[] args) {

        Callback newCallback = new Client();
        AnotherClient ob = new AnotherClient();

        newCallback.callback(27);

        newCallback = ob;
        newCallback.callback(27);


    }
}