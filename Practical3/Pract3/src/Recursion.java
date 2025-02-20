import java.util.Scanner;
public class Recursion {

    public static void main(String [] args)
    {
        Scanner keyboardIn = new Scanner(System.in);

        //Thing 1
        /*int num = 4;
        myMethod(num);*/



        System.out.println("Type number: ");
        int num2 = keyboardIn.nextInt();

        //Thing 2 and 3
        int result = myFactorial(num2);
        System.out.println(result);
    }

    //Thing 1
    /*public static void myMethod(int counter)
    {
        if(counter == 0)
        return;

        else
        {
            System.out.println("hello " + counter);
            myMethod(--counter);
            System.out.println(""+counter);
            return;
        }
    }*/


    //Thing 2
    /*public static int myFactorial( int number){
        if (number==1){
            return 1;
        }

        else{
            return(number*(myFactorial(number-1)));
        }
    }*/


    //Thing 3
    public static int myFactorial( int number) {
        if (number == 0) {
            return 1;
        }
        return factorial_i(number,1);
    }

    public static int factorial_i( int currentNumber, int sum) {
        if (currentNumber == 1) {
            return sum;
        } else {
            return factorial_i(currentNumber - 1, sum*currentNumber);
        }
    }
}
