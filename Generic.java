import java.util.*;
class Generic
  {
     public static void main(String[] args)
        {
           List <Integer>l = new ArrayList<Integer>();   //  list interface and predefined class is  array list
            int x=10;        
           l.add(new Integer(x));//boxing technique
           l.add(600);
           l.add(90);
           l.add(3);
           l.add(21);
          // second part of program is iteration i.e., to print the list
           Iterator<Integer> itr = l.iterator(); // itr is an hand object used to print the list
           while(itr.hasNext())
               {
                  int y = itr.next(); // while loop to print all numbers
                   System.out.println(y);
                }
             for(int z:l)    // Advanced for loop or enhanced for loop  z:l = z in l another method for printing numbers in generic framework
              {
               System.out.println(z);
               }
            }
     }
      
 