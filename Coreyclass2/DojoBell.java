import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class DojoBell {
    
    public void greeting(){
        System.out.println("welcome to dojo bell can  tae your order?");
    }
    public void greeting(String customer){
        Integer num = null;
        System.out.printf("welcome to dojobell, %s,can i take your order", customer);
    }

    //array
    public void makeArray(){
        int [] numArray = new int [10];
        System.out.println(Arrays.toString(numArray));

        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = i + 1;
        }

        System.out.println(Arrays.toString(numArray));
}

    //arraylist 
    public void makeOrderList(){
        ArrayList<String> orders = new ArrayList<String>();
        System.out.println(orders);

        orders.add("dojodegrande");
        orders.add("dojotaco");
        orders.add("dojopizza");
        orders.add("dojoSupreme");
        orders.add("dojosoda");

        System.out.println(orders);

        //orders.remove("dojopizza");
        System.out.println(orders);
        orders.remove(2);
        System.out.println(orders);
        System.out.println(orders.get(1));
        orders.set(3,"macho taco");
        System.out.println(orders.get(3));
        try{
            orders.set(4,"makeit fast");
        }
        catch (Exception e){
            System.out.println("somthing went wrong");

        }
        System.out.println(orders.size());



    }
    public void makeHash(){
        HashMap<String, Double> priceMap = new HashMap<>();

        priceMap.put("dojodegrande",3.4);
        priceMap.put("dojotaco",9.5);
        priceMap.put("dojopizza", 7.3);
        priceMap.put("dojoSupreme", 4.5);
        priceMap.put("dojosoda",6.76);

        
        for (String order : priceMap.keySet()) {
            
            System.out.printf("%s : %.2f%n", order, priceMap.get(order));
            
        }

        priceMap.remove("dojodegrande");
        System.out.println(priceMap);
        System.out.println("");
}
}