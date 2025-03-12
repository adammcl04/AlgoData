

import java.util.NoSuchElementException;

                       
/**A linked list is a sequence of nodes with efficient             
element insertion and removal. This class             
contains a subset of the methods of the standard             
java.util.LinkedList class.*/

public class LinkedList               
{
   private Node position;                  
   private Node previous;                  
   private Node first;
   private Node last; 
                             
   /** Constructs an empty linked list.*/                   
   public LinkedList()                  
   {                       
   first = null;
   last = null;

   }
   
   
/**      Returns the first element in the linked list.               
         @return the first element in the linked list               */                   
   public Object getFirst()                  
   {                       
   if (first == null)                         
   throw new NoSuchElementException();                     
   return first.data;                  
   }            
   public Object getLast()                  
   {                       
      if(last == first)                    
      return first.data;
      else
      {
         Node current = first;
         while (current.next != null) {
            current = current.next;
            last = current;
         }
         return last.data;
      }

   } 
   
/**       Removes the first element in the linked list.               
          @return the removed element               */                   
   public Object removeFirst()                  
   {                      
   if (first == null)                         
   throw new NoSuchElementException();                     
   Object element = first.data;                     
   first = first.next;                     
   return element;                  
   }    
      public void addLast(Object element)
      {
         Node newNode = new Node();
         newNode.data = element;
         newNode.next= null;
         // If the list is empty, the new node becomes the first node
         if (first == null) 
         {
            first = newNode;
         } 
         else {
         // Traverse the list to find the last node
         Node current = first;
         while (current.next != null) {
            current = current.next;
         }
         // Add the new node at the end
         current.next = newNode;
      }
      }     
/**   Adds an element to the front of the linked list.               
      @param element the element to add               */                   
      public void addFirst(Object element)                  
      {                       
      Node newNode = new Node();                     
      newNode.data = element;                     
      newNode.next = first;                     
      first = newNode;                  
      }
      
          
/**   Returns an iterator for iterating through this list.               
      @return an iterator for iterating through this list              */                   
      public ListIterator listIterator()                  
      {                       
      return new LinkedListIterator();                  
      }            
   private class Node                  
   {                       
   public Object data;                     
   public Node next;
   //public Node previous;                  
   }                                  
   
   private class LinkedListIterator implements ListIterator                  
   {                    
   /**      Constructs an iterator that points to the front                  
            of the linked list.                  */                      
            public LinkedListIterator()                    
            {                          
            position = null;                        
            previous = null;                     
            }            
            
         
/**         Moves the iterator past the next element.
            @return the traversed element                  */                       
            public Object next()                     
            {                          
            if (!hasNext())                           
            throw new NoSuchElementException();                        
            previous = position; 
            // Remember for remove                                             
               if (position == null)                           
               position = first;                        
               else                           
               position = position.next;                        
            return position.data;                     
            }
           
     
/**                  Tests if there is an element after the iterator position.
                   @return true if there is an element after the                   
                   // iterator position                  */                      
                   public boolean hasNext()                     
                   {                          
                      if (position == null)                           
                      return first != null;                        
                      else                           
                      return position.next != null;                     
                   }
                 
           
/**                  Adds an element before the iterator position                  
                     and moves the iterator past the inserted element.                  
                     @param element the element to add                  */                       
                     public void add(Object element)                     
                     {                          
                        if (position == null)                        
                        {                           
                        addFirst(element);                           
                        position = first;                        
                        }                        
                        else                        
                        {                             
                        Node newNode = new Node();                           
                        newNode.data = element;                           
                        newNode.next = position.next;                           
                        position.next = newNode;                           
                        position = newNode;                        
                        }                        
                     previous = position;                     
                     }
/**                  Removes the last traversed element. This method may                  
                     only be called after a call to the next() method.                  */                      
                     public void remove()                     
                     {                          
                        if (previous == position)                           
                        throw new IllegalStateException();                                             
                           if (position == first)                        
                           {                           
                           removeFirst();                        
                           }                        
                           else                         
                           {                             
                           previous.next = position.next;                        
                           }                         
                           position = previous;                     
                           }
/**                  Sets the last traversed element to a different value.
                     @param element the element to set                  */                      
                     public void set(Object element)                     
                     {                        
                        if (position == null)                           
                        throw new NoSuchElementException();                        
                     position.data = element;                     
                     }


