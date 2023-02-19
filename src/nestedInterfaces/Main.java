package nestedInterfaces;

public class Main {

    public static void main(String[] args) {

        A.NestedIF testingInter = new B();

        if(testingInter.isNotNegative(10))
            System.out.println("10 is not negative");
        if(testingInter.isNotNegative(-12))
            System.out.println("this won't be displayed");
    }
}
