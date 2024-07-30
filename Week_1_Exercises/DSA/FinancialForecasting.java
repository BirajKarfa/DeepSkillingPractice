/*
Recursive Algorithms:
    Recursion is a method where the solution to a problem depends on solutions 
    to smaller instances of the same problem. It simplifies certain problems by 
    breaking them down into smaller, more manageable sub-problems.

Advantages:
1. Simplifies code for problems that can be divided into similar sub-problems.
2. Reduces the need for complex looping constructs.
*/

public class FinancialForecasting {
    public static double calculateFutureValue(double presentValue, double growthRate, int periods) {
        if (periods == 0) {
            return presentValue;
        }
        return calculateFutureValue(presentValue * (1 + growthRate), growthRate, periods - 1);
    }

    public static void main(String[] args) {
        double presentValue = 1000.0;
        double growthRate = 0.05; 
        int periods = 10;

        double futureValue = calculateFutureValue(presentValue, growthRate, periods);
        System.out.println("Future Value: " + futureValue);
    }
}

/*
Time Complexity Analysis:
- Recursive Algorithm:
  - Time Complexity: O(n) - Each recursive call processes one period.
  - Space Complexity: O(n) - Due to the recursion stack.

Optimization:
- To avoid excessive computation, use memoization to store and reuse previously computed results.
- Alternatively, use an iterative approach to reduce space complexity to O(1).
*/

