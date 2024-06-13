package intermediate.lambdaexpr;

public class FuncInterfaceExample {

    public static void main(String[] args) {
        // Declare anonymous class
        // new via interface and implement
        var declaredAnonymousClass = new MyFuncInterface() {
            @Override
            public double doubleValue(int n) {
                return n * 2;
            }
        };
        System.out.println(declaredAnonymousClass.doubleValue(5));
    }
}
