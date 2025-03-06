public class FibonacciSequence {

    public static void main(String[] args) {
        // Number of Fibonacci numbers to generate
        int n = 20;

        // Initialize the first two numbers in the Fibonacci sequence
        int first = 0;
        int second = 1;

        // Print the first two numbers
        System.out.print("First " + n + " numbers in the Fibonacci sequence: ");
        System.out.print(first + " " + second + " ");

        // Loop to generate and print the next numbers in the sequence
        for (int i = 2; i < n; i++) {
            // Calculate the next Fibonacci number by summing the previous two
            int next = first + second;

            // Print the next Fibonacci number
            System.out.print(next + " ");

            // Update the values of 'first' and 'second' for the next iteration
            first = second;
            second = next;
        }
    }
}
