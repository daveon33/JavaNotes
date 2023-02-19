package nestedInterfaces;

public class B implements A.NestedIF {

    @Override
    public boolean isNotNegative(int n) {
        if(n < 0) {
            return false;
        }

        return true;
    }
}
