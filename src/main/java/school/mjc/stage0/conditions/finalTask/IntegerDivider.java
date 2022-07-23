package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        if (divider == 0) {
            System.out.println("division by zero");
        }
        else {

            int result = dividend / divider;
            int i = result * divider;
            if (i == dividend && i != 0) {
                System.out.println("can be divided completely");
            } else if (i != dividend && i != 00) {
                System.out.println("cannot be divided completely");
            }


        }
    }
}
