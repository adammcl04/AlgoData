
public class queue 
{

    final int QUEUESIZE=5;
    char[] queue = new char[QUEUESIZE];

    int head = 0; 
    int tail =-1;
    int noElements = 0;


    public void insert(char elementToInsert){

        if(noElements == QUEUESIZE){

            System.out.println("Error Queue is Full");
        }
        else
        {

            if(tail == (QUEUESIZE - 1))
            {

                tail=0;
            }
            else
            {

                tail++;
            }
            queue[tail] = elementToInsert;
            noElements++;
            
        }


    }
    public char remove() {
        char itemToReturn = queue[head];
        if (noElements == 0) 
        {
            System.out.println("Error: Queue is Empty");
            return '\0';  
        }

        else
        {
            itemToReturn = queue[head];
            if (head == (QUEUESIZE - 1)) 
            {
                head = 0;  
            } else 
            {
                head++;
    
            }
        noElements--;
        }
        return itemToReturn;
    }
    
    public boolean isEmpty()
    {
        if(noElements == 0)
            return true;
        else
            return false;
    }
    public boolean isFull()
    {
        if(noElements == QUEUESIZE)
            return true;
        else
            return false;
    }
    public char queueTop() {
        if (!isEmpty()) {
            return queue[head]; 
        } else {
            return '\0';  
        }
    }
    
    
    public int size()
    {
        return noElements;
    } 
    int printCount = 0;

    public void print()
    {
            printCount++;
      
            System.out.print("\nOutput "+printCount+" => Queue: [");
            for(int i=head; i<tail+1; i++)
            {
                if(i == (tail))
                {
                    System.out.print(queue[i]);
                }
                else
                {
                    System.out.print(queue[i]+ ",");
                }
                        
            }   
            System.out.print("]");

    }

    public static void main(String[] args) {

        queue queueObj = new queue();
        queueObj.insert('A');
        queueObj.print();
        queueObj.insert('B');
        queueObj.print();
        queueObj.insert('C');
        queueObj.print();
        queueObj.insert('D');
        queueObj.print();
        queueObj.insert('E');
        queueObj.print();
        System.out.println("\nOutput "+(queueObj.printCount + 1)+" => Queue Top: " +queueObj.queueTop()); queueObj.printCount++;
        System.out.print("Output "+(queueObj.printCount + 1)+" => Remove: " +queueObj.remove()); queueObj.printCount++;
        queueObj.print();
        System.out.print("\nOutput "+(queueObj.printCount + 1)+" => Final Size of Queue: " +queueObj.size()); queueObj.printCount++;
        
        
    }

}

