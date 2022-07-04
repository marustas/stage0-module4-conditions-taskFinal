package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        int result1 = dividend / divider;
        int result2 = result1 * divider;
        if (result2 == dividend) {
            System.out.println("can be divided completely");
        } else if (result2 == 0) {
            System.out.println("division by zero");
        } else {
            System.out.println("cannot be divided completely");
        }
    }
}

