package Homework29022020;

public class FibonacciSeries {
    public FibonacciSeries()
    {
    }

    public static void main(String[] args) {
        int n = 10, t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");
        for (int i = 1; i <= n; ++i) {
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
            System.out.print(t1 + "  ");
        }
        new FibonacciSeries().fibonacciWhile();
    }
    public void fibonacciWhile()
    {
        int i = 1, n = 10, t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");

        while (i <= n)
        {
            System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
            i++;
        }
    }
}
