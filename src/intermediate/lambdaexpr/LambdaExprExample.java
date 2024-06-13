package intermediate.lambdaexpr;

public class LambdaExprExample {

    public static void main(String[] args) {
        // (parameter list) example (a, b)
        // -> create function/method
        // {} Lambda/Method body

        // () -> {} // 0 argument
        // (a) -> {} // 1 argument
        // (a,b) -> {} // 2 arguments
        MyFuncInterface declaredLambdaExpression = (n) -> {
            System.out.println(STR."Received: \{n}");
            return n * 2;
        };
        System.out.println(declaredLambdaExpression.doubleValue(5));
    }
}
