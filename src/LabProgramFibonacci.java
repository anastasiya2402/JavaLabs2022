import java.util.Scanner;

public class LabProgramFibonacci {
    public static int fibonacci(int n) {
        /* Type your code here. */
        int fib;
        int last;
        int previous;

        if (n<0)
            return -1;

        last =1;
        previous = 0;
        for (int i=0; i<n; i++){
            fib = last + previous;
            previous = last;
            last =fib;
        }
        return previous;

    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int startNum;

        startNum = scnr.nextInt();
        System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
    }
}
