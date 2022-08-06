package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if (first == 0 || second == 0) {
            System.out.println(first == 0? second : first);
        }
        if (first >= second) {
            for (int i = second; i > 0; i--) {
                if (first % i == 0 && second % i == 0) {
                    System.out.println(i);
                    return;
                }
            }
        } else {
            for (int i = first; i > 0; i--) {
                if (first % i == 0 && second % i == 0) {
                    System.out.println(i);
                    return;
                }
            }
        }
    }
}
