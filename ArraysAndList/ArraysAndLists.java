import java.util.ArrayList;


public class ArraysAndLists {

    public static void main (String[]args) {
        

        ArrayList<Integer> myList = new ArrayList<Integer>();
        
        myList.add(69);
        myList.add(96);
        
        //Getters and Setters
        Integer num = myList.get(0);
        System.out.println(num);
        myList.set(0,6969);
        System.out.println(myList);

        ArrayList<Object> things = new ArrayList<Object>();

        things.add(10);
        things.add("hello");
        things.add(new ArrayList<Integer>());
        things.add(12.5);
        System.out.println(things);



    }
    
}
