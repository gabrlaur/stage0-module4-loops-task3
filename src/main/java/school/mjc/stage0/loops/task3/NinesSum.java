package school.mjc.stage0.loops.task3;

public class NinesSum {
    public static void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        int digit = 0;
        for (int i = 0; i < lengthOfLastNumber; i++) {
            digit = Integer.parseInt(digit + "9");
            sum += digit;
        }
        System.out.println(sum);
    }
}
