package factorial;

public class FactorialDriver {
    public static void main(String[] args) {
        System.out.println(new Factorial().factorial(10));

        System.out.println(new Factorial().factorialLoop(10));
    }
}
