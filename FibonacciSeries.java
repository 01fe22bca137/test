public class FibonacciSeries {
    public static void main(String[] args) {
        int n =5;
        System.out.println("Fibonacci series up to " + n + ":");
        printFibonacciSeries(n);
    }

    public static void printFibonacciSeries(int n) {
        int first = 0, second = 1, next;

        for (int i = 0; i < n; i++) {
            if (i <= 1) {
                next = i;
            } else {
                next = first + second;
                first = second;
                second = next;
            }
            System.out.print(next + " ");
        }
    }
}
