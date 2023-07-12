public class Recursion {
    public static void main(String args[]){
        // factorial
        // 5! = 5 * 4 * 3 * 2 * 1 = 120
        // int n = 5;
        // int fact = 1;
        // for(int i=1;i<=n;i++){
        //     fact *= i;
        // }

        // // System.out.println(fact);  // iterative method


        // // recursive
        // System.out.println(factorial(n));
        // fibanocii series
        // 0 1 1 2 3 5 8 13 .... 


        int first = 0;
        int second = 1;

        int nthNum = 20;

        int third = 0;
        for(int i=2;i<nthNum;i++){  // iterative
            third = first + second;
            first = second;
            second = third;
        }

        // System.out.println(third);

        // recursive

        System.out.println(fib(nthNum-1));

    }

    static int fib(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        return fib(n-1) + fib(n-2);
    }

    static int factorial(int n){
        if(n == 1){
            return 1;
        }

        return n * factorial(n-1);  // 5 * (4 * factorial(3))
                                    // 5 * (4 * (3 * factorial(2)))
                                    // 5 * (4 * (3 * 2 * 1))
    }


}