                     public void search(Object element)
                     {
                        Object search = element;
                        
                        while(hasNext())
                        {
                           if(next() == element)
                           {
                              remove();
                              search = (int)search + 100;
                              search = (Object)search;
                              add(search);
                              

                           }
                           

                        }
                        
                        
                                                   
                     }
        }
        public static void main(String[] args) {
         System.out.print("Linked List data: ");
     
         
         LinkedList list = new LinkedList();
         ListIterator iterator = list.listIterator();
     
         //Part 1 --adding intial data
         iterator.add(11);
         iterator.add(22);
         iterator.add(33);
         iterator.add(44);
     
         //Print method for data
         iterator = list.listIterator(); 
         while (iterator.hasNext()) {
             System.out.print(iterator.next() + " ");
         }
         System.out.println();
     
         //Part 2 --adding "55" to first position
         list.addFirst("55");
         System.out.print("\nAdded Element to First: " + list.getFirst());
     
        
         System.out.print("\nLinked List data after adding first element: ");
         iterator = list.listIterator();
         while (iterator.hasNext()) {
             System.out.print(iterator.next() + " ");
         }
         System.out.println();

         //Part 3 -- adding "66" to the last position
         list.addLast(66);
         System.out.print("\nAdded Element to Last: 66");
         
         System.out.print("\nLinked List data : ");
         iterator = list.listIterator();
         while (iterator.hasNext()) {
             System.out.print(iterator.next() + " ");
         }
         System.out.println();

         //Part 4 -- Adding "99" to the 3rd postion
         iterator = list.listIterator();
             for(int i=0; i<2; i++)
             {
                iterator.next();
             }
         
         iterator.add(99);
         System.out.print("\nAdded Element to 3rd");

         System.out.print("\nLinked List data : ");
         
         iterator = list.listIterator();

         while (iterator.hasNext()) {
             System.out.print(iterator.next() + " ");
         }
         System.out.println();

         //Part 5 -- Showing the first and last element
         System.out.println("\nFirst Element: "+list.getFirst());
         System.out.println("Last Element: "+list.getLast());

         iterator = list.listIterator();
             for(int i=0; i<3; i++)
             {
                iterator.next();
             }
         

             
             
             System.out.println("\n4th Element: "+iterator.next());

             System.out.println("\nRemove First Element: "+list.removeFirst());

             System.out.print("Linked List data : ");
         
         iterator = list.listIterator();

         while (iterator.hasNext()) {
             System.out.print(iterator.next() + " ");
         }
         System.out.println();

         
         System.out.print("\nRemoving Last : "+list.getLast());
         
         iterator = list.listIterator();
         while(iterator.hasNext())
         {
            if(iterator.next() == list.getLast())
            {
               iterator.remove();
            }
         }
         
         System.out.print("\nLinked List data : ");
         iterator = list.listIterator();

         while (iterator.hasNext()) {
             System.out.print(iterator.next() + " ");
         }
         System.out.println();

         iterator = list.listIterator();
             for(int i=0; i<2; i++)
             {
                iterator.next();
             }
         
         iterator.remove();System.out.print("\nRemoving the 2nd element ");
         System.out.print("\nLinked List data : ");
         iterator = list.listIterator();

         while (iterator.hasNext()) {
             System.out.print(iterator.next() + " ");
         }
         System.out.println();


         iterator = list.listIterator();
         iterator.search(22);
         System.out.print("\nSearching List for Element, 100 will be addded to it if element is found: ");


         System.out.print("\nLinked List data : ");
         iterator = list.listIterator();

         while (iterator.hasNext()) {
             System.out.print(iterator.next() + " ");
         }
         System.out.println();

     }        
} 
