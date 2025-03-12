
public class stacks
{
    final int MAXSIZE=10;
    int stack[] = new int[MAXSIZE];

    int top = -1;


    public void push(int elementToPush)
    {
        if(!isFull())
        {
            top++;
            stack[top]=elementToPush;
        }
            
    }

    public boolean isEmpty(){			
            if(top == -1)   
               return true;
            else
               return false;
         }
    public boolean isFull(){
        if(top == MAXSIZE-1)
            return true;
        else
            return false;
        }

    public int peek(){
        if(!isEmpty())
            return stack[top];
        else
            return -1;
    }

    public int size(){
            return top+1;
         }

         int printCount=0;

    public void print()
    {
        printCount++;

        if(isEmpty())
        {
            System.out.print("\nOutput "+printCount+" => empty stack");
        }
        else
        {
            System.out.print("\nOutput "+printCount+" => stack: [");
            for(int i=0; i<=top; i++)
            {
                if(i == top)
                {
                    System.out.print(stack[i]);
                }
                else
                {
                    System.out.print(stack[i]+ ",");
                }

            }
            System.out.print("]");
        }
    }
 
    public int pop(){
        int itemPopped=-1;
        if(!isEmpty())
        {
            itemPopped=stack[top];
            top--;
        }
        return itemPopped;
    }


        public static void main(String[] args)
        {
            stacks stackObj = new stacks();

            stackObj.push(42);
            stackObj.print();
            stackObj.push(62);
            stackObj.print();
            stackObj.push(99);
            stackObj.print();
            stackObj.pop();
            stackObj.print();
            stackObj.pop();
            stackObj.print();
            stackObj.pop();
            stackObj.print();
            stackObj.pop();
            stackObj.print();

        }

}
