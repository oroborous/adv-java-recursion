package stackframe;

import java.time.LocalDate;

public class Calculator {
    public String calculate(char c) {
        int charNum = Character.getNumericValue(c);
        int dayNum = LocalDate.now().getDayOfMonth();

        String result = multiply(charNum + dayNum);

        System.out.println("Processed char " + c + " + (charNum " + charNum + ", dayNum " + dayNum + ")");
        return result;
    }

    public String format(long x) {
        String formatter = "--- %10d ---";

        String result = String.format(formatter, x);

        System.out.println("Processed long " + x);
        return result;
    }

    public String multiply(int a) {
        double randomNum = Math.random() * a;
        long rounded = Math.round(randomNum);

        String result = format(a * rounded);

        System.out.println("Processed int " + a + " (randomNum " + randomNum + ")");
        return result;
    }


}
