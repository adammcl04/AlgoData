import java.util.Scanner;

public class Recursion
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      //1st Thing
      /*int num = 4;
      myMethod(num);*/
      
      
      //2nd Thing
      System.out.println("Type number: ");
      int num2 = keyboardIn.nextInt();
      int result = myFactorial(num2);
      System.out.println(result);
   }

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
   
   public static int myFactorial( int integer){
      if (integer==1){
      return 1;
      }
      
      else{
      return(integer*(myFactorial(integer-1)));
      }
   }
   
}