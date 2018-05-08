package library;

public abstract class MyLib {

    /**
     * Calculates the sum of elements in the given array.
     *
     * @param arr
     * @return
     */
    public static int sum(int[] arr) {

        int t = 0;
        for (int x : arr){
            t+=x;
        }
        return t;
    }

    /**
     * Calculates the following sum:
     *
     * SUM(n) = 1 + 2 + 3 +... + n
     *
     * @param n
     * @return
     */
    public static int sum_Iterative(int n) {
        int t =0;

        for (int x = 0; x <= n; x++ ){
            t+=x;
        }
        return t;
    }

    /**
     * Calculates the following sum (recursively):
     *
     * SUM(n) = 1 + 2 + 3 +... + n = = n + [1 + 2 + 3 + .. + (n-1)]
     *
     * [Tail Recursion]
     * SUM(3) = ?
     *
     * 3 + SUM(2)
     * 3 + 2 + SUM(1)
     * 3 + 2 + 1
     *
     * > 6
     *
     * @param n
     * @return
     */
    public static int sum_Recursive1(int n) {

        if (n == 0){
            return 0;
        }

        return(n + sum_Recursive1(n-1));

    }

    /**
     * Calculates the following sum (recursively):
     *
     * SUM(n) = 1 + 2 + 3 +... + n = = n + [1 + 2 + 3 + .. + (n-1)]
     *
     * [Head Recursion]
     * SUM(3, 0) = ?
     *
     * SUM(2, 3)
     * SUM(1, 5)
     * SUM(0, 6)
     *
     * > 6
     *
     * @param n
     * @return
     */
    public static int sum_Recursive2(int n, int sum) {

        if (n == 0){
            return sum;
        }
        return sum_Recursive2(n-1, sum + n);
    }


    /**
     * Calculates the sum of the passed distances for the following
     * situation:
     * 		Can a rabbit goes from point A to point B, if in each
     * 		move it jumps as long as half of the remaining distance?
     *
     *
     * @param r
     * @param n
     * @return
     */
    public static double rabbitJump_Iterative(double r, int n){
        //r is what you divide by
        //n is amount of steps you wish to take
        for(int t = 0; t < n; t++){
            r = r/2;
        }

        return r;

    }

    /**
     * Calculates the sum of the passed distances for the following
     * situation:
     * 		Can a rabbit goes from point A to point B, if in each
     * 		move it jumps as long as half of the remaining distance?
     *
     *
     * @param r
     * @param n
     * @return
     */
        public static double rabbitJump_convergence(double r, int n) {  //Use an algorithm to solve

        return (r/Math.pow(2, n));

    }


    /**
     *  Calculates factorial of the given number:
     *
     *  n! = n X (n-1) X ... X 1
     *
     * [Head Recursion]
     * f(4) = ?
     * 4 * f(3)
     * 4 * (3 * f(2))
     * 4 * (3 * (2 * f(1)))
     * 4 * (3 * (2 * (1)))
     *
     * > 24
     *
     * @param n
     * @return
     */
    public static double factorial_Recursive1(double n) {

        if (n <= 0){
            return 1;
        }
        return (n * factorial_Recursive1(n-1));
    }

    /**
     *  Calculates factorial of the given number:
     *
     *  n! = n X (n-1) X ... X 1
     *
     * [Tail Recursion]
     * f(4) = ?
     * 4 * f(3)
     * 4 * (3 * f(2))
     * 4 * (3 * (2 * f(1)))
     * 4 * (3 * (2 * (1)))
     *
     * > 24
     *
     * @param n
     * @return
     */
    public static double factorial_Recursive2(double n, double fact) {


        if (n <= 1){
            return fact;
        }

        return factorial_Recursive2(n-1, fact * n);
    }

    /**
     *  Calculates factorial of the given number:
     *
     *  n! = n X (n-1) X ... X 1
     *
     * @param n
     * @return
     */
    public static double factorial_Iterative(double n) {

        int t = 1;

        for (int x =1; x <= n; x++){
            t*= x;
        }
        return t;
    }


    /**
     * Generates the Fibonacci sequence using recursion:
     *
     * 		{1, 1, 2, 3, 5, 8, 11, 19, ...}
     *
     * @param n
     *            the index of the requested element from Fibonacci sequence
     * @return the n-th element of the sequence.
     */
    public static long fibonacci_Recursive(long n) {

        if (n == 0){
            return 0;
        }

        if (n==1){
            return 1;
        }


        return ( fibonacci_Recursive(n-1) + fibonacci_Recursive(n-2));

    }


    /**
     * Generates the Fibonacci sequence using
     * iteration:
     *
     * 		{1, 1, 2, 3, 5, 8, 11, 19, ...}
     *
     * @param n
     *            the index of the requested element from Fibonacci sequence
     * @return the n-th element of the sequence.
     */
    public static long fibonacci_Iterative(long n) {
        int sum = 1;
        int t1 = 1;
        int t2 = 0;
        for (int x =1; x < n; x++){
            t2 = t1;
            t1 = sum;
            sum = t1 + t2;

        }

        return t1;
    }



}