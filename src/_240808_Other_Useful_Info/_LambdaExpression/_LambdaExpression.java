package _240808_Other_Useful_Info._LambdaExpression;

public class _LambdaExpression {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World");
            }
        });
        t1.start();

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable Class");
            }
        };
        r1.run();

        Runnable r2 = () -> System.out.println("R2 Runnable Class");

        r2.run();

        Runnable r3 = () -> {
            System.out.println("R3 Runnable Class");
        };
        r3.run();

        _Mathematics sum = new _Mathematics() {
            @Override
            public int transaction(int a, int b) {
                return a + b;
            }
        };

        System.out.println(sum.transaction(5, 8));

        _Mathematics sumLambda = (a, b) -> a + b;

        System.out.println("Lambda: " + sumLambda.transaction(5, 8));

        _Mathematics extraction = new _Mathematics() {
            @Override
            public int transaction(int a, int b) {
                return a - b;
            }
        };
        System.out.println(extraction.transaction(10, 3));

        _Mathematics extractionLambda = (a, b) -> a - b;
        System.out.println("Lambda: " + extractionLambda.transaction(10, 3));

        _Mathematics multiply = new _Mathematics() {
            @Override
            public int transaction(int a, int b) {
                return a * b;
            }
        };
        System.out.println(multiply.transaction(5, 15));

        _Mathematics multiplyLambda = (a, b) -> a * b;
        System.out.println("Lambda: " + multiplyLambda.transaction(5, 15));

        _Mathematics divide = new _Mathematics() {
            @Override
            public int transaction(int a, int b) {
                if (b == 0) {
                    b = 1;
                }
                return a / b;
            }
        };
        System.out.println(divide.transaction(30, 0));

        _Mathematics divideLambda = (a, b) -> {
            if (b == 0) {
                b = 1;
            }
            return a / b;
        };
        System.out.println("Lambda: " + divideLambda.transaction(30, 0));

    }
}
