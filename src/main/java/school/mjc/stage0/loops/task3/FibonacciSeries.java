package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int firstNumber = 0;
        int secondNumber = 1;
        int newNumber;
        for (int i = 0; i < lastFibonacci; i++) {
            if (i == 0) {
                System.out.println(firstNumber);
            } else if (i == 1) {
                System.out.println(secondNumber);
            } else {
                newNumber = firstNumber + secondNumber;
                System.out.println(newNumber);
                firstNumber = secondNumber;
                secondNumber = newNumber;
            }
        }
    }
}
