package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int length = (t + "").length();
        int sum = 0;
        for (int i = length-1; i >= 0; i--) {
            int digit = i > 0? (int) (t / Math.pow(10, i)) : t;
            t = (int) (t - digit * Math.pow(10, i));
            sum += digit;
        }
        System.out.println(Math.abs(sum));
    }
}
