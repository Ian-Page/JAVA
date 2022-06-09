import java.util.HashMap;
import java.util.Set;

public class HashMapFun {
    public static void main(String[] args){
        HashMap<String,String> userMap= new HashMap<String,String>();
        userMap.put("a@b.com","Spanky Spangler");
        userMap.put("c@d.com","Cellery Dork");
        userMap.put("e@f.com","Energy Funky");

        String name = userMap.get("a@b.com");
        System.out.println("the full name is " + name);

        Set<String> keys = userMap.keySet();
        for (String key : keys) {
            System.out.println(key);
            System.out.println(userMap.get(key));
        }
    }
}
