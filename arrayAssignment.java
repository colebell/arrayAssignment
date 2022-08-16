import java.util.ArrayList;

public class arrayAssignment {
    
    
    public static void main(String args[]) {
        
        //1. Write a program to sum all the values of a given Array in Java.
        
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(5);
        myList.add(4);
        myList.add(11);

        sumArray(myList); 
    
        //2. 
        double[ ] examplesArray = {1,5,6,5,4,1}; //index 2 is num 6 which is max

          double maximum = examplesArray[0]; //1

          int index = 0;

          for (int i = 1; i<examplesArray.length; i++){ //uterate thru array

               if (examplesArray[ i ] > maximum) { //if curr element is greater than current max

                    maximum = examplesArray[ i ]; //then set new max to curr element

                    index = i; //and identify the current max element is at index i

               }

          }

          System.out.println(index);
          //output is 2, which is the index of 6 (max element)
          
          
          
          
          /*
          3. Write a public static method called "toPower" that takes in as parameters two integers called size and power. 
          The method should return an array of size "size" with each array index raised to the value of "power." 
          So, for example, if we passed in "size = 4" and "power = 2" to the "toPower," 
          the method should return the following result: [0,1,4,9].
          */
          System.out.println("Answer #3: " + toPower(4,2));
          
          
    }
        
    
    /**
     *
     * #1 Write a program to sum all the values of a given Array in Java.
     */
    public static void sumArray(ArrayList<Integer> theList) {
        int x =0;    
        for (int i = 0; i < theList.size(); i++) {
                x = x + theList.get(i);
            }
        System.out.println("Answer #1: " + x);
    }
    
          /*
          3. Write a public static method called "toPower" that takes in as parameters two integers called size and power. 
          The method should return an array of size "size" with each array index raised to the value of "power." 
          So, for example, if we passed in "size = 4" and "power = 2" to the "toPower," 
          the method should return the following result: [0,1,4,9].
          */
    public static ArrayList<Integer> toPower(int size, int power) {
        ArrayList<Integer> myList = new ArrayList<>();
        int x;
        
        for (int i = 0; i < size; i++) {
            x = i;
            x = (int) Math.pow(x, power);
            myList.add(x);
        }
        
        return myList;
    }
    
}
