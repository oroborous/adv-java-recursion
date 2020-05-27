package factorial;

public class Factorial {
    public int factorial(int of) {
        if (of == 0) {
            return 1;
        }

        return of * factorial(of - 1);
    }

    public int factorialLoop(int of) {
        int result = of;

        while (of > 1) {
            result *= of-- - 1;
        }

        return result;
    }
}
